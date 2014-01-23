package specifications;

/**
 * <P>
 * La derni&egrave;re fois que des convives se sont r&eacute;unis autour de la table maudite, les plus superstitieux d'entre eux remarqu&egrave;rent qu'il serait une fort 
 * mauvaise id&eacute;e de croiser les verres autour de cette table. Et que plus il y aura de croisements &agrave; chaque toast, plus cela leur portera la poisse. 
 * <P></P>
 * Nous repr&eacute;sentons la table comme un cercle autour duquel les invit&eacute;s seront install&eacute;s.
 * la personne num&eacute;ro 1 a &agrave; sa droite la personne num&eacute;ro 2, qui elle-m&ecirc;me a &agrave; sa droite la num&eacute;ro 3 et ainsi de suite.
 * La derni&egrave;re persone de la table a &agrave; sa droite la personne num&eacute;ro 1. 
 * <P></P>
 * Si les personnes num&eacute;ros 1 et 2 trinquent pendant que les num&eacute;ros 3 et 4 trinquent, aucun croisement ne se produit.
 * Mais si 1 et 3 trinquent en m&ecirc;me temps que 2 et 4, leurs verres se croisent.     
 * <P></P>
 * Le but de ce exercice est de d&eacute;terminer le nombre de croisements. Le nombre de personnes autour de la table sera pr&eacute;cis&eacute; par un appel &agrave; la fonction 
 * <CODE>setNbguests()</CODE>. Les couples de personnes trinquant seront ajout&eacute;es par des appels &agrave; la fonction <CODE>addToast(guest1, guest2)</CODE>, 
 * un appel signifiant que guest1 est en train de trinquer avec <CODE>guest2</CODE>. La fonction <CODE>getNbCrossings()</CODE> permettra au programme 
 * de test de r&eacute;cup&eacute;rer le nombre de croisements.  
 * </P>
 */

public interface CursedTable
{
	/**
	 * D&eacute;termine le nombre d'invit&eacute;s autour de la table.
	 * @param nbGuests le nombre d'invit&eacute;s.
	 */
	
	public void setNbGuests(int nbGuests);
	
	/**
	 * Pr&eacute;cise que l'invit&eacute; d'indice guest1 est en train de trinquer avec l'invit&eacute; d'indice guest2.
	 * @param guest1 l'indice d'un invit&eacute; en train de trinquer
	 * @param guest2 l'indice de l'invit&eacute; en train de trinquer avec l'invit&eacute; d'indice quest1.
	 */
	
	public void addToast(int guest1, int guest2);
	
	/**
	 * Retourne le nombre de croisements.
	 * @return le nombre de croisements.
	 */
	
	public int getNbCrossings();
}
