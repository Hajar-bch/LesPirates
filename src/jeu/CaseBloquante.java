package jeu;

public class CaseBloquante extends Case {
	public CaseBloquante() {
		super(Couleurs.ORANGE);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		j.setBloque(true);
		System.out.println("Le pirate " + j.getNom() + " est bloqué");
	}
}
