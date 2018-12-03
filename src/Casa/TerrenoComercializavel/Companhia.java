package Casa.TerrenoComercializavel;

import javax.swing.JOptionPane;

import Jogador.Jogador;
import View.DesenhaComponenteGrafico;

public class Companhia extends TerrenoComercializavel {
	private double taxaCompanhia;
	
	public Companhia(String nome, int posicao, int id, int x, int y, double valor, double taxa) {
		super(nome, posicao, id, x, y, valor);
		// TODO Auto-generated constructor stub
		this.taxaCompanhia = taxa;
	}
	
	public double getTaxaCompanhia() {
		return taxaCompanhia;
	}

	@Override
	public void ativarEfeitoCompanhia(Jogador jogador, int valorDados) {
		DesenhaComponenteGrafico painel = new DesenhaComponenteGrafico();
		if (this.getProprietario() == null) {
			int resposta = painel.mensagemConfirmacaoCompra();
			//System.out.println(jogador.getConta().getSaldo());
			if(resposta == JOptionPane.YES_OPTION) {
				jogador.comprar(this);
				//System.out.println(jogador.getConta().getSaldo());
			}
		}
		else if (!this.getProprietario().equals(jogador)) {
			jogador.getConta().sacar(taxaCompanhia * valorDados);
			painel.mensagemPagarTaxa(taxaCompanhia * valorDados);
			this.getProprietario().getConta().depositar(taxaCompanhia * valorDados);
		}
	}
}
