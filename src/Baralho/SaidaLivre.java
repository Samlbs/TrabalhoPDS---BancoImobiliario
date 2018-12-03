package Baralho;

import Casa.Carta;
import Jogador.Jogador;
import Repositorios.RepositorioJogador;

public class SaidaLivre extends Carta{

	public SaidaLivre(int id, String nome, float efeito) {
		super(id, nome, efeito);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ativarEfeito(Jogador jogador) {
		// TODO Auto-generated method stub
		RepositorioJogador.getInstance().removeJogadorPreso(jogador);
	}
	

}
