package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Technicien extends Employe {

	private int num_tech;

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param num_tech
	 */
	public Technicien(String nom, String prenom, String adresse, int num_tech) {
		super(nom, prenom, adresse);
		this.num_tech = num_tech;
	}

	/**
	 * @return the num_tech
	 */
	public int getNum_tech() {
		return num_tech;
	}

	/**
	 * @param num_tech the num_tech to set
	 */
	public void setNum_tech(int num_tech) {
		this.num_tech = num_tech;
	}

	/**
	 * mettre à jour AL2000
	 */
	public void mise_a_jour() {

	}
	
	public ArrayList<Technicien> GetAllTechniciens() {
		ArrayList<Technicien> Listetechniciens = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("./Employes.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Listetechniciens = (ArrayList) ois.readObject();

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

		return Listetechniciens;
	}

	
	public String toString() {
		return "Technicien [Nom= " + getNom() + ", Prenom= " + getPrenom() + ", Adresse= " + getAdresse() + ", Numero Techn= " + num_tech +" ]";
		
	}

}
