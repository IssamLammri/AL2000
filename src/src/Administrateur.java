package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Administrateur extends Employe{
	
	private String cle;

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param cle
	 */
	public Administrateur(String nom, String prenom, String adresse, String cle) {
		super(nom, prenom, adresse);
		this.cle = cle;
	}

	/**
	 * @return the cle
	 */
	public String getCle() {
		return cle;
	}

	/**
	 * @param cle the cle to set
	 */
	public void setCle(String cle) {
		this.cle = cle;
	}
	
	/**
	 * 	
	 */
	public void consulter_Statistique() {
		
	}
	
	public ArrayList<Administrateur> GetAllAdmins() {
		ArrayList<Administrateur> ListeAdmins = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("./Employes.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ListeAdmins = (ArrayList) ois.readObject();

			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}

		return ListeAdmins;
	}
	public String toString() {
		return "Administrateur [Nom= " + getNom() + ", Prenom= " + getPrenom() + ", Adresse= " + getAdresse() + ", Cle= " + cle +" ]";
		
	}

	


	

}
