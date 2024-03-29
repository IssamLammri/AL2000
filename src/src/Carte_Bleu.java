package src;

import java.io.Serializable;
import java.util.Date;

public class Carte_Bleu implements Serializable {

	private String N_Carte;
	private Client Titulaire_Carte;
	private int CVV;
	private Date Date_Experation;
	private double Montant;

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return Montant;
	}

	/**
	 * @param d the montant to set
	 */
	public void setMontant(double d) {
		Montant = d;
	}

	/**
	 * @param n_Carte
	 * @param titulaire_Carte
	 * @param cVV
	 * @param date_Experation
	 * @param montant
	 */
	public Carte_Bleu(String n_Carte, Client titulaire_Carte, int cVV, Date date_Experation, double montant) {
		super();
		N_Carte = n_Carte;
		Titulaire_Carte = titulaire_Carte;
		CVV = cVV;
		Date_Experation = date_Experation;
		Montant = montant;
		titulaire_Carte.setCB(this);
	}

	/**
	 * @return the n_Carte
	 */
	public String getN_Carte() {
		return N_Carte;
	}

	/**
	 * @param n_Carte the n_Carte to set
	 */
	public void setN_Carte(String n_Carte) {
		N_Carte = n_Carte;
	}

	/**
	 * @return the titulaire_Carte
	 */
	public Client getTitulaire_Carte() {
		return Titulaire_Carte;
	}

	/**
	 * @param titulaire_Carte the titulaire_Carte to set
	 */
	public void setTitulaire_Carte(Client titulaire_Carte) {
		Titulaire_Carte = titulaire_Carte;
	}

	/**
	 * @return the cVV
	 */
	public int getCVV() {
		return CVV;
	}

	/**
	 * @param cVV the cVV to set
	 */
	public void setCVV(int cVV) {
		CVV = cVV;
	}

	/**
	 * @return the date_Experation
	 */
	public Date getDate_Experation() {
		return Date_Experation;
	}

	/**
	 * @param date_Experation the date_Experation to set
	 */
	public void setDate_Experation(Date date_Experation) {
		Date_Experation = date_Experation;
	}

	@Override
	public String toString() {
		return "Carte_Bleu [N_Carte=" + N_Carte + ", CVV=" + CVV + ", Date_Experation=" + Date_Experation + ", Montant="
				+ Montant + "]";
	}

}
