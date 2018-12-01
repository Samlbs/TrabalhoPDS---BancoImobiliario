package Jogo;

import Jogador.ControladorJogador;
import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;
import Casa.ControladorCasa;
import Dados.ControladorDado;

public class ControladorJogo {

	private ControladorCasa controlCasa;
	private ControladorDado controlDado;
	private DesenhaComponenteGrafico componenteGrafico;
	private InsereJogador insereJogador;
	private Jogador jogadorDaVez;
	
	public ControladorJogo() {
		this.componenteGrafico = new DesenhaComponenteGrafico();
		componenteGrafico.desenhaTabuleiro();
		this.insereJogador = new InsereJogador();
		insereJogadores();
		jogadorDaVez = RepositorioJogador.getInstance().getJogadores().get(0);
		componenteGrafico.desenhaPecasNoTabuleiroInicio();
		componenteGrafico.atualizaTabuleiro();
	}
	
	public void iniciarJogo() {
		Tabuleiro tabuleiro = new Tabuleiro();
	}
	
	public void insereJogadores() {
		insereJogador.inserirQtdJogadores();
		
	}


}
