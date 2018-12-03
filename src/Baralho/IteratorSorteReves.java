package Baralho;

import java.util.List;

public class IteratorSorteReves implements IteratorCarta{
	private List<Carta> cartas;
	private int cursorAtual;
	
	public IteratorSorteReves(List<Carta> cartas2) {
		super();
		this.cartas = cartas2;
	}

	@Override
	public boolean exiteProximo() {
		// TODO Auto-generated method stub
		if (cartas.get(cursorAtual) != null) {
			return true;
		}
		this.cursorAtual = 0;
		return true;
	}

	@Override
	public Carta pegaCarta() {
		// TODO Auto-generated method stub
		if (exiteProximo()) {
			Carta carta = cartas.get(cursorAtual);
			cursorAtual++;
			return carta;
		}
		return null;
	}

}
