package jeu;

import java.util.Random;

public class Dé {
	private int valeurMax = 6;
	private Random random = new Random();

	public Dé(int valeurMax) {
		this.valeurMax = valeurMax;
	}

	public int lancerDe() {
		return random.nextInt(valeurMax) + 1;
	}

}
