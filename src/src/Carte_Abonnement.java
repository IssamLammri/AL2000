package src;

import java.util.ArrayList;

public class Carte_Abonnement {

	private String Id_Carte;
	ArrayList<String> Genre;
	private double Montant;

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
	public ArrayList<String> getGenre() {
		return Genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(ArrayList<String> genre) {
		Genre = genre;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return Montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		Montant = montant;
	}

}
