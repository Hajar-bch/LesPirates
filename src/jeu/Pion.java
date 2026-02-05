package jeu;

public class Pion {
	private Couleurs couleur;
	private int position;

	public Pion(Couleurs couleur) {
		this.couleur = couleur;
		this.position = 0;
	}

	public void avancer(int valeurDes) {
		this.position += valeurDes;
	}

	public void reculer(int nbCases) {
		this.position -= nbCases;
	}

}
