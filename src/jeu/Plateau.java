package jeu;

public class Plateau {

	private Case[] cases = new Case[31];
	private int nbCases = 31;

	public Plateau() {
		for (int pos = 1; pos <= 30; pos++) {

			if (pos == 11 || pos == 23) {
				cases[pos] = new CaseBloquante();
			}
			if (pos == 3 || pos == 13) {
				cases[pos] = new CaseDauphin();
			}
		}
	}

	public Case getCase(int position) {
		if (position >= 1 && position < nbCases) {
			return cases[position];
		}
		return null;
	}

}
