package jeu;

public class CaseBombe extends Case {
	public CaseBombe() {
		super(Couleurs.NOIR);
	}

	@Override
	public void appliquerEffet(Joueur joueurCourant, Pion p) {
		joueurCourant.perdreCoeur();
        System.out.println("BOOM ! " + joueurCourant.getNom() + " a marché sur une bombe !");
        System.out.println("Vies restantes : " + joueurCourant.getNbCoeurs());

	}

}
