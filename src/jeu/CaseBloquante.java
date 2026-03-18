package jeu;

public class CaseBloquante extends Case {
	public CaseBloquante() {
		super(Couleurs.ORANGE);
	}

	@Override
	public void appliquerEffet(Joueur joueurCourant, Pion p) {
		joueurCourant.setBloque(true);
		System.out.println("Le pirate " + joueurCourant.getNom() + " est bloqué");
	}
}
