package Jogo;

import Jogador.ControladorJogador;
import View.DesenhaComponenteGrafico;
import Casa.ControladorCasa;
import Dados.ControladorDado;

public class ControladorJogo {

	private ControladorJogador controlJogo;
	private ControladorCasa controlCasa;
	private ControladorDado controlDado;
	private DesenhaComponenteGrafico componenteGrafico;
	private InsereJogador insereJogador;
	
	public ControladorJogo() {
		this.componenteGrafico = new DesenhaComponenteGrafico();
		componenteGrafico.desenhaTabuleiro();
		this.insereJogador = new InsereJogador();
		insereJogador.inserirQtdJogadores();
	}
	
	public void iniciarJogo() {
		Tabuleiro tabuleiro = new Tabuleiro();
	}

}
