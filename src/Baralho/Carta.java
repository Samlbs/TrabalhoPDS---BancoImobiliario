package Baralho;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;

public class Carta {

	private int id;
	private String nome;
	private double valor;

	public Carta(int id, String nome, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public void ativarEfeito(Jogador jogador) {
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		if (this.nome.equals("Sorte")) {
			jogador.getConta().depositar(valor);
			componenteGrafico.mensagemSorteReves(this.nome, valor);
		} else if (this.nome.equals("Reves")) {
			if(jogador.getSaldoBancario() > valor) {
				jogador.getConta().sacar(valor);
				componenteGrafico.mensagemSorteReves(this.nome, valor);
			} else {
				RepositorioJogador.getInstance().getJogadoresFalidos().add(jogador);
				jogador.transferirPropriedadesParaBanco();
				jogador.getPecaJogador().hide();
				componenteGrafico.mensagemFalencia();
			}
		}
	}
}
