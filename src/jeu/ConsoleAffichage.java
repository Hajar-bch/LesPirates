package jeu;

public class ConsoleAffichage implements IAffichage {

	@Override
	public void afficherMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void afficherResultatDes(String nomJoueur, int score) {
		System.out.println(nomJoueur + " a obtenu un score de " + score);
	}

	@Override
	public void afficherPlateau(Pion[] pions) {

		System.out.println("Affichage du plateau..");
	}

	@Override
	public void afficherVictoire(String nomJoueur) {
		System.out.println("Bravo! Le pirate " + nomJoueur + " a gagné !");
	}

}
