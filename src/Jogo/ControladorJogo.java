package Jogo;

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
		componenteGrafico.lobby();
		this.insereJogador = new InsereJogador();
		iniciarJogo();
	}
	
	public void iniciarJogo() {
		insereJogadores();
		componenteGrafico.desenhaTabuleiro(RepositorioJogador.getInstance().getJogadores());
		jogadorDaVez = RepositorioJogador.getInstance().getJogadores().get(0);
		componenteGrafico.desenhaPecasNoTabuleiroInicio();
		componenteGrafico.mensagemInicial(RepositorioJogador.getInstance().getJogadores());
		Tabuleiro tabuleiro = new Tabuleiro();
		while(true) {
			
		}
	}
	
	public void insereJogadores() {
		insereJogador.inserirQtdJogadores();
		
	}


}
