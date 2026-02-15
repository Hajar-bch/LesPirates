package jeu;

public class CaseOrange extends Case {
	public CaseOrange() {
		super(Couleurs.ORANGE);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		p.avancer(2, j.getNom());
	}

}
