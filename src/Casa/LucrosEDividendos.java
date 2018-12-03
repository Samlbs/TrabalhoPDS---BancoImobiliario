package Casa;

import Jogador.Jogador;

public class LucrosEDividendos extends Casa {

	public LucrosEDividendos(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		jogador.getConta().depositar(200);
	}

}
