package src;

import java.io.Serializable;

public class DVD implements Serializable {

	private String Titre_Film;
	private boolean Existe;
	public int nbrDVD;
	
	public DVD(String titre_Film, boolean existe, int nbrDVD) {
		super();
		Titre_Film = titre_Film;
		Existe = existe;
		this.nbrDVD = nbrDVD;
	}

	public String getTitre_Film() {
		return Titre_Film;
	}

	public void setTitre_Film(String titre_Film) {
		Titre_Film = titre_Film;
	}

	public boolean isExiste() {
		return Existe;
	}

	public void setExiste(boolean existe) {
		Existe = existe;
	}

	public int getNbrDVD() {
		return nbrDVD;
	}

	public void setNbrDVD(int nbrDVD) {
		this.nbrDVD = nbrDVD;
	}


}
