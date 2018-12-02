package Casa;

import Casa.TerrenoEspecial.TerrenoEspecial;
import Jogador.Jogador;

public class LucrosEDividendos extends TerrenoEspecial {

	public LucrosEDividendos(String nome, int posicao, int id) {
		super(nome, posicao, id);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		jogador.getConta().depositar(200);
	}

}
