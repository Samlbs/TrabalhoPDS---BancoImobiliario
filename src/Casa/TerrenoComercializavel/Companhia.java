package Casa.TerrenoComercializavel;

import Jogador.Jogador;

public class Companhia extends TerrenoComercializavel {
	private double taxaCompanhia;
	
	public Companhia(String nome, int posicao, int id, double valor, double taxa) {
		super(nome, posicao, id, valor);
		// TODO Auto-generated constructor stub
		this.taxaCompanhia = taxa;
	}
	
	public double getTaxaCompanhia() {
		return taxaCompanhia;
	}

	@Override
	public void ativarEfeitoCompanhia(Jogador jogador, int valorDados) {
		if (!this.getProprietario().equals(jogador) && this.getProprietario() != null) {
			double taxa = this.getTaxaCompanhia() * valorDados;
			jogador.getConta().sacar(taxa);
			this.getProprietario().getConta().depositar(taxa);
		}
	}
}
