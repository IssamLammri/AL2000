package src;

import java.util.Date;

public class Abonne extends Client {

	private int ID_Abonne;
	private String Password;
	private int NB_location;
	private Date Date_Abonment;
	private string bba;

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param date_N
	 * @param cB
	 * @param iD_Abonne
	 * @param password
	 * @param nB_location
	 * @param date_Abonment
	 */
	public Abonne(String nom, String prenom, String adresse, Date date_N, Carte_Bleu cB, int iD_Abonne, String password,
			int nB_location, Date date_Abonment) {
		super(nom, prenom, adresse, date_N, cB);
		ID_Abonne = iD_Abonne;
		Password = password;
		NB_location = nB_location;
		Date_Abonment = date_Abonment;
	}

	/**
	 * @return the iD_Abonne
	 */
	public int getID_Abonne() {
		return ID_Abonne;
	}

	/**
	 * @param iD_Abonne the iD_Abonne to set
	 */
	public void setID_Abonne(int iD_Abonne) {
		ID_Abonne = iD_Abonne;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * @return the nB_location
	 */
	public int getNB_location() {
		return NB_location;
	}

	/**
	 * @param nB_location the nB_location to set
	 */
	public void setNB_location(int nB_location) {
		NB_location = nB_location;
	}

	/**
	 * @return the date_Abonment
	 */
	public Date getDate_Abonment() {
		return Date_Abonment;
	}

	/**
	 * @param date_Abonment the date_Abonment to set
	 */
	public void setDate_Abonment(Date date_Abonment) {
		Date_Abonment = date_Abonment;
	}

}
