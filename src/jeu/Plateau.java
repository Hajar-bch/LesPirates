package jeu;

public class Plateau {

	private Case[] cases = new Case[30];
	private int nbCases = 30;

	public Plateau() {
		for (int i = 0; i < 30; i++) {

			if (i == 7 || i == 17) {
				cases[i] = new CaseNoire();

			} else if (i == 11 || i == 23) {
				cases[i] = new CaseRouge();
			} else if (i == 3 || i == 13) {
				cases[i] = new CaseOrange();
			} else {
				cases[i] = new CaseNeutre();
			}
		}
	}

	public Case getCase(int position) {
		if (position >= 0 && position < nbCases) {
			return cases[position];
		}
		return null;
	}

}
