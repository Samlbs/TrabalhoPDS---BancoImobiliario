package Casa.TerrenoComercializavel;

import javax.swing.JOptionPane;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;
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
			if(resposta == JOptionPane.YES_OPTION) {
				jogador.comprar(this);
			}
		}
		else if (!this.getProprietario().equals(jogador)) {
			if(jogador.getSaldoBancario() > taxaCompanhia * valorDados) {
				jogador.getConta().sacar(taxaCompanhia * valorDados);
				painel.mensagemPagarTaxa(taxaCompanhia * valorDados);
				this.getProprietario().getConta().depositar(taxaCompanhia * valorDados);
			} else {
				RepositorioJogador.getInstance().getJogadoresFalidos().add(jogador);
				jogador.transferirPropriedadesParaBanco();
				jogador.getPecaJogador().hide();
				painel.mensagemFalencia();
			}
		} else {
			painel.mensagemJogadorEhDono();
		}
	}
}
