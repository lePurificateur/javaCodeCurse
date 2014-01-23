package lePurificateur;

public class PathOfDoom implements specifications.PathOfDoom
{
	private int[] path;
	private int nbSteps = 0;
	
	@Override
	public void setLength(int length)
	{
		path = new int[length];	
	}

	@Override
	public void addStep(int step)
	{
		path[nbSteps++] = step;		
	}

	private void swap(int i, int j)
	{
		int temp = path[i];
		path[i] = path[j];
		path[j] = temp;
	}
	
	private void reversePath()
	{
		int i = 0, j = nbSteps - 1;
		while(i < j)
		{
			swap(i, j);
			i++;
			j--;
		}
	}
	
	private void swapDirections()
	{
		for (int i = 0 ; i < nbSteps ; i++)
		{
			switch (path[i])
			{
				case RIGHT : path[i] = LEFT; break;
				case LEFT : path[i] = RIGHT ; break;
				default : break;
			}
		}
	}
	
	@Override
	public int[] path()
	{
		reversePath();
		swapDirections();
		return path;
	}

}
