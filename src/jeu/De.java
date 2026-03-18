package jeu;

import java.util.Random;

public class De {
	private int valeurMax = 6;
	private Random random = new Random();

	public De(int valeurMax) {
		this.valeurMax = valeurMax;
	}

	public int lancerDe() {
		return random.nextInt(valeurMax) + 1;
	}

}
