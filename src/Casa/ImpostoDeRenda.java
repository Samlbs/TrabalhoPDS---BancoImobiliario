package Casa;

import Jogador.Jogador;

public class ImpostoDeRenda extends Casa {

	public ImpostoDeRenda(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		jogador.getConta().sacar(200);
	}

}
