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
		int v1 = d1.lancerDe();
		int v2 = d2.lancerDe();

		journal.afficherResultatDes(j.getNom(), v1 + v2);

		// caseBloquante
		if (j.isBloque()) {
			if (v1 == v2) {
				j.setBloque(false);
				journal.afficherMessage("Double ! " + j.getNom() + " est débloqué");
			} else {
				journal.afficherMessage("Pas de double : " + j.getNom() + " reste bloqué");
			}
			return;
		}

		// caseDauphin
		int score = v1 + v2;
		if (j.aEffetDauphin()) {
			score = 2 * score;
			j.decrementerDauphin();
			journal.afficherMessage("Dauphin: deplacement doublé ! tours restant = " + j.getNbToursDauphin());
		}

		// avancer
		Pion p = j.getPion();
		p.avancer(score, j.getNom());

		// appliqerEffet
		Case c = plateau.getCase(p.getPosition());
		if (c != null) {
			c.appliquerEffet(j, p);
		}

		this.verifierVictoire(j, p);
	}

	private void verifierVictoire(Joueur j, Pion p) {
		if (p.getPosition() == 30) {
			this.estFini = true;
			journal.afficherVictoire(j.getNom());
		}
	}

}
