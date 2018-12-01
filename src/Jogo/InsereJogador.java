package Jogo;

import Repositorios.RepositorioJogador;
import Verificadores.VerificaRegrasInsereJogador;
import View.DesenhaComponenteGrafico;

public class InsereJogador implements VerificaRegrasInsereJogador {

	private DesenhaComponenteGrafico desenha;
	private RepositorioJogador repositorio;
	
	public InsereJogador() {
		this.desenha = new DesenhaComponenteGrafico();
		this.repositorio = RepositorioJogador.getInstance();
	}
	
	public void inserirQtdJogadores() {
		int qtdJogadores = desenha.telaInserirQtdJogador();
		for(int i = 0; i < qtdJogadores; i++) {
			RepositorioJogador.getInstance().adicionarJogador(i + 1);
		}
	}


	/**
	 * @see Verificadores.VerificaRegrasInsereJogador#verificaQtdJogadores(int)
	 */
	public boolean verificaQtdJogadores(int qtdJogadores) {
		return false;
	}

}
