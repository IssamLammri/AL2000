package src;

import java.util.Date;

public class Location {
	private int numero_Location;
	private Date Date_Location;
	private Date Date_Rendu;
	private boolean Abonne;
	private int Prix_Location;
	private Abonne Abo;
	private DVD dvd;

	/**
	 * @param numero_Location
	 * @param date_Location
	 * @param date_Rendu
	 * @param abonne
	 * @param prix_Location
	 */
	public Location(Date date_Location, Date date_Rendu, boolean abonne, int prix_Location, Abonne abon, DVD dvd_l) {
		this.numero_Location = 1;
		Date_Location = date_Location;
		Date_Rendu = date_Rendu;
		Abonne = abonne;
		Prix_Location = prix_Location;
		Abo = abon;
		dvd = dvd_l;
	}

	/**
	 * @return the numero_Location
	 */
	public int getNumero_Location() {
		return numero_Location;
	}

	/**
	 * @param numero_Location the numero_Location to set
	 */
	public void setNumero_Location(int numero_Location) {
		this.numero_Location = numero_Location;
	}

	/**
	 * @return the date_Location
	 */
	public Date getDate_Location() {
		return Date_Location;
	}

	/**
	 * @param date_Location the date_Location to set
	 */
	public void setDate_Location(Date date_Location) {
		Date_Location = date_Location;
	}

	/**
	 * @return the date_Rendu
	 */
	public Date getDate_Rendu() {
		return Date_Rendu;
	}

	/**
	 * @param date_Rendu the date_Rendu to set
	 */
	public void setDate_Rendu(Date date_Rendu) {
		Date_Rendu = date_Rendu;
	}

	/**
	 * @return the abonne
	 */
	public boolean isAbonne() {
		return Abonne;
	}

	/**
	 * @param abonne the abonne to set
	 */
	public void setAbonne(boolean abonne) {
		Abonne = abonne;
	}

	/**
	 * @return the prix_Location
	 */
	public int getPrix_Location() {
		return Prix_Location;
	}

	/**
	 * @param prix_Location the prix_Location to set
	 */
	public void setPrix_Location(int prix_Location) {
		Prix_Location = prix_Location;
	}

	/**
	 * @return the abo
	 */
	public Abonne getAbo() {
		return Abo;
	}

	/**
	 * @param abo the abo to set
	 */
	public void setAbo(Abonne abo) {
		Abo = abo;
	}

	/**
	 * @return the dvd
	 */
	public DVD getDvd() {
		return dvd;
	}

	/**
	 * @param dvd the dvd to set
	 */
	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}
	
}
