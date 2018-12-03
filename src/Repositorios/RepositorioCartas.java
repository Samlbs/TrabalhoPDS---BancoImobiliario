package Repositorios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Casa.Carta;

public class RepositorioCartas {
	private static List<Carta> baralho = new ArrayList<>();
	private static RepositorioCartas instance;
	
	private RepositorioCartas() {}
	
	public static RepositorioCartas getInstance() {
		if (instance == null) {
			instance = new RepositorioCartas();
			Collections.shuffle(baralho);
		}
		return instance;
	}
	
	public List<Carta> getCartas(){
		return baralho;
	}
	
	public void addCarta(Carta carta) {
		baralho.add(carta);
	}
	
}
