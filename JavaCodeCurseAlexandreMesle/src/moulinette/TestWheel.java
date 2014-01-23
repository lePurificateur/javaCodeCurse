package moulinette;

import java.util.Random;

import specifications.Factory;
import specifications.WheelOfDeath;

public class TestWheel extends TestCase
{

	public TestWheel(Factory factory)
	{
		super(factory);
	}

	private static int abs(int i)
	{
		return (i>=0)? i : -i;
	}
	
	private void testWheel(int limit, int range)
	{
		Random r = new Random();
		try
		{
			WheelOfDeath w = getFactory().getWheelOfDeath();
			w.setLimit(limit);
			w.setRange(range);
			double score = 0;
			while(w.playAgain() && score <= limit)
			{
				int rand = abs(r.nextInt())%range + 1;
				w.setLastResult(rand);
				score += rand;
			}
			System.out.print(score);
			if (score == 0 || score > limit)
			{
				System.out.print(" -> YOU LOSE !");
				score = 0;
			}
			System.out.print(", ");
			getNote().stepNote(score/limit);
		}
		catch(Exception e)
		{
			getNote().stepNote(e);			
		}
	}
	
	private void testWheels(int nbTests, int limit, int range)
	{
		System.out.println(" * limit = " + limit + ", range = 1 to " + range + " : ");
		for (int i = 0 ; i < nbTests ; i++)
			testWheel(limit, range);
		System.out.println();
	}

	@Override
	public void run()
	{
		System.out.println("Testing wheel of death : ");
		int nbTests = 20;
		testWheels(nbTests, 50, 2);
		testWheels(nbTests, 10, 10);
		testWheels(nbTests, 500, 1000);
		testWheels(nbTests, 2, 2);
		testWheels(nbTests, 10, 5);
		testWheels(nbTests, 4, 2);
		testWheels(nbTests, 10, 7);
		testWheels(nbTests, 500, 250);
		testWheels(nbTests, 10000, 3000);
		testWheels(nbTests, 1000000, 400000);
		getNote().rescale(5);
	}

}
