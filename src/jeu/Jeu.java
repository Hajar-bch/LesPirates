package jeu;

import java.util.Scanner;

public class Jeu {
	private IAffichage journal;
	private Plateau plateau = new Plateau();
	private Joueur[] joueurs = new Joueur[2];
	private Dé d1, d2;
	private boolean estFini = false;

	private Scanner lecteur = new Scanner(System.in);

	public boolean estFini() {
		return this.estFini;
	}

	public Jeu(IAffichage journal) {
		this.journal = journal;
		this.d1 = new Dé(6);
		this.d2 = new Dé(6);
	}

	public void jouerTour(Joueur joueurCourant) {
		lecteur.nextLine();
		int v1 = d1.lancerDe();
		int v2 = d2.lancerDe();

		journal.afficherResultatDes(joueurCourant.getNom(), v1 + v2);
		
		//caseBombe
		if (joueurCourant.estMort()) {
			this.estFini = true;
			journal.afficherMessage("Game Over " + joueurCourant.getNom() + "n'a plus de coeurs" );
		}

		// caseBloquante
		if (joueurCourant.isBloque()) {
			if (v1 == v2) {
				joueurCourant.setBloque(false);
				journal.afficherMessage(
						"Double ! (D1:" + v1 + " = D2:" + v2 + "). " + joueurCourant.getNom() + " est débloqué !");
			} else {
				journal.afficherMessage("Pas de double (D1:" + v1 + " != D2:" + v2 + ") : " + joueurCourant.getNom()
						+ " reste bloqué.");
			}
			return;
		}

		// caseDauphin
		int score = v1 + v2;
		if (joueurCourant.aEffetDauphin()) {
			score = 2 * score;
			joueurCourant.decrementerDauphin();
			journal.afficherMessage(
					"Dauphin: deplacement doublé ! tours restant = " + joueurCourant.getNbToursDauphin());
		}

		// avancer
		Pion p = joueurCourant.getPion();
		p.avancer(score, joueurCourant.getNom());

		// appliqerEffet
		Case c = plateau.getCase(p.getPosition());
		if (c != null) {
			c.appliquerEffet(joueurCourant, p);
		}

		this.verifierVictoire(joueurCourant, p);

	}

	private void verifierVictoire(Joueur j, Pion p) {
		if (p.getPosition() == 30) {
			this.estFini = true;
			journal.afficherVictoire(j.getNom());
		}
	}

}
