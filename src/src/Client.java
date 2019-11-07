package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author FLOWBID
 *
 */

public class Client implements Serializable {
	private String Nom;
	private String Prenom;
	private String Adresse;
	private Date Date_N;
	private Carte_Bleu CB;

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param date_N
	 * @param cB
	 */
	public Client(String nom, String prenom, String adresse, Date date_N) {
		super();
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Date_N = date_N;
		CB = null;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param date_N
	 * @param cB
	 */
	public Client(String nom, String prenom, String adresse, Date date_N, Carte_Bleu cB) {
		super();
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Date_N = date_N;
		CB = cB;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return Prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return Adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	/**
	 * @return the date_N
	 */
	public Date getDate_N() {
		return Date_N;
	}

	/**
	 * @param date_N the date_N to set
	 */
	public void setDate_N(Date date_N) {
		Date_N = date_N;
	}

	/**
	 * @return the cB
	 */
	public Carte_Bleu getCB() {
		return CB;
	}

	/**
	 * @param cB the cB to set
	 */
	public void setCB(Carte_Bleu cB) {
		CB = cB;
	}

	/**
	 * @param fonction qui fait la location d'un film
	 */
	public void Louer(DVD dvd) {
		/*
		 * Tout d'abord on commence par tester combien de location faite par ce client à
		 * cet date (interagir avec le fichier des locations pour en savoir) Si le cas
		 * où ce client à moins strictement de 3 location à ce jour on interagit avec la
		 * machine AL20000 pour voir si le film est disponible Si c'est le cas on fait
		 * la réservation Sinon le cas échéant.
		 * 
		 */
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		ArrayList<Location> Locations = new ArrayList<>();
		
		try
        {
            FileInputStream fis = new FileInputStream("./Clients.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            Locations = (ArrayList) ois.readObject();
 
            ois.close();
            fis.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return;
        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
		
		/*for (Location location : Locations) {
			if(location.getAbo().get)
		}*/
	}

	/**
	 * @param fonction qui fait la location d'un film
	 */
	public void Sabonner() {
		System.out.println("null");
	}

	/**
	 * @param fonction qui fait la recherche d'un film
	 */
	public void Rechercher() {
		System.out.println("null");
	}

	/**
	 * @param fonction qui rend le film dans l'AL2000
	 */
	public void Rendre_DVD() {
		System.out.println("null");
	}

	@Override
	public String toString() {
		SimpleDateFormat miseEnForme = new SimpleDateFormat("dd-MM-yyyy");
		return "Client [Nom=" + Nom + ", Prenom=" + Prenom + ", Adresse=" + Adresse + ", Date_N="
				+ miseEnForme.format(Date_N) + ", CB=" + CB + "]";
	}

}
