package moulinette;

import specifications.ChoiceOfThief;
import specifications.Factory;

public class TestChoiceOfThief extends TestCase
{
	
	public TestChoiceOfThief(Factory factory)
	{
		super(factory);
	}

	private void runChoiceOfThief(int limit, int expectedResult, int... weights) 
	{
		System.out.print(" * ");
		try
		{
			ChoiceOfThief c = getFactory().getChoiceOfThief();	
			c.setNbObjects(weights.length);
			c.setLimit(limit);
			for (int i = 0 ; i < weights.length ; i++)
				c.addObject(weights[i]);
			int weight = weights[c.getFirstObject() -1] + weights[c.getSecondObject() -1];
			if (c.getFirstObject() == c.getSecondObject())
				getNote().stepNote(false, "Returned twice the same object : " + c.getFirstObject() + ".");
			else
				getNote().stepNote(weight == expectedResult, "Returned weight is " + weight + 
					" instead of " + expectedResult + ".");
		}
		catch(Exception e)
		{
			getNote().stepNote(e);
		}
	}
	

	@Override
	public void run()
	{
		System.out.println("Testing choice of thief : ");
		runChoiceOfThief(2, 2, 2, 1, 1);
		runChoiceOfThief(10, 9, 4, 4, 15, 14, 5, 24);
		runChoiceOfThief(100, 100, 3, 1, 98, 2);
		runChoiceOfThief(99, 97, 5, 400, 500, 140, 50, 47);
		int[] t = new int[10000];
		for (int i = 1 ; i <= 9999 ; i++)
			t[i-1] = i/2;
		t[9999] = 10000;
		runChoiceOfThief(10001, 10001, t);
	}
}
