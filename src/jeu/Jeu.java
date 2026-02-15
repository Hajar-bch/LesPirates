package jeu;

public class Jeu {
	private IAffichage journal;
	private Plateau plateau = new Plateau();
	private Joueur[] joueurs = new Joueur[2];
	private Dé d1, d2;
	private boolean estFini = false;

	public boolean estFini() {
		return this.estFini;
	}

	public Jeu(IAffichage journal) {
		this.journal = journal;
		this.d1 = new Dé(6);
		this.d2 = new Dé(6);
	}

	public void jouerTour(Joueur j) {
		if (j.isBloque()) {
			j.setBloque(false);
		} else {
			int score = d1.lancerDe() + d2.lancerDe();
			journal.afficherResultatDes(j.getNom(), score);

			Pion p = j.getPion();
			p.avancer(score, j.getNom());

			Case c = plateau.getCase(p.getPosition());
			if (c != null) {
				c.appliquerEffet(j, p);
			}
			this.verifierVictoire(j, p);
		}
	}

	private void verifierVictoire(Joueur j, Pion p) {
		if (p.getPosition() == 30) {
			this.estFini = true;
			journal.afficherVictoire(j.getNom());
		}
	}

}
