package Dados;

import java.util.Random;

public class Dado {

	public Dado() {
		super();
	}

	public int lancar() {
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
}
