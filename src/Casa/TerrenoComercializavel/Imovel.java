package Casa.TerrenoComercializavel;

import java.util.ArrayList;
import java.util.List;

import Jogador.Jogador;

public class Imovel extends TerrenoComercializavel {

	private String corImovel;
	private int countCondominios;
	private double valorCondominio;
	private List<Double> taxas = new ArrayList<Double>();
	
	public Imovel(String nome, int posicao, int id, double valor, String cor, double valorCondominio, List<Double> taxas) {
		super(nome, posicao, id, valor);
		// TODO Auto-generated constructor stub
		this.corImovel = cor;
		this.taxas = taxas;
		this.valorCondominio = valorCondominio;
	}

	public void ativarEfeito(Jogador jogador) {
		if (!this.getProprietario().equals(jogador) && this.getProprietario() != null) {
			jogador.getConta().sacar(taxas.get(countCondominios));
			this.getProprietario().getConta().depositar(taxas.get(countCondominios));
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

	public List<Double> getTaxas() {
		return taxas;
	}

	public void setCountCondominios(int countCondominios) {
		this.countCondominios = countCondominios;
	}
	
	

}
