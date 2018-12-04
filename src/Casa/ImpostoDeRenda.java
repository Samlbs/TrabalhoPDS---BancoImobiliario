package Casa;

import Jogador.Jogador;
import View.DesenhaComponenteGrafico;

public class ImpostoDeRenda extends Casa {

	public ImpostoDeRenda(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		jogador.getConta().sacar(200);
		componenteGrafico.mensagemImposto();
	}

}
