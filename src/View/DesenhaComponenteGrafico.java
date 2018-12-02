package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;
import recursos.cenarios.Cenario1;

public class DesenhaComponenteGrafico {
	private Window window;
	private Keyboard teclado;
	private Cenario1 cenario;
	
	public DesenhaComponenteGrafico() {
		
	}
	
	public void lobby() {
		this.window = new Window(704, 704);
		GameImage back = new GameImage("src//recursos//sprites//back.png");
		teclado = window.getKeyboard();
		boolean sair = false;
		while(!sair) {
			back.draw();
			window.update();
			if(teclado.keyDown(Keyboard.ENTER_KEY)) {
				sair = true;
				break;
			}
		}
	}
	
	public void desenhaTabuleiro(List<Jogador> jogadores) {
		cenario = new Cenario1(window, jogadores);
	}
	
	public int telaInserirQtdJogador() {
		Object[] opcoes = {2, 3, 4, 5, 6};
		Object res = JOptionPane.showInputDialog(null, "Escolha a quantidade de jogadores" , "Selecao de itens" ,
						JOptionPane.PLAIN_MESSAGE , null ,opcoes,"");
//		System.out.println((int) res);
		return (Integer) res;
	}
	
	public void desenhaPecasNoTabuleiroInicio() {
		for(Jogador j: RepositorioJogador.getInstance().getJogadores()) {
			System.out.println(j.getPecaJogador());
			cenario.getScene().addOverlay(j.getPecaJogador());
		}
		
	}
	
	public void atualizaTabuleiro() {
//		scene.draw();
//		desenhaBotaoDados();
//		desenhaBotaoPortifolio();
//		window.update();
	}
}
