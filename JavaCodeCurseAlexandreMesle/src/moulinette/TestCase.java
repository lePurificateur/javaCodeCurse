package moulinette;

import specifications.Factory;

public abstract class TestCase
{
	private Factory factory;
	private Note note;
	
	public TestCase(Factory factory)
	{
		super();
		note = new Note();
		this.factory = factory;
	}

	public Factory getFactory()
	{
		return factory;
	}

	public Note getNote()
	{
		return note;
	}

	public abstract void run();
}
