package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	public static final ArrayList<Object> Clients = new ArrayList<>();

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param date_N
	 * @param cB
	 */
	public Client(String nom, String prenom, String adresse, Date date_N) {
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Date_N = date_N;
		CB = null;
		Clients.add(this);
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
		Clients.add(this);
	}

	/**
	 * @return the clients
	 */
	public ArrayList<Object> getClients() {
		return Clients;
	}

	/**
	 * Set Clients
	 */
	public void setClient(Client cl) {
		Clients.add(cl);
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
		System.out.println(dateFormat.format(date));
		if (this.FunctionTestAbon() == true) {
			if (function_NBLocationParClient() < 3) {
				if (Function_ExistFILMINAL20000(dvd)) {
					if (Function_MontantCarteBancaire()) {
						System.out.println("location pour cet abonné fini avec succés");
						Location Loc = new Location(date, null, false, 4, this, dvd);
						Loc.SerializableLocations();
					} else {
						System.out.println("Desolé, mais vous avez plus d'argent sur votre compte");
					}
				} else {
					System.out.println("Desolé, mais il y en plus , reviens plus tard");
				}
			} else {
				System.out.println("vous avez depassé le nombre maximal autorisée pour vos réservation ");
			}
		} else {
			if (function_NBLocationParClient() == 0) {
				if (Function_ExistFILMINAL20000(dvd)) {
					if (Function_MontantCarteBancaire()) {
						System.out.println("location pour cet client fini avec succés");
						Location Loc = new Location(date, null, false, 4, this, dvd);
						Loc.SerializableLocations();
					} else {
						System.out.println("Desolé, mais vous avez plus d'argent sur votre compte");
					}
				} else {
					System.out.println("Desolé, mais il y en plus , reviens plus tard");
				}
			} else {
				System.out.println("vous avez depassé le nombre maximal autorisée pour vos réservation ");
			}
		}
	}

	private boolean Function_MontantCarteBancaire() {
		if (this.CB.getMontant() > 5) {
			return true;
		}
		return false;
	}

	private ArrayList<DVD> GetAllDVDAL2000() {
		ArrayList<DVD> DVDAL2000 = new ArrayList<>();

		try {
			FileInputStream fis = new FileInputStream("./DVDAL2000.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			DVDAL2000 = (ArrayList) ois.readObject();

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
		return DVDAL2000;
	}

	private boolean FunctionTestAbon() {
		if (this instanceof Abonne) {
			return true;
		} else {
			return false;
		}
	}

	private boolean Function_ExistFILMINAL20000(DVD dvd) {
		if (dvd.isExiste())
			return true;
		else
			return false;
	}

	private int function_NBLocationParClient() {
		Location l = new Location();
		ArrayList<Location> Locations = l.getLocations();
		int Nb_LocationEncours = 0;

		if (Locations.size() != 0) {
			for (Location location : Locations) {
				if (location.getClient() == this) {
					if (location.getDate_Rendu() == null) {
						Nb_LocationEncours++;
					}
				}
			}
		}

		return 0;
	}

	/**
	 * @param fonction qui fait la location d'un film
	 */
	public void Sabonner() {
		// DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		Abonne ab = new Abonne(this.Nom, this.Prenom, this.Adresse, this.Date_N, this.CB, this.Nom + this.Prenom, date);
		Clients.remove(this);
		SerializableClients();
	}

	public void SerializableClients() {
		try {
			FileOutputStream fos = new FileOutputStream("./Clients.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Clients);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public ArrayList<Object> GetAllClients() {
		ArrayList<Object> Listes_Clients = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("./Clients.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Listes_Clients = (ArrayList) ois.readObject();

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

		return Listes_Clients;
	}

	/**
	 * @param fonction qui fait la recherche d'un film
	 */
	public void Rechercher(DVD dvd) {
		if (Function_ExistFILMINAL20000(dvd)) {
			System.out.println("OUPA , film trouvé ");
		} else {
			System.out.println("Desolé, mais le film que vous essayez de chercher n'est plus dans la liste");
		}
	}

	/**
	 * @param fonction qui rend le film dans l'AL2000
	 */
	public void Rendre_DVD(DVD dvd, int NumeroLoca) {
		Location l = new Location();
		ArrayList<Location> Locations = l.getLocations();
		for (Location location : Locations) {
			if (location.getNumero_Location() == NumeroLoca) {
				Date date = new Date();
				double prix = location.Calcule_Prix();
				location.setDate_Rendu(date);
				System.out.println("prix : " + this.CB.getMontant());
				this.CB.setMontant(this.CB.getMontant() - prix);
				location.SerializableLocations();
				// functionUpdateAL2000();
			}
		}
	}

	@Override
	public String toString() {
		SimpleDateFormat miseEnForme = new SimpleDateFormat("dd-MM-yyyy");
		return "Client [Nom=" + Nom + ", Prenom=" + Prenom + ", Adresse=" + Adresse + ", Date_N="
				+ miseEnForme.format(Date_N) + ", CB=" + CB + "]";
	}

}
