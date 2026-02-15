package test;

import jeu.*;

public class TestPirates {
	public static void main(String[] args) {

		IAffichage journal = new ConsoleAffichage();

		Jeu pirates = new Jeu(journal);

		Joueur j1 = new Joueur("Shikuma", Couleurs.ROUGE);
		Joueur j2 = new Joueur("Zoro", Couleurs.BLEU);

		System.out.println("Le jeu commence!");

		while (!pirates.estFini()) {
			pirates.jouerTour(j1);

			if (!pirates.estFini()) {
				pirates.jouerTour(j2);
			}
		}
		
		System.out.println("Partie terminée.");

	}
}
