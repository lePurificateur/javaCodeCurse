package lePurificateur;

public class CursedTable implements specifications.CursedTable
{
	private int[] x, y;
	private int nb = 0;
	
	@Override
	public void setNbGuests(int nbGuests)
	{
		x = new int[nbGuests/2];
		y = new int[nbGuests/2];
	}

	private int min(int i, int j)
	{
		return (i < j) ? i : j;
	}
	
	private int max(int i, int j)
	{
		return - min ( -i, -j);
	}
	
	@Override
	public void addToast(int guest1, int guest2)
	{
		x[nb] = min(guest1, guest2);
		y[nb] = max(guest1, guest2);
		nb++;
	}

	private boolean xor(boolean a, boolean b)
	{
		return a && !b || !a && b;
	}
	
	private boolean belongs(int a, int inf, int sup)
	{
		return inf < a && a < sup;
	}
	
	private boolean cross(int i, int j)
	{
		return xor(belongs(x[i], x[j], y[j]), belongs(y[i], x[j], y[j]));
	}
	
	@Override
	public int getNbCrossings()
	{
		int nbCross = 0;
		for (int i = 0 ; i < nb - 1; i++)
			for(int j = i + 1 ;j < nb ; j++ )
				nbCross += (cross(i, j))? 1 : 0;
		return nbCross;
	}

}
