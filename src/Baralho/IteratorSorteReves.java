package Baralho;

import java.util.List;

public class IteratorSorteReves implements IteratorCarta{
	private List<Carta> cartas;
	private int cursorAtual;
	
	public IteratorSorteReves(List<Carta> cartas) {
		super();
		this.cartas = cartas;
	}

	@Override
	public boolean existeProximo() {
		if (cartas.get(cursorAtual) != null) {
			return true;
		}
		this.cursorAtual = 0;
		return true;
	}

	@Override
	public Carta pegaCarta() {
		if (existeProximo()) {
			Carta carta = cartas.get(cursorAtual);
			cursorAtual++;
			return carta;
		}
		return null;
	}

}
