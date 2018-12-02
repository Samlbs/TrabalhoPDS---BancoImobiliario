package Jogo;

import Casa.TerrenoComercializavel.Imovel;
import Jogador.Jogador;
import Repositorios.RepositorioCasas;
import Verificadores.VerificadorRegraCasa;

public class InsereCondominio implements VerificadorRegraCasa {
	
	public void inserirCondominio(Jogador jogador, Imovel imovel) {
		if (validaRegraConstrucoes(jogador, imovel)) {
			if (jogador.getMinhasPropriedades().contains(imovel)) {
				jogador.getConta().sacar(imovel.getValorCondominio());
				imovel.setCountCondominios(imovel.getCountCondominios() + 1);
			}
		}
	}
	
	@Override
	public boolean validaRegraConstrucoes(Jogador jogador, Imovel imovel) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		if (imovel.getCorImovel().equals("Roxo")) {
			if (jogador.getPropriedadesRoxas().equals(RepositorioCasas.getInstance().getImoveisRoxos())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Azul")) {
			if (jogador.getPropriedadesAzuis().equals(RepositorioCasas.getInstance().getImoveisAzuis())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Lilas")) {
			if (jogador.getPropriedadesLilas().equals(RepositorioCasas.getInstance().getImoveisLilas())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Laranja")) {
			if (jogador.getPropriedadesLaranjas().equals(RepositorioCasas.getInstance().getImoveisLaranjas())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Rosa")) {
			if (jogador.getPropriedadesRosas().equals(RepositorioCasas.getInstance().getImoveisRosas())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Amarelo")) {
			if(jogador.getPropriedadesAmarelas().equals(RepositorioCasas.getInstance().getImoveisAmarelo())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Verde")) {
			if (jogador.getPropriedadesVerdes().equals(RepositorioCasas.getInstance().getImoveisVerdes())) {
				flag = true;
			}
		}
		else if (imovel.getCorImovel().equals("Azul Escuro")) {
			if (jogador.getPropriedadesAzuis().equals(RepositorioCasas.getInstance().getImoveisAzuisEscuro())) {
				flag = true;
			}
		}
		return flag;
		
	}

}
