package Casa;

import Jogador.Jogador;
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
			jogador.getConta().sacar(valor);
			componenteGrafico.mensagemSorteReves(this.nome, valor);
		}
	}
}
