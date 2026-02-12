package jeu;

public class CaseNoire extends Case {
	public CaseNoire() {
		super(Couleurs.NOIR);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		p.reculer(3);
	}

}
