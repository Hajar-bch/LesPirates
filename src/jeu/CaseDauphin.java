package jeu;

public class CaseDauphin extends Case {
	public CaseDauphin() {
		super(Couleurs.ORANGE);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		j.activerDauphin(3);
		System.out.println("Effet Dauphin est activé pour 3 tours ");
	}

}
