package Casa;



import java.util.ArrayList;
import java.util.List;

import Baralho.IteratorCarta;
import Baralho.IteratorSorteReves;
import Jogador.Jogador;
import Repositorios.RepositorioCartas;
import Repositorios.RepositorioCasas;

public class SorteReves extends Casa{

	private IteratorCarta iterador = new IteratorSorteReves(RepositorioCartas.getInstance().getCartas());
	
	public SorteReves(String nome, int posicao, int id, int x, int y) {
		super(nome, posicao, id, x, y);
		// TODO Auto-generated constructor stub
	}

	public void ativarEfeito(Jogador jogador) {
		iterador.pegaCarta().ativarEfeito(jogador);
	}
}
