package View;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;
import recursos.cenarios.CenarioPrincipal;

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
		Integer[] qtd = {2, 3, 4, 5, 6};
		JComboBox<Integer> combo = new JComboBox<>(qtd);

		Object[] opcoes = {2, 3, 4, 5, 6};
		Object res = JOptionPane.showInputDialog(null, "Escolha a quantidade de jogadores" , "Selecao de itens" ,
						JOptionPane.PLAIN_MESSAGE , null ,opcoes,"");
//		System.out.println((int) res);
		return (Integer) res;
	}
}
