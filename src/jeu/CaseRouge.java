package jeu;

public class CaseRouge extends Case {
	public CaseRouge() {
		super(Couleurs.ROUGE);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		j.setBloque(true);
		System.out.println("Le pirate " + j.getNom() + " est bloqué");
	}
}
