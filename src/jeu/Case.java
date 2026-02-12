package jeu;

public abstract class Case {
	private Couleurs couleurCase;

	public Case(Couleurs couleur) {
		this.couleurCase = couleur;
	}

	public abstract void appliquerEffet(Joueur j, Pion p);

	public Couleurs getCouleur() {
		return couleurCase;
	}

}
