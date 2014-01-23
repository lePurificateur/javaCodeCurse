package alexandreMesle;

public class ChoiceOfThief implements specifications.ChoiceOfThief
{
	private int [] weights;
	private int first = -1, second = -1, nbStored = 0, limit, score = -1;
	
	private void setSolution(int i, int j)
	{
		int nouveau = weights[i] + weights[j];
		if (nouveau <= limit)
		{
			first = i;
			second = j;
			score = nouveau;
		}
	}
	private void update (int i, int j)
	{
		if (score != limit)
		{
			int nouveau = weights[i] + weights[j];
			if (score != -1)
			{
				int ancien = weights[first] + weights[second]; 
				if (nouveau > ancien)
					setSolution(i, j);
			}
			else
				setSolution(i, j);
		}
	}
	
	private void update(int j)
	{
		for (int i = 0 ; i < j ; i++)
			update(i, j);
	}
	
	@Override
	public void addObject(int weight)
	{
		weights[nbStored] = weight;
		update(nbStored);
		nbStored++;
	}

	@Override
	public void setNbObjects(int nbObjects)
	{
		weights = new int[nbObjects];		
	}

	@Override
	public int getFirstObject()
	{
		return first + 1;
	}

	@Override
	public int getSecondObject()
	{
		return second + 1;
	}

	@Override
	public void setLimit(int limit)
	{
		this.limit = limit;
	}
}
