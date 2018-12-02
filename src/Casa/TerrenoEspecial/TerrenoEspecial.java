package Casa.TerrenoEspecial;

import Casa.Casa;
import Jogador.Jogador;

public abstract class TerrenoEspecial extends Casa {

	public TerrenoEspecial(String nome, int posicao, int id) {
		super(nome, posicao, id);
		// TODO Auto-generated constructor stub
	}

	public abstract void ativarEfeito(Jogador jogador);

}
