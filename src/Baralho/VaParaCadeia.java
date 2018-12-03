package Baralho;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;

public class VaParaCadeia extends Carta{

	public VaParaCadeia(int id, String nome, float efeito) {
		super(id, nome, efeito);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ativarEfeito(Jogador jogador) {
		// TODO Auto-generated method stub
		RepositorioJogador.getInstance().addJogadorPreso(jogador);
	}

}
