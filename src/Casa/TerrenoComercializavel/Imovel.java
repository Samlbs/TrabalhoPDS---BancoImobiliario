package Casa.TerrenoComercializavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Jogador.Jogador;
import View.DesenhaComponenteGrafico;

public class Imovel extends TerrenoComercializavel {

	private String corImovel;
	private int countCondominios;
	private double valorCondominio;
	private double taxas[] = new double[6];
	
	public Imovel(String nome, int posicao, int id, int x, int y, double valor, String cor, double valorCondominio, 
			double aluguel0, double aluguel1, double aluguel2, double aluguel3, double aluguel4, double aluguel5) {
		super(nome, posicao, id, x, y, valor);
		// TODO Auto-generated constructor stub
		this.corImovel = cor;
		this.valorCondominio = valorCondominio;
		taxas[0] = aluguel0;
		taxas[1] = aluguel1;
		taxas[2] = aluguel2;
		taxas[3] = aluguel3;
		taxas[4] = aluguel4;
		taxas[5] = aluguel5;
	}

	public void ativarEfeito(Jogador jogador) {
		DesenhaComponenteGrafico painel = new DesenhaComponenteGrafico();
		if (this.getProprietario() == null) {
			int resposta = painel.mensagemConfirmacaoCompra();
			if(resposta == JOptionPane.YES_OPTION) {
				jogador.comprar(this);
			}
		}
		else if (!this.getProprietario().equals(jogador)) {
			jogador.getConta().sacar(taxas[countCondominios]);
			painel.mensagemPagarTaxa(taxas[countCondominios]);
			this.getProprietario().getConta().depositar(taxas[countCondominios]);
		}
	}

	public String getCorImovel() {
		return corImovel;
	}

	public int getCountCondominios() {
		return countCondominios;
	}

	public double getValorCondominio() {
		return valorCondominio;
	}

	public double[] getTaxas() {
		return taxas;
	}

	public void setCountCondominios(int countCondominios) {
		this.countCondominios = countCondominios;
	}
	
	

}
