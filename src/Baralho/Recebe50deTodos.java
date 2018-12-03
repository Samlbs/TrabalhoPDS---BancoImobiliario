package Baralho;

import Casa.Carta;
import Jogador.Jogador;
import Repositorios.RepositorioJogador;

public class Recebe50deTodos extends Carta{

	public Recebe50deTodos(int id, String nome, float efeito) {
		super(id, nome, efeito);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ativarEfeito(Jogador jogador) {
		// TODO Auto-generated method stub
		for (Jogador player : RepositorioJogador.getInstance().getJogadoresJogando()) {
			player.getConta().sacar(50);
			jogador.getConta().depositar(50);
		}
		jogador.getConta().depositar(50);
	}
}
