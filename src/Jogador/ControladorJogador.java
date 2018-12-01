package Jogador;

import Verificadores.VerificaRegrasJogador;
import Casa.TerrenoComercializavel.TerrenoComercializavel;
import java.util.List;

public class ControladorJogador implements VerificaRegrasJogador {
	
	public ControladorJogador() {
		super();
	}
	
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

}
