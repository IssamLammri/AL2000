/**
 * 
 * @author FLOWBID
 *
 */

package src;

import java.util.Date;
import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;

public class Film implements Serializable {
	private String Titre_Film;

	private ArrayList<String> Acteurs;
	private ArrayList<String> Realisateur;
	private Time Duree;
	private ArrayList<String> Genre;
	private int Note;
	private String Nationalite;
	private Date Date_Sortie;
	private int Quantite;
	//12345

	/**
	 * @param titre_Film
	 * @param acteurs
	 * @param realisateur
	 * @param duree
	 * @param genre
	 * @param note
	 * @param nationalite
	 * @param date_Sortie
	 * @param quantite
	 */
	public Film(String titre_Film, ArrayList<String> acteurs, ArrayList<String> realisateur, Time duree,
			ArrayList<String> genre, int note, String nationalite, Date date_Sortie, int quantite) {
		super();
		Titre_Film = titre_Film;
		Acteurs = acteurs;
		Realisateur = realisateur;
		Duree = duree;
		Genre = genre;
		Note = note;
		Nationalite = nationalite;
		Date_Sortie = date_Sortie;
		Quantite = quantite;
	}

	/**
	 * @return the titre_Film
	 */
	public String getTitre_Film() {
		return Titre_Film;
	}

	/**
	 * @param titre_Film the titre_Film to set
	 */
	public void setTitre_Film(String titre_Film) {
		Titre_Film = titre_Film;
	}

	/**
	 * @return the acteurs
	 */
	public ArrayList<String> getActeurs() {
		return Acteurs;
	}

	/**
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(ArrayList<String> acteurs) {
		Acteurs = acteurs;
	}

	/**
	 * @return the realisateur
	 */
	public ArrayList<String> getRealisateur() {
		return Realisateur;
	}

	/**
	 * @param realisateur the realisateur to set
	 */
	public void setRealisateur(ArrayList<String> realisateur) {
		Realisateur = realisateur;
	}

	/**
	 * @return the duree
	 */
	public Time getDuree() {
		return Duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(Time duree) {
		Duree = duree;
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
	 * @return the note
	 */
	public int getNote() {
		return Note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(int note) {
		Note = note;
	}

	/**
	 * @return the nationalite
	 */
	public String getNationalite() {
		return Nationalite;
	}

	/**
	 * @param nationalite the nationalite to set
	 */
	public void setNationalite(String nationalite) {
		Nationalite = nationalite;
	}

	/**
	 * @return the date_Sortie
	 */
	public Date getDate_Sortie() {
		return Date_Sortie;
	}

	/**
	 * @param date_Sortie the date_Sortie to set
	 */
	public void setDate_Sortie(Date date_Sortie) {
		Date_Sortie = date_Sortie;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return Quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		Quantite = quantite;
	}

}
