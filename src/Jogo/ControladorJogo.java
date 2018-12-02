package Jogo;

import Jogador.Jogador;
import Repositorios.RepositorioCasas;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;
import jplay.Keyboard;

import java.awt.event.KeyEvent;

import Casa.Casa;
import Casa.ControladorCasa;
import Dados.ControladorDado;

public class ControladorJogo {

	private ControladorCasa controlCasa;
	private ControladorDado controlDado;
	private DesenhaComponenteGrafico componenteGrafico;
	private InsereJogador insereJogador;
	private Jogador jogadorDaVez;
	private Keyboard teclado;
	
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
		this.teclado = componenteGrafico.getTeclado();
		while(true) {
			if(teclado.keyDown(Keyboard.D_KEY)) {
				lancarDados();
				componenteGrafico.getCenario().run();
				moverPecaJogador(componenteGrafico.getCenario().getDado1().getValor()
						+ componenteGrafico.getCenario().getDado2().getValor());
			}
		}
	}
	
	public void insereJogadores() {
		insereJogador.inserirQtdJogadores();	
	}

	public void lancarDados() {
		componenteGrafico.getCenario().getDado1().lancar();
		componenteGrafico.getCenario().getDado1().mudarFace();
		componenteGrafico.getCenario().getDado2().lancar();
		componenteGrafico.getCenario().getDado2().mudarFace();
	}
	
	public void moverPecaJogador(int valor) {
		int posCasaMover = jogadorDaVez.getPosicaoAtual() + valor;
		if(posCasaMover > 40) {
			posCasaMover = posCasaMover - 40;
		}
		Casa casa = RepositorioCasas.getInstance().getCasaByPosicao(posCasaMover);
		jogadorDaVez.setPosicaoAtual(posCasaMover, casa.getX(), casa.getY());
		componenteGrafico.desenhaPecasNoTabuleiroInicio();
	}
}
