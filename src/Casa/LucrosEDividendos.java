package Casa;

import Casa.TerrenoEspecial.TerrenoEspecial;
import Jogador.Jogador;

public class LucrosEDividendos extends TerrenoEspecial {

	public void ativarEfeito(Jogador jogador) {
		jogador.getConta().depositar(200);
	}

}
