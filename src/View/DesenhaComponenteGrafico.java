package View;

import javax.swing.JOptionPane;

import Jogador.Jogador;
import Repositorios.RepositorioJogador;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class DesenhaComponenteGrafico {
	private Window window;
	private Scene scene;
	
	public DesenhaComponenteGrafico() {
		
	}
	
	public void desenhaTabuleiro() {
		this.window = new Window(704, 704);
		//GameImage back = new GameImage("src//recursos//sprite//back.png");
		//back.draw();
		scene = new Scene();
		scene.loadFromFile(URL.scenario("cenario.scn"));
		scene.draw();
		window.update();
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
			//System.out.println(j.getPecaJogador());
			scene.addOverlay(j.getPecaJogador());
		}
		
	}
	
	public void atualizaTabuleiro() {
		scene.draw();
//		desenhaBotaoDados();
//		desenhaBotaoPortifolio();
		window.update();
	}
}
