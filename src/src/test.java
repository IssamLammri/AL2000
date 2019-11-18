package src;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal1 = Calendar.getInstance();
		cal1.set(1997, 7, 21);
		Date uneDate1 = cal1.getTime();

		Client mohammed = new Client("DIB", "Mohammed", "14 Rue Capitaine Camine", uneDate1);
		Client issam = new Client("LAMMRI", "ISSAM", "14 Rue Capitaine Camine", uneDate1);

		issam.SerializableClients();

		mohammed.Sabonner();

		ArrayList<Object> Clients = issam.GetAllClients();

		// DVD dvd = new DVD("love", true);
		Carte_Bleu CB = null;

		cal1.set(2022, 7, 21);
		Date uneDate2 = cal1.getTime();

		/*
		 * for (Client client : Clients) { System.out.println(client); }
		 */

		/*
		 * for (Object client : Clients) { if (((Client)
		 * client).getNom().equals("LAMMRI")) { System.out.println("premier test : ");
		 * CB = new Carte_Bleu("N0", (Client) client, 999, uneDate2, 100.0); ((Client)
		 * client).Louer(dvd); ((Client) client).Rendre_DVD(dvd, 0); } }
		 */

		/*
		 * for (Object client : Clients) { if (client instanceof Abonne) {
		 * System.out.println("ABONNE"); if (((Abonne) client).getNom().equals("DIB")) {
		 * System.out.println("premier test Abonné : "); CB = new
		 * Carte_Bleu("N0",(Client) client, 999, uneDate2, 100.0); ((Abonne)
		 * client).Louer(dvd); ((Abonne) client).Rendre_DVD(dvd, 0); } } else {
		 * 
		 * }
		 * 
		 * }
		 */

		for (Object client : Clients) {
			System.out.println(client);
		}

		Location test = new Location();

		ArrayList<Location> Locations = test.GetAllLocations();

		for (Location location : Locations) {
			System.out.println(location);
		}

	}

}
