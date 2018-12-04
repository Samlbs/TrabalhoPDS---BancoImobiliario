package Casa;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;

public class ImpostoDeRenda extends Casa {

	public ImpostoDeRenda(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		if(jogador.getSaldoBancario() > 200) {
			jogador.getConta().sacar(200);
			componenteGrafico.mensagemImposto();
		} else {
			RepositorioJogador.getInstance().getJogadoresFalidos().add(jogador);
			jogador.transferirPropriedadesParaBanco();
			jogador.getPecaJogador().hide();
			componenteGrafico.mensagemFalencia();
		}
	}

}
