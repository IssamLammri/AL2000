package src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Employe implements Serializable {

	private String nom;
	private String prenom;
	private String adresse;
	public static final ArrayList<Employe> employs=new ArrayList<>();

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Employe(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void SerializableEmploys() {
		try {
			FileOutputStream fos = new FileOutputStream("./Employes.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employs);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public String toString() {
		return "Employe [Nom= " + getNom() + ", Prenom= " + getPrenom() + ", Adresse= " + getAdresse() + " ]";
		
	}

}
