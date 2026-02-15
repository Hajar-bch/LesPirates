package jeu;

public class Joueur {
	private String nom;
	private boolean estBloque = false;
	private Pion pion;

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
