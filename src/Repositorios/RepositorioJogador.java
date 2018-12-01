package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Jogador.ContaBancaria;
import Jogador.Jogador;
import Jogador.Peca;
import jplay.URL;

public class RepositorioJogador {

	private static RepositorioJogador instance = null;
	private List<Jogador> jogadores = new ArrayList<>();
	private List<Jogador> jogadoresJogando = new ArrayList<>();
	private List<Jogador> jogadoresPresos =  new ArrayList<>();
	
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
		Jogador jogador = new Jogador(conta);
		jogadores.add(jogador);
		//System.out.println(jogador.getPecaJogador().getId());
	}
}
