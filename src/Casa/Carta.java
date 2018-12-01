package Casa;

import Jogador.Jogador;

public class Carta {

	private int id;
	private String nome;
	private float efeito;

	public Carta(int id, String nome, float efeito) {
		super();
		this.id = id;
		this.nome = nome;
		this.efeito = efeito;
	}

	public void ativarEfeito(Jogador jogador) {
		if (this.nome.equals("Sorte")) {
			jogador.getConta().depositar(efeito);
		} else if (this.nome.equals("Reves")) {
			jogador.getConta().sacar(efeito);
		}
	}
}
