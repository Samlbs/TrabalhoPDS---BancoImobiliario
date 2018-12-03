package View;

import java.util.List;

import javax.swing.JOptionPane;

import Jogador.Jogador;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;
import recursos.cenarios.Cenario1;

public class DesenhaComponenteGrafico {
	private Window window;
	private Scene scene;
	private Keyboard teclado;
	private Cenario1 cenario;
	public DesenhaComponenteGrafico() {
		
	}
	
	public void lobby() {
		this.window = new Window(704, 704);
		scene = new Scene();
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
		cenario = new Cenario1(window, jogadores, scene, teclado);
	}
	
	public int telaInserirQtdJogador() {
		Object[] opcoes = {2, 3, 4, 5, 6};
		Object res = JOptionPane.showInputDialog(null, "Escolha a quantidade de jogadores" , "Selecao de itens" ,
						JOptionPane.PLAIN_MESSAGE , null ,opcoes,"");
		return (Integer) res;
	}
	
	public void desenhaPecasNoTabuleiroInicio() {
		cenario.run();
	}
	
	public void mensagemInicial(List<Jogador> jogadores) {
		String mensagemInicial = "";
		for(Jogador j: jogadores) {
			mensagemInicial = mensagemInicial + "Jogador"+j.getId()+" é a peca de cor "+j.getPecaJogador().getCor()+"\n";
		}
		JOptionPane.showMessageDialog(null, mensagemInicial, null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	public Keyboard getTeclado() {
		return this.teclado;
	}
	
	public Cenario1 getCenario() {
		return this.cenario;
	}
	
	public int mensagemConfirmacaoCompra() {
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja comprar este Imóvel?", null, JOptionPane.YES_NO_OPTION);
		return resposta;
	}
	
	public void mensagemPagarTaxa(double valor) {
		JOptionPane.showMessageDialog(null, "Você terá que pagar "+valor+" de taxa", null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensagemSorteReves(String tipo, double valor) {
		if(tipo.equals("Sorte")) {
			JOptionPane.showMessageDialog(null, "Sorte Ou Reves\nSORTE ganhou " + valor, null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Sorte Ou Reves\nREVES pedeu " + valor, null, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void mensagemSorteRecebe50DeTodos() {
		JOptionPane.showMessageDialog(null, "Sorte Ou Reves\nSORTE ganhou 50 de Todos", null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensagemSorteSaidaLivre() {
		JOptionPane.showMessageDialog(null, "Sorte Ou Reves\nSORTE ganhou passe livre", null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensagemRevesVaParaCadeia() {
		JOptionPane.showMessageDialog(null, "Sorte Ou Reves\nREVES va para cadeia", null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensagemPreso() {
		JOptionPane.showMessageDialog(null, "Que pena! Você está preso!", null, JOptionPane.INFORMATION_MESSAGE);
	}
}
