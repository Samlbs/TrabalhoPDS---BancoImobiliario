package Jogador;

import Verificadores.VerificaRegrasJogador;
import Casa.TerrenoComercializavel.TerrenoComercializavel;
import Repositorios.RepositorioJogador;

public class ControladorJogador implements VerificaRegrasJogador {
	
	public ControladorJogador() {
		super();
	}
	
	public boolean verificaSaldoJogador(Jogador jogador) {
		if (jogador.getConta().getSaldo() > 0) {
			return true;
		}
		return false;
	}

	public boolean validaCasaJogador(TerrenoComercializavel terreno, Jogador jogador) {
		if (jogador.getMinhasPropriedades().contains(terreno)) {
			return true;
		}
		return false;
	}

	public boolean verificaJogadorPreso(Jogador jogador) {
		if (RepositorioJogador.getInstance().getJogadoresPresos().contains(jogador)) {
			return true;
		}
		return false;
	}

	public boolean verificaSaldoParaCompra(Jogador jogador, TerrenoComercializavel terreno) {
		if ((jogador.getConta().getSaldo() - terreno.getValor()) >= 0) {
			return true;
		}
		return false;
	}
}