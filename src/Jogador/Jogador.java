package Jogador;

import java.util.ArrayList;
import java.util.List;
import Casa.TerrenoComercializavel.TerrenoComercializavel;

public class Jogador {

	private int id;
	private String nome;
	private int posicaoAtual;
	private ContaBancaria conta;
	private List<TerrenoComercializavel> propriedades;
	private Peca pecaJogador;
	
	
	
	public Jogador(int id, String nome, int posicaoAtual, ContaBancaria conta, Peca pecaJogador) {
		super();
		this.id = id;
		this.nome = nome;
		this.posicaoAtual = posicaoAtual;
		this.conta = conta;
		this.pecaJogador = pecaJogador;
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

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
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

	public void setPosicaoAtual(int posicao) {
		this.posicaoAtual = posicao;
	}

	public List<TerrenoComercializavel> getMinhasPropriedades() {
		return this.propriedades;
	}

}
