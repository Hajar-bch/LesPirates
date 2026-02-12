package jeu;

public interface IAffichage {

	void afficherPlateau(Pion[] pions);

	void afficherResultatDes(String nomJoueur, int score);

	void afficherVictoire(String nomJoueur);

	void afficherMessage(String message);

}
