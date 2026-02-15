package jeu;

public class Pion {
	private Couleurs couleur;
	private int position;

	public Pion(Couleurs couleur) {
		this.couleur = couleur;
		this.position = 0;
	}

	public void avancer(int valeurDes, String nom) {
		int nouvellePosition = this.position + valeurDes;
		if (nouvellePosition <= 30) {
			this.position = nouvellePosition;
			System.out.println("Le pion de " + nom + " avance à la case " + this.position);
		} else {
			int depassement = nouvellePosition - 30;
			this.position = 30 - depassement;
			System.out.println("Rebond pour " + nom + "!");
		}

		System.out.println("Le pion de " + nom + " est a la case " + this.position);

	}

	public void reculer(int nbCases, String nom) {
		this.position -= nbCases;
		if (this.position < 0) {
			this.position = 0;
		}
		System.out.println("Le pion de " + nom + " recule à la case " + this.position);
	}

	public int getPosition() {
		return this.position;
	}

}

