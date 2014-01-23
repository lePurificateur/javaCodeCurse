package alexandreMesle;

public class WheelOfDeath implements specifications.WheelOfDeath
{
	private double limit, range, score;
	
	@Override
	public void setLimit(int limit)
	{
		this.limit = limit;
	}

	@Override
	public void setRange(int range)
	{
		this.range = range;	
	}

	@Override
	public void setLastResult(int result)
	{
		score += result;
	}

	private double gap()
	{
		return limit - score;
	}
	
	private double esperance()
	{
		return gap()/range*(score + (gap() + 1)/2);
	}
	
	@Override
	public boolean playAgain()
	{
		return gap() > range || esperance() > score;
	}

}
