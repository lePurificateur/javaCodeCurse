package specifications;

/**
 * <P>
 * Le principe de la roue de la Mort est simple, vous tournez une roue sur laquelle sont inscrites des valeurs allant de 1 &agrave; range (<CODE>setRange()</CODE>), et vous gagnez 
 * la valeur sur laquelle la roue fini sa rotation. Vous pouvez relancer la roue autant de fois que vous le voulez, ajoutant &agrave; votre score le montant sur lequel la roue tombe. 
 * Et vous pouvez aussi vous arr&ecirc;ter, prendre votre butin (la somme des valeurs donn&eacute;es par la roue) et repartir avec. 
 * Malheureusement, il y a un prix &agrave; payer : une limite (<CODE>setLimit()</CODE>) est fix&eacute;e dans ce jeu, si vous la d&eacute;passez, vous perdrez tout ce que vous aurez gagn&eacute; depuis le 
 * d&eacute;but de la partie, et serez oblig&eacute; de repartir sans rien.
 * <P></P>
 * Si par exemple, votre score est de 5, que la la limite est 7 et que vous souhaitez rejouer alors que la roue contient des valeurs allant de 1 &agrave; 3, 
 * Vous aurez 2 chances sur 3 d'am&eacute;liorer votre score, et 1 chance sur 3 de de d&eacute;passer 7, perdant ainsi tous vos gains.
 * <P></P>
 * L'impl&eacute;mentation de cette interface est un algorithme d&eacute;cidant s'il est plus rentable de quitter le jeu, ou s'il faut prendre le risque de continuer, au risque de d&eacute;passer la limite. 
 * <CODE>setLimit(limit)</CODE> et <CODE>setRange(range)</CODE> pr&eacute;ciseront respectivement la limite &agrave; ne pas d&eacute;passer et la valeur maximale affich&eacute;e par la roue. La fonction 
 * <CODE>setLastResult(result)</CODE> sera appel&eacute;e &agrave; chaque fois que la roue sera lanc&eacute;e pour que la classe puisse conna&icirc;tre le score. La m&eacute;thode <CODE>playAgain()</CODE> 
 * retourne vrai s'il faut continuer &agrave; jouer, et faux s'il convient de s'arr&ecirc;ter. 
 * </P>
 */

public interface WheelOfDeath
{
	/**
	 * Pr&eacute;cise la limite &agrave; partir de laquelle le joueur perd tout. 
	 */
	
	public void setLimit(int limit);

	/**
	 * Pr&eacute;cise que la roue peut sortir des valeurs allant de 1 &agrave; range.
	 */
	public void setRange(int range);

	/**
	 * Informe le joueur de la derni&egrave;re valeur que la roue a sortie.
	 * @param result la derni&egrave;re valeur affich&eacute;e par la roue.
	 */
	public void setLastResult(int result);
	
	/**
	 * Retourne vrai s'il faut rejouer, faux s'il faut s'arr&ecirc;ter.
	 */
	public boolean playAgain();
}
