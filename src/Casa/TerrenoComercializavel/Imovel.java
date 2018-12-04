package Casa.TerrenoComercializavel;

import javax.swing.JOptionPane;
import Jogador.Jogador;
import Repositorios.RepositorioCasas;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;

public class Imovel extends TerrenoComercializavel {

	private String corImovel;
	private int countCondominios;
	private double valorCondominio;
	private double taxas[] = new double[6];
	
	public Imovel(String nome, int posicao, int id, int x, int y, double valor, String cor, double valorCondominio, 
			double aluguel0, double aluguel1, double aluguel2, double aluguel3, double aluguel4, double aluguel5) {
		super(nome, posicao, id, x, y, valor);
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
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		if (this.getProprietario() == null) {
			int resposta = componenteGrafico.mensagemConfirmacaoCompra();
			if(resposta == JOptionPane.YES_OPTION) {
				jogador.comprar(this);
			}
		}
		else if (!this.getProprietario().equals(jogador)) {
			if(jogador.getSaldoBancario() > taxas[countCondominios]) {
				jogador.getConta().sacar(taxas[countCondominios]);
				componenteGrafico.mensagemPagarTaxa(taxas[countCondominios]);
				this.getProprietario().getConta().depositar(taxas[countCondominios]);
			} else {
				RepositorioJogador.getInstance().getJogadoresFalidos().add(jogador);
				jogador.transferirPropriedadesParaBanco();
				jogador.getPecaJogador().hide();
				componenteGrafico.mensagemFalencia();
			}
		} else {
			if(jogador.getMinhasPropriedades().containsAll(RepositorioCasas.getInstance().getListCorPorCor(this.corImovel))
							&& this.countCondominios < 6) {
				//colocar lógica de construir casas
				int construir = componenteGrafico.mensagemConfirmacaoConstrucao();
				if(construir == JOptionPane.YES_OPTION) {
					jogador.comprarCondominio(this);
				}
			} else {
				componenteGrafico.mensagemJogadorEhDono();
			}
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