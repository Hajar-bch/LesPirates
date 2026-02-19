package jeu;

public class Joueur {
	private String nom;
	private boolean estBloque = false;
	private Pion pion;

	private int nbToursDauphin = 0;

	public void activerDauphin(int nbTours) {
		this.nbToursDauphin = nbTours;
	}

	public boolean aEffetDauphin() {
		return this.nbToursDauphin > 0;
	}

	public void decrementerDauphin() {
		if (this.nbToursDauphin > 0) {
			this.nbToursDauphin--;
		}
	}

	public int getNbToursDauphin() {
		return nbToursDauphin;
	}

	public Joueur(String nom, Couleurs couleurPion) {
		this.nom = nom;
		this.pion = new Pion(couleurPion);
	}

	public int lancerDes() {
		return 0;
	}

	public String getNom() {
		return nom;
	}

	public Pion getPion() {
		return pion;
	}

	public boolean isBloque() {
		return this.estBloque;
	}

	public void setBloque(boolean etat) {
		this.estBloque = etat;
	}

}
