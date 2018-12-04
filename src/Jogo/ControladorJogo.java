package Jogo;

import Jogador.Jogador;
import Repositorios.RepositorioCasas;
import Repositorios.RepositorioJogador;
import View.DesenhaComponenteGrafico;
import jplay.Keyboard;
import teste.InicializarCasasTabuleiro;

import java.awt.event.KeyEvent;

import Casa.Casa;
import Casa.ControladorCasa;
import Casa.TerrenoComercializavel.Companhia;
import Casa.TerrenoComercializavel.Imovel;
import Casa.TerrenoComercializavel.TerrenoComercializavel;
import Dados.ControladorDado;

public class ControladorJogo {

	private ControladorCasa controlCasa;
	private ControladorDado controlDado;
	private DesenhaComponenteGrafico componenteGrafico;
	private InsereJogador insereJogador;
	private Jogador jogadorDaVez;
	private Keyboard teclado;
	private int iteraJogador;
	
	public ControladorJogo() {
		this.componenteGrafico = new DesenhaComponenteGrafico();
		componenteGrafico.lobby();
		this.insereJogador = new InsereJogador();
		iteraJogador = 0;
		iniciarJogo();
	}
	
	public void iniciarJogo() {
		Tabuleiro tabuleiro = new Tabuleiro(RepositorioCasas.getInstance().getTodosTerrenos());
		tabuleiro.inicialize();
		insereJogadores();
		componenteGrafico.desenhaTabuleiro(RepositorioJogador.getInstance().getJogadores());
		jogadorDaVez = RepositorioJogador.getInstance().getJogadores().get(iteraJogador);
		componenteGrafico.desenhaPecasNoTabuleiroInicio();
		componenteGrafico.mensagemInicial(RepositorioJogador.getInstance().getJogadores());
		
		this.teclado = componenteGrafico.getTeclado();
		
		int valorDado1;
		int valorDado2;
		Casa proxCasa;
		
		while(true) {
			if(teclado.keyDown(Keyboard.D_KEY)) {
				lancarDados();
				componenteGrafico.getCenario().run();
				valorDado1 = componenteGrafico.getCenario().getDado1().getValor();
				valorDado2 = componenteGrafico.getCenario().getDado2().getValor();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {e.printStackTrace();}
				
				if (RepositorioJogador.getInstance().getJogadoresPresos().contains(jogadorDaVez)) {
						if (componenteGrafico.getCenario().getDado1().getValor() == componenteGrafico.getCenario().getDado2().getValor()) {
							RepositorioJogador.getInstance().removeJogadorPreso(jogadorDaVez);
							int aux = componenteGrafico.getCenario().getDado1().getValor() + componenteGrafico.getCenario().getDado2().getValor();
							moverPecaJogador(aux);
							proxCasa = RepositorioCasas.getInstance().getCasaByPosicao(aux);
							if (proxCasa instanceof Imovel) {
								proxCasa.ativarEfeito(jogadorDaVez);
							} else {
								((TerrenoComercializavel) proxCasa).ativarEfeitoCompanhia(jogadorDaVez, componenteGrafico.getCenario().getDado1().getValor() 
										+ componenteGrafico.getCenario().getDado2().getValor());
							}
							break;
						}
				} else {
//					valorDado1 = componenteGrafico.getCenario().getDado1().getValor();
//					valorDado2 = componenteGrafico.getCenario().getDado2().getValor();
					int aux = getProxCasa(valorDado1 + valorDado2);
					moverPecaJogador(aux);
					proxCasa = RepositorioCasas.getInstance().getCasaByPosicao(aux);
					if (proxCasa instanceof Companhia) {
						((Companhia) proxCasa).ativarEfeitoCompanhia(jogadorDaVez, valorDado1 + valorDado2);
					} else {
						proxCasa.ativarEfeito(jogadorDaVez);
					}
					
//					if (valorDado1 == valorDado2) {
//						while (true) {
//							if(teclado.keyDown(Keyboard.D_KEY)) {
//								lancarDados();
//								componenteGrafico.getCenario().run();
//								
//								try {
//									Thread.sleep(300);
//								} catch (InterruptedException e) {
//									e.printStackTrace();
//								}
//								
//								valorDado1 = componenteGrafico.getCenario().getDado1().getValor();
//								valorDado2 = componenteGrafico.getCenario().getDado2().getValor();
//								if (valorDado1 == valorDado2) {
//									RepositorioJogador.getInstance().addJogadorPreso(jogadorDaVez);
//								} else {
//									aux = getProxCasa(valorDado1 + valorDado2);
//									moverPecaJogador(aux);
//									proxCasa = RepositorioCasas.getInstance().getCasaByPosicao(aux);
//									proxCasa.ativarEfeito(jogadorDaVez);
//								}
//								break;
//							}	
//						}
//					}
				}
				
				if(valorDado1 != valorDado2) {
					if(iteraJogador < RepositorioJogador.getInstance().getJogadores().size() - 1) {
						iteraJogador++;
						jogadorDaVez = RepositorioJogador.getInstance().getJogadores().get(iteraJogador);
					} else {
						iteraJogador = 0;
						jogadorDaVez = RepositorioJogador.getInstance().getJogadores().get(iteraJogador);
					}
					trocarFaixaJogador(jogadorDaVez.getId());
					componenteGrafico.getCenario().run();
				}
				
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
		Casa casa = RepositorioCasas.getInstance().getCasaByPosicao(valor);
		jogadorDaVez.setPosicaoAtual(valor, casa.getX(), casa.getY());
		componenteGrafico.desenhaPecasNoTabuleiroInicio();
	}
	
	public void trocarFaixaJogador(int id) {
		componenteGrafico.getCenario().setFaixaJogadorDaVez(id);
	}
	
	public int getProxCasa(int valor) {
		int posCasaMover = jogadorDaVez.getPosicaoAtual() + valor;
		if(posCasaMover > 40) {
			posCasaMover = posCasaMover - 40;
			jogadorDaVez.getConta().depositar(200);
			componenteGrafico.mensagemPassouInicio();
		}
		return posCasaMover;
	}
	
}
