package alexandreMesle;

public class Factory implements specifications.Factory
{
	@Override
	public ChoiceOfThief getChoiceOfThief()
	{
		return new ChoiceOfThief();
	}
	
	@Override
	public String getNom()
	{
		return "Alexandre Meslé";
	}

	@Override
	public WheelOfDeath getWheelOfDeath()
	{
		return new WheelOfDeath();
	}

	@Override
	public PathOfDoom getPathOfDoom()
	{
		return new PathOfDoom();
	}

	@Override
	public CursedTable getCursedTable()
	{
		return new CursedTable();
	}
}
