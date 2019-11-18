package src;

import java.io.Serializable;

public class DVD implements Serializable {

	private Film Film;
	private boolean Existe;
	private int quantite;

	/**
	 * @param film
	 * @param existe
	 * @param quantite
	 */
	public DVD(src.Film film, boolean existe, int quantite) {
		Film = film;
		Existe = existe;
		this.quantite = quantite;
	}

	/**
	 * @return the film
	 */
	public Film getFilm() {
		return Film;
	}

	/**
	 * @param film the film to set
	 */
	public void setFilm(Film film) {
		Film = film;
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

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "DVD [Film=" + Film + ", Existe=" + Existe + ", quantite=" + quantite + "]";
	}
}
