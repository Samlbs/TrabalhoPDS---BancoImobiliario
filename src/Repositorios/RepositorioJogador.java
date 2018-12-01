package Repositorios;

import java.util.List;

import Jogador.ContaBancaria;
import Jogador.Jogador;
import Jogador.Peca;

public class RepositorioJogador {

	private static RepositorioJogador instance = null;
	private List<Jogador> jogadores;
	private List<Jogador> jogadoresJogando;
	private List<Jogador> jogadoresPresos;
	
	private RepositorioJogador() {
		
	}
	
	public static RepositorioJogador getInstance() {
		if(instance == null) {
			instance = new RepositorioJogador();
		}
		return instance;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public List<Jogador> getJogadoresJogando() {
		return jogadoresJogando;
	}
	public List<Jogador> getJogadoresPresos() {
		return jogadoresPresos;
	}
	
	public void adicionarJogador(int id) {
		ContaBancaria conta = new ContaBancaria();
		conta.depositar(2458);
		Peca pecaJogador = new Peca();
		Jogador jogador = new Jogador(conta, pecaJogador);
		
	}
}
