package moulinette;

import specifications.Factory;
import specifications.PathOfDoom;
import static specifications.PathOfDoom.*;


public class TestPath extends TestCase
{
	public TestPath(Factory factory)
	{
		super(factory);
	}

	private void testPath(int... path)
	{
		System.out.print(" * ");
		try
		{
			PathOfDoom p = getFactory().getPathOfDoom();
			p.setLength(path.length);
			for (int i = 0 ; i < path.length ; i++)
				p.addStep(path[i]);
			int [] res = p.path();
			int i = 0, j = path.length - 1;
			boolean good = true;
			String message = "";
			while(j >= 0 && good)
			{
				good = (res [j]>=STRAIGHT && res[j] <= RIGHT) && 
					(path[i] == STRAIGHT && res [j] == STRAIGHT 
						|| path[i] == LEFT && res [j] == RIGHT
								|| path[i] == RIGHT && res [j] == LEFT);
				if (!good)
					message = "error found at index " + j;
				i++;
				j--;
			}
			getNote().stepNote(good, message);
		}
		catch(Exception e)
		{
			getNote().stepNote(e);
		}
	}
	
	@Override
	public void run()
	{
		System.out.println("Testing Path of Doom : ");
		testPath(STRAIGHT, LEFT, LEFT, STRAIGHT, RIGHT, STRAIGHT, LEFT);
		testPath(STRAIGHT, STRAIGHT, STRAIGHT);
		testPath(RIGHT, RIGHT, LEFT, RIGHT);
		int [] tab = new int[50000];
		for (int i = 0 ; i < 50000 ; i++)
			tab[i] = i%3 + 1;
		testPath(tab);
		tab = new int[1000000];
		for (int i = 0 ; i < 1000000 ; i++)
			tab[i] = i%3 + 1;
		testPath(tab);
		getNote().rescale(5);
	}
}
