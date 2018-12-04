package Baralho;

import java.util.Collections;

import Repositorios.RepositorioCartas;

public class InicializarBaralhoSorteReves {
	
	public void inicialize() {
		Carta card1 = new Carta(1, "Sorte", 25);
		RepositorioCartas.getInstance().addCarta(card1);
		Carta card2 = new Carta(2, "Reves", 40);
		RepositorioCartas.getInstance().addCarta(card2);
		Carta card3 = new Carta(3, "Reves", 50);
		RepositorioCartas.getInstance().addCarta(card3);
		Carta card4 = new Carta(4, "Sorte", 150);
		RepositorioCartas.getInstance().addCarta(card4);
		Carta card5 = new Carta(5, "Reves", 25);
		RepositorioCartas.getInstance().addCarta(card5);
		Carta card6 = new Carta(6, "Reves", 50);
		RepositorioCartas.getInstance().addCarta(card6);
		
		Carta card7 = new Carta(7, "Sorte",100);
		RepositorioCartas.getInstance().addCarta(card7);
		Carta card8 = new Carta(8, "Reves", 100);
		RepositorioCartas.getInstance().addCarta(card8);
		Carta card9 = new Carta(9, "Reves", 100);
		RepositorioCartas.getInstance().addCarta(card9);
		Carta card10 = new Carta(10, "Sorte", 80);
		RepositorioCartas.getInstance().addCarta(card10);
		Carta card11 = new Carta(11, "Sorte", 45);
		RepositorioCartas.getInstance().addCarta(card11);
		Carta card12 = new Carta(12, "Reves", 25);
		RepositorioCartas.getInstance().addCarta(card12);
		
		Carta card13 = new Carta(13, "Reves", 45);
		RepositorioCartas.getInstance().addCarta(card13);
		Carta card14 = new Carta(14, "Sorte", 20);
		RepositorioCartas.getInstance().addCarta(card14);
		Carta vaParaPrisao = new VaParaCadeia(15, "Reves", 0);
		RepositorioCartas.getInstance().addCarta(vaParaPrisao);
		Carta card16 = new Carta(16, "Reves", 15);
		RepositorioCartas.getInstance().addCarta(card16);
		Carta card17 = new Carta (17, "Sorte", 100);
		RepositorioCartas.getInstance().addCarta(card17);
		Carta card18 = new Carta(18, "Reves", 30);
		RepositorioCartas.getInstance().addCarta(card18);

		//card 19: receba 50 de cada 1
		Carta card19 = new Recebe50deTodos(19, "Sorte", 50);
		RepositorioCartas.getInstance().addCarta(card19);
		Carta saidaLivre = new SaidaLivre(20, "Sorte", 0);
		RepositorioCartas.getInstance().addCarta(saidaLivre);
		Carta card21 = new Carta(21, "Sorte", 200);
		RepositorioCartas.getInstance().addCarta(card21);
		Carta card22 = new Carta(22, "Reves", 30);
		RepositorioCartas.getInstance().addCarta(card22);
		Carta card23 = new Carta(23, "Sorte", 50);
		RepositorioCartas.getInstance().addCarta(card23);
		Carta card24 = new Carta(24, "Sorete", 100);
		RepositorioCartas.getInstance().addCarta(card24);
		
		//Embaralhar cartas
		Collections.shuffle(RepositorioCartas.getInstance().getCartas());
	}
}
