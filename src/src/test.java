package src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(CB);

		Calendar cal1 = Calendar.getInstance();
		cal1.set(1997, 7, 21);
		Date uneDate1 = cal1.getTime();

		Client mohammed = new Client("DIB", "Mohammed", "14 Rue Capitaine Camine", uneDate1);
		Client issam = new Client("LAMMRI", "ISSAM", "14 Rue Capitaine Camine", uneDate1);

		ArrayList<Client> Clients = new ArrayList<>();
        
		Clients.add(mohammed);
		Clients.add(issam);
 
        try
        {
            FileOutputStream fos = new FileOutputStream("./Clients.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Clients);
            oos.close();
            fos.close();
        } 
        catch (IOException ioe) 
        
        {
            ioe.printStackTrace();
        }
		
		/*try
        {
            FileInputStream fis = new FileInputStream("./Clients.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            Clients = (ArrayList) ois.readObject();
 
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
         
        //Verify list data
        for (Client client : Clients) {
            System.out.println(client);
        }*/

	}

}
