package Jogador;

import java.util.ArrayList;
import java.util.List;
import Casa.TerrenoComercializavel.TerrenoComercializavel;
import jplay.URL;

public class Jogador {

	private static int id;
	private int posicaoAtual;
	private ContaBancaria conta;
	private List<TerrenoComercializavel> propriedades;
	private Peca pecaJogador;
	
	
	
	public Jogador(ContaBancaria conta) {
		super();
		this.id = id + 1;
		this.posicaoAtual = 1;
		this.conta = conta;
		this.pecaJogador = new Peca(640, 0, id);
		this.propriedades = new ArrayList<>();
	}

	public void comprar(TerrenoComercializavel terreno) {
		//depois
	}

	public void pagarTaxa(double taxa) {
		this.getConta().sacar(taxa);
	}

	public void receberTaxa(double taxa) {
		this.getConta().depositar(taxa);
	}

	public void addMinhaPropriedade(TerrenoComercializavel terreno) {
		this.propriedades.add(terreno);
	}
	
	public static int getId() {
		return id;
	}

	public double getSaldoBancario() {
		return this.conta.getSaldo();
	}

	public ContaBancaria getConta() {
		return this.conta;
	}
	
	public int getPosicaoAtual() {
		return this.posicaoAtual;
	}

	public Peca getPecaJogador() {
		return pecaJogador;
	}

	public void setPosicaoAtual(int posicao) {
		this.posicaoAtual = posicao;
	}

	public List<TerrenoComercializavel> getMinhasPropriedades() {
		return this.propriedades;
	}

}
