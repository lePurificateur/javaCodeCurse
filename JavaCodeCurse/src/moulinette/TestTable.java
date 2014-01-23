package moulinette;

import specifications.CursedTable;
import specifications.Factory;

public class TestTable extends TestCase
{

	public TestTable(Factory factory)
	{
		super(factory);
	}

	private void testCursedTable(int nbGuests, int expectedResult, int[] x, int[] y)
	{
		System.out.print(" * ");
		try
		{
			CursedTable c = getFactory().getCursedTable();
			c.setNbGuests(nbGuests);
			for (int i = 0 ; i < x.length ; i++)
				c.addToast(x[i], y[i]);
			int nbC = c.getNbCrossings();
			getNote().stepNote(expectedResult == nbC, "function has returned " + nbC + " instead of " + expectedResult);
		}
		catch(Exception e)
		{
			getNote().stepNote(e);
		}
	}
	
	@Override
	public void run()
	{
		System.out.println("Testing cursed table : ");
		int[] x = {1, 3};
		int[] y = {4, 7};
		testCursedTable(8, 1, x, y);
		y[0] = 2;
		testCursedTable(8, 0, x, y);
		x = new int[]{1, 2, 3};
		y = new int[]{4, 5, 6};
		testCursedTable(6, 3, x, y);
		x = new int[]{1, 2, 3, 4, 5, 6, 7};
		y = new int[]{8, 9, 10, 11, 12, 13, 14};
		testCursedTable(14, 21, x, y);
		x = new int[]{10, 20, 30, 70, 120, 130, 140, 160};
		y = new int[]{40, 50, 60, 110, 80, 90, 100, 150};
		testCursedTable(160, 9, x, y);
	}
}
