package Baralho;

import Casa.Carta;

public class InicializarBaralhoSorteReves {
	Carta card1 = new Carta(1, "Sorte", 25);
	Carta card2 = new Carta(2, "Reves", 40);
	Carta card3 = new Carta(3, "Reves", 50);
	Carta card4 = new Carta(4, "Sorte", 150);
	Carta card5 = new Carta(5, "Reves", 25);
	Carta card6 = new Carta(6, "Reves", 50);
	
	Carta card7 = new Carta(7, "Sorte",100);
	Carta card8 = new Carta(8, "Reves", 100);
	Carta card9 = new Carta(9, "Reves", 100);
	Carta card10 = new Carta(10, "Sorte", 80);
	Carta card11 = new Carta(11, "Sorte", 45);
	Carta card12 = new Carta(12, "Reves", 25);
	
	Carta card13 = new Carta(13, "Reves", 45);
	Carta card14 = new Carta(14, "Sorte", 20);
	Carta vaParaPrisao = new VaParaCadeia(15, "Reves", 0);
	Carta card16 = new Carta(16, "Reves", 15);
	Carta card17 = new Carta (17, "Sorte", 100);
	Carta card18 = new Carta(18, "Reves", 30);

	//card 19: receba 50 de cada 1
	Carta card19 = new Recebe50deTodos(19, "Sorte", 50);
	Carta saidaLivre = new SaidaLivre(20, "Sorte", 0);
	Carta card21 = new Carta(21, "Sorte", 200);
	Carta card22 = new Carta(22, "Reves", 30);
	Carta card23 = new Carta(23, "Sorte", 50);
	Carta card24 = new Carta(24, "Sorete", 100);

}
