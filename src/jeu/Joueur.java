package jeu;

public class Joueur {
	private String nom;
	private boolean estBloque = false;
	private Pion pion;

	public Joueur(String nom, Couleurs couleurPion) {
		this.nom = nom;
		this.pion = new Pion(couleurPion);
	}

	public int lancerDes(Dé d1, Dé d2) {
		return d1.lancerDe() + d2.lancerDe();
	}

	public String getNom() {
		return nom;
	}

	public Pion getPion() {
		return pion;
	}

}
