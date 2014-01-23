package specifications;

/**
 * <P>
 * Un voleur, avant de partir souhaite emporter avec lui deux objets, il ne peut pas en prendre plus, et les
 * poids cumul&eacute;s de ces objets ne peut pas exc&eacute;der une certaine limite. Les valeurs des
 * objets sont proportionnelles &agrave; leur poids, le voleur va douc vouloir emmener des objets les plus lourds possible. 
 * Le probl&egrave;me est donc de d&eacute;terminer, parmi les objets qu'il a &agrave; sa disposition, lesquels il doit emporter pour maximiser son butin sans d&eacute;passer la limite. 
 * <P></P>
 * La m&eacute;thode <CODE>setNbObject(nbObject)</CODE> pr&eacute;cise le nombre d'objets pr&eacute;sents sur les lieux. La m&eacute;thode <CODE>setLimit(limit)</CODE> indique quel 
 * est le poids maximal que peut transporter le voleur. 
 * <CODE>addObject(weight)</CODE> pr&eacute;cise le poids d'un objet. Lors du premier appel &agrave; <CODE>addObject(weight)</CODE>, on 
 * passe en param&egrave;tre le poids du premier objet (celui d'indice 1), lors du deuxi&egrave;me appel, on passe en param&egrave;tre le poids du deuxi&egrave;me objet et ainsi de suite. 
 * <CODE>AddObject</CODE> est donc appell&eacute;e <CODE>nbObject</CODE> fois.
 * <P></P>
 * Une fois tous les donn&eacute;es du probl&egrave;me pr&eacute;cis&eacute;s, les m&eacute;thodes <CODE>getFirstObject()</CODE> et <CODE>getSecondObject()</CODE> permettent &agrave; l'utilisateur de la classe de r&eacute;cup&eacute;rer la solution. 
 * Les indices des objets &agrave; emporter doivent &ecirc;tre retourn&eacute;s par ces deux fonctions. <CODE>getFirstObject()</CODE> retourne le plus petit des indices et <CODE>getSecondObject()</CODE> retourne 
 * le plus grand des deux. 
 * </P>  
 */

public interface ChoiceOfThief
{
	/**
	 * D&eacute;termine le nombre d'objets.
	 */
	
	public void setNbObjects(int nbObjects);
	
	/**
	 * Ajoute le poids d'un objet &agrave; la liste, le premier est d'indice 1.
	 * @param weight le poids &agrave; sp&eacute;cifier
	 */
	
	public void addObject(int weight);
	
	/**
	 * Sp&eacute;cifie le poids maximal que le voleur peut transporter. 
	 */
	
	public void setLimit(int limit);

	/**
	 * Retourne l'indice du premier objet &agrave; emmener. La valeur retourn&eacute;e doit &ecirc;tre inf&eacute;rieure 
	 * &agrave; celle de getSecondObject.
	 */
	
	public int getFirstObject();

	/**
	 * Retourne l'indice du second objet &agrave; emmener. La valeur retourn&eacute;e doit &ecirc;tre sup&eacute;rieure 
	 * &agrave; celle de getFirstObject.
	 */

	public int getSecondObject();
}
