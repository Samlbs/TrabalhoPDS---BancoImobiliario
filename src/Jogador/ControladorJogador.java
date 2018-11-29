package Jogador;

import Verificadores.VerificaRegrasJogador;
import Casa.TerrenoComercializavel.TerrenoComercializavel;
import java.util.List;

public class ControladorJogador implements VerificaRegrasJogador {

	public boolean verificaSaldoJogador(Jogador jogador) {
		return false;
	}

	public boolean validaCasaJogador(TerrenoComercializavel terreno, Jogador jogador) {
		return false;
	}

	public boolean verificaJogadorPreso(Jogador jogador) {
		return false;
	}

	public boolean verificaSaldoParaCompra(Jogador jogador, TerrenoComercializavel terreno) {
		return false;
	}

	public void comprar(TerrenoComercializavel terreno) {

	}

	public void pagarTaxa(double taxa) {

	}

	public void receberTaxa(double taxa) {

	}

	public void addMinhaPropriedade(TerrenoComercializavel terreno) {

	}

	public int getId() {
		return 0;
	}

	public String getName() {
		return null;
	}

	public double getSaldoBancario() {
		return 0;
	}

	public int getPosicaoAtual() {
		return 0;
	}

	public void setPosicaoAtual(int posicao) {

	}

	public List<TerrenoComercializavel> getMinhasPropriedades() {
		return null;
	}

}
