package specifications;

/**
 * <P>
 * Marcher dans le noir peut &ecirc;tre effrayant, non seulement parce qu'on ne sait pas o&ugrave; on va, mais surtout parce que retrouver le chemin de la 
 * sortie peut &ecirc;tre difficile. Le but du probl&egrave;me est ici de m&eacute;moriser un chemin parouru pour ensuite calculer le chemin permettant de faire demi-tour.
 * <P></P>
 * Nous utiliserons trois valeurs pour m&eacute;moriser le chemin parcouru : STRAIGHT pour un pas en avant, RIGHT pour pivoter d'un quart de tour sur la droite et 
 * LEFT pour pivoter d'un quart de tour sur la gauche. Le nombre d'&eacute;tapes parcourues sera pr&eacute;cis&eacute; lors d'un appel &agrave; la fonction <CODE>setLength(length)</CODE>. 
 * Ensuite, chaque &eacute;tape sera enregistr&eacute;e par un appel &agrave; <CODE>addStep(direction)</CODE>. Si par exemple, on fait deux pas en avant puis un pas vers la droite, 
 * il faudra appeler quatre fois la fonction <CODE>addStep(direction)</CODE>, avec les valeurs  <CODE>STRAIGHT, STRAIGHT, RIGHT, STRAIGHT</CODE>.
 * <P></P>
 * La fonction <CODE>path()</CODE> retournera un tableau contenant le chemin &agrave; parourir pour refaire le m&ecirc;me trajet en sens inverse. Par exemple, si le chemin parcouru est 
 * <CODE>STRAIGHT, LEFT, STRAIGHT, RIGHT, STRAIGHT, STRAIGHT</CODE>, il faudra pour sortir parcourir le chemin
 * <CODE>STRAIGHT, STRAIGHT, LEFT, STRAIGHT, LEFT, RIGHT</CODE>.
 * </P>
 */

public interface PathOfDoom
{
	/**
	 * Repr&eacute;sente un pas en avant
	 */
	
	public static final int STRAIGHT = 1; 
	
	/**
	 * Repr&eacute;sente un quart de tour vers la gauche.
	 */
	public static final int LEFT = 2;
	
	/**
	 * Repr&eacute;sente un quart de tour vers la droite.
	 */
	public static final int RIGHT = 3;
	
	/**
	 * Pr&eacute;cise le nombre d'&eacute;tapes. 
	 */
	public void setLength(int length);
	
	/**
	 * Ajoute une &eacute;tape.
	 * @param step STRAIGHT, LEFT ou RIGHT.
	 */
	public void addStep(int step);
	
	/**
	 * Le chemin vers la sortie. 
	 * @return un tableau contenant les &eacute;tapes &agrave; suivre pour revenir vers la sortie.
	 */
	public int[] path();
}
