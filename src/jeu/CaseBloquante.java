package jeu;

public class CaseBloquante extends Case {
	public CaseBloquante() {
		super(Couleurs.ROUGE);
	}

	@Override
	public void appliquerEffet(Joueur j, Pion p) {
		j.setBloque(true);
		System.out.println("Le pirate " + j.getNom() + " est bloqué");
	}
}
