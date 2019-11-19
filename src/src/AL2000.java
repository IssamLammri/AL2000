package src;

import java.io.Serializable;
import java.util.ArrayList;

public class AL2000 implements Serializable {
	
	private int num_machine;
	private String ville;
	private String Adresse;
	public ArrayList<DVD> dvds=new ArrayList<>();
	public int nbrDVDmax=100;
	
	public AL2000(int num_machine, String ville, String adresse, ArrayList<DVD> dvds) {
		super();
		this.num_machine = num_machine;
		this.ville = ville;
		Adresse = adresse;
		this.dvds = dvds;
	}
	
	/**
	 * @return the num_machine
	 */
	public int getNum_machine() {
		return num_machine;
	}

	/**
	 * @param num_machine the num_machine to set
	 */
	public void setNum_machine(int num_machine) {
		this.num_machine = num_machine;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
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
	 * @return the dvds
	 */
	public ArrayList<DVD> getDvds() {
		return dvds;
	}

	/**
	 * @param dvds the dvds to set
	 */
	public void setDvds(ArrayList<DVD> dvds) {
		this.dvds = dvds;
	}

	public void debiterNbrDvds(DVD dvdAlouer) {
		int i=0;
		boolean trouve=false;
		while(i<dvds.size()&& trouve==false) {
			if(dvds.get(i).getTitre_Film()==dvdAlouer.getTitre_Film()) {
				dvds.get(i).setNbrDVD(dvds.get(i).nbrDVD-1);
				trouve=true;
			}
			i++;
		}
	}
	
}
