package src;

import java.io.Serializable;

public class DVD implements Serializable {

	private String Titre_Film;
	private boolean Existe;

	/**
	 * @param titre_Film
	 * @param existe
	 */
	public DVD(String titre_Film, boolean existe) {
		Titre_Film = titre_Film;
		Existe = existe;
	}

	/**
	 * @return the titre_Film
	 */
	public String getTitre_Film() {
		return Titre_Film;
	}

	/**
	 * @param titre_Film the titre_Film to set
	 */
	public void setTitre_Film(String titre_Film) {
		Titre_Film = titre_Film;
	}

	/**
	 * @return the existe
	 */
	public boolean isExiste() {
		return Existe;
	}

	/**
	 * @param existe the existe to set
	 */
	public void setExiste(boolean existe) {
		Existe = existe;
	}

}
