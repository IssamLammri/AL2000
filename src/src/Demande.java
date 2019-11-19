package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Demande implements Serializable {
	
	private int numDemande;
    DVD dev;
    
    public ArrayList<Demande> GetAllDemandes() {
		ArrayList<Demande> Listes_Demandes = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("./Demandes.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Listes_Demandes = (ArrayList) ois.readObject();

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
		return Listes_Demandes;
	}
}
