package Jogador;

import jplay.Sprite;
import jplay.URL;

public class Peca extends Sprite{

	public Peca(int x, int y, int id) {
		super(URL.sprite("src//recursos//sprite//peca"+id+".png"), 20);
		System.out.println("src//recursos//sprite//peca"+id+".png");
		this.x = x;
		this.y = y;
	}

	

	
}
