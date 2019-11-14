package src;

public class Carte_Abonnement {

	private String Id_Carte;
	private String Genre;
	private String Montant;

	/**
	 * @param id_Carte
	 * @param genre
	 * @param montant
	 */
	public Carte_Abonnement(String id_Carte, String genre, String montant) {
		super();
		Id_Carte = id_Carte;
		Genre = genre;
		Montant = montant;
	}

	/**
	 * @return the id_Carte
	 */
	public String getId_Carte() {
		return Id_Carte;
	}

	/**
	 * @param id_Carte the id_Carte to set
	 */
	public void setId_Carte(String id_Carte) {
		Id_Carte = id_Carte;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return Genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		Genre = genre;
	}

	/**
	 * @return the montant
	 */
	public String getMontant() {
		return Montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(String montant) {
		Montant = montant;
	}

}
