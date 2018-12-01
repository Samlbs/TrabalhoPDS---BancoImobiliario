package Repositorios;

import java.util.List;

import Casa.Casa;

public class RepositorioCasas {
	private List<Casa> casasTabuleiro;
	private static RepositorioCasas instance;
	
	private RepositorioCasas () {}
	
	public static RepositorioCasas getInstance() {
		if (instance == null) {
			instance = new RepositorioCasas();
		}
		return instance;
	}
	
	
	
	

}
