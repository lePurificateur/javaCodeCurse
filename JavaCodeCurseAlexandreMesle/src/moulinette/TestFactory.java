package moulinette;

import java.util.ArrayList;
import java.util.List;

import specifications.Factory;

public class TestFactory
{
	private Factory factory;
	private List<TestCase> tests;
	private Note note;
	
	public TestFactory(Factory factory)
	{
		note = new Note();
		this.factory = factory;
		tests = new ArrayList<TestCase>();
		tests.add(new TestChoiceOfThief(factory));
		tests.add(new TestWheel(factory));
		tests.add(new TestPath(factory));
		tests.add(new TestTable(factory));
	}
	
	public void run()
	{
		System.out.println("************************************************\nNom = " 
				+ factory.getNom() + " : ");
		for (TestCase test : tests)
		{
			test.run();
			System.out.println("-> Note = " + test.getNote());
			note = note.add(test.getNote());
		}
		note.rescale(20);
		System.out.println("Tests finished, total = " + note);
	}
	
	public Note getNote()
	{
		return note;
	}

	public String getResult()
	{
			return factory.getNom() + " : " + getNote();
	}
}
