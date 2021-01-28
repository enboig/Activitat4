package daus;

import java.util.Random;

public class Dau {

	private int cares = 0;
	private Random rand;

	public Dau() {
		this.cares = 6;
		rand = new Random();
	}

	public Dau(int cares) {
		this.cares = cares;
	}

	public int tirada() {
		return rand.nextInt(cares) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
