package daus;

import java.util.Random;

public class Dau {

	private int cares = 0;
	private Random rand;
	private int resultat = 0;

	public Dau() {
		this.cares = 6;
		rand = new Random();
	}

	public Dau(int cares) {
		this.cares = cares;
	}

	public int tirada() {
		resultat = rand.nextInt(cares) + 1;
		return this.resultat;
	}
	
	public int resultat() {
		return this.resultat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
