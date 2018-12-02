package Jogador;

import jplay.Sprite;
import jplay.URL;

public class Peca extends Sprite{

	public Peca(int x, int y, int id) {
		super(URL.sprite("peca"+id+".png"), 1);
		//System.out.println("src//recursos//sprite//peca"+id+".png");
		this.x = x;
		this.y = y;
	}

	public void moverPara(int x, int y) {
		moveTo(x, y, 0.3);
	}

	
}
