package Casa;


import javax.swing.JOptionPane;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;

public class VaiParaCadeia extends Casa {

	public VaiParaCadeia(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		jogador.setPosicaoAtual(11, 640, 640);;
		RepositorioJogador.getInstance().addJogadorPreso(jogador);
		componenteGrafico.mensagemPreso();
		if(jogador.isPasseLivre()) {
			int resposta = componenteGrafico.mensagemConfirmacaoUsoPasseLivre();
			if(resposta == JOptionPane.YES_OPTION) {
				RepositorioJogador.getInstance().removeJogadorPreso(jogador);
				componenteGrafico.mensagemSaiuComPasse();
			}
		}
	}

}
