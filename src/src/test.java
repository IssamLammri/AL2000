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

		ArrayList<Client> Clients = issam.GetAllClients();

		DVD dvd = new DVD("love", true);
		Carte_Bleu CB = null;

		cal1.set(2022, 7, 21);
		Date uneDate2 = cal1.getTime();

		/*
		 * for (Client client : Clients) { System.out.println(client); }
		 */

		for (Client client : Clients) {
			if (client.getNom().equals("LAMMRI")) {
				System.out.println("premier test : ");
				CB = new Carte_Bleu("N0", client, 999, uneDate2, 100.0);
				client.Louer(dvd);
			}
		}

		for (Client client : Clients) {
			System.out.println(client);
		}

		Location test = new Location();

		ArrayList<Location> Locations = test.GetAllLocations();
		//test : test 2 
		// test 2 
		for (Location location : Locations) {
			System.out.println(location);
		}
	}

}
