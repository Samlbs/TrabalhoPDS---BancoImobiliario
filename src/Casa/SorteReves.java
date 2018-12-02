package Casa;

import Casa.TerrenoEspecial.TerrenoEspecial;
import IteratorSorteReves.IteratorCarta;
import IteratorSorteReves.IteratorSorteReves;

import java.util.ArrayList;
import java.util.List;
import Jogador.Jogador;

public class SorteReves extends TerrenoEspecial{

	private List<Carta> cartas = new ArrayList<>();
	private IteratorCarta iterador = new IteratorSorteReves(cartas);
	
	public SorteReves(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		iterador.pegaCarta().ativarEfeito(jogador);
	}
}
