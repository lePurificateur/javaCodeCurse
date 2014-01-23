package specifications;


/**
 * Cette classe est la racine &agrave; que la moulinette va utiliser.
 * Chacune de ces fonctions doit retourner une impl&eacute;mentation vous avez cr&eacute;&eacute;e pour
 * r&eacute;soudre les probl&egrave;mes de l'&eacute;nonc&eacute;.  
 *
 */
public interface Factory
{
	/**
	 * Retourne votre nom.
	 */
	
	public String getNom();
	
	/**
	 * Retourne une instance de votre impl&eacute;mentation de ChoiceOfThief.
	 */
	
	public ChoiceOfThief getChoiceOfThief();
	
	/**
	 * Retourne une instance de votre impl&eacute;mentation de WheelOfDeath.
	 */
	
	public WheelOfDeath getWheelOfDeath();
	
	/**
	 * Retourne une instance de votre impl&eacute;mentation de PathOfDoom. 
	 */
	
	public PathOfDoom getPathOfDoom();
	
	/**
	 * Retourne une instance de votre impl&eacute;menation de CursedTable. 
	 */
	
	public CursedTable getCursedTable();
}
