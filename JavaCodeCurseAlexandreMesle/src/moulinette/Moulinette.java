package moulinette;

import specifications.Factory;

import java.util.ArrayList;
import java.util.List;

/**<P>
 * Classe de test automatique de une ou plusieurs impl&eacute;mentations du Java Code Curse.
 * Le code suivant vous permet de tester votre code.</P>
<PRE>
Moulinette m = new Moulinette();
//Pour executer la moulinette, placez votre factory en parametre
m.addFactory(new alexandreMesle.Factory());
m.run();
</PRE><P>
Remplacez <CODE>new alexandreMesle.Factory()</CODE> par un objet impl&eacute;mentant <CODE>specifications.Factory</CODE></P>
 */

public class Moulinette
{
	private List<TestFactory> tests;
	
	public Moulinette()
	{
		tests = new ArrayList<TestFactory>();
	}
	
	public void addFactory(Factory factory)
	{
		tests.add(new TestFactory(factory));
	}
	
	private void addAllFactories()
	{
		addFactory(new alexandreMesle.Factory());
	}
	
	public void run()
	{
		for (TestFactory test : tests)
			test.run();
		System.out.println("******************************************\nResults : ");
		for (TestFactory test : tests)
			System.out.println("* " + test.getResult());
	}
	
	public static void main(String[] args)
	{
		Moulinette m = new Moulinette();
		m.addFactory(new alexandreMesle.Factory());		
		m.run();
	}
}
