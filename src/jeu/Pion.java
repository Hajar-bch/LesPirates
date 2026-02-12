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
		System.out.println("Le pion avance à la case " + this.position);
	}

	public void reculer(int nbCases) {
		this.position -= nbCases;
		if (this.position < 0) {
			this.position = 0;
		}
		System.out.println("Le pion recule à la case " + this.position);
	}

}
