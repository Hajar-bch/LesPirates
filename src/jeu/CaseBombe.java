package jeu;

public class CaseBombe extends Case {
	public CaseBombe() {
		super(Couleurs.NOIR);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		j.perdreCoeur();
        System.out.println("BOOM ! " + j.getNom() + " a marché sur une bombe !");
        System.out.println("Vies restantes : " + j.getNbCoeurs());

	}

}
