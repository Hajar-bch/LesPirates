package jeu;

public class CaseDauphin extends Case {
	public CaseDauphin() {
		super(Couleurs.VERT);
	}

	@Override
	public void appliquerEffet(Joueur joueurCourant, Pion p) {
		joueurCourant.activerDauphin(3);
		System.out.println("Effet Dauphin est activé pour 3 tours ");
	}

}
