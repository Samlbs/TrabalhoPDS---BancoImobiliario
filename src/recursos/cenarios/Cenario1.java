package recursos.cenarios;

import java.util.List;

import Jogador.Jogador;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 {
	private Window window;
	private Scene scene;
	private List<Jogador> jogadores;
	
	public Cenario1(Window window, List<Jogador> jogadores) {
		this.window = window;
		scene = new Scene();
		scene.loadFromFile(URL.scenario("cenario.scn"));
		this.jogadores = jogadores;
		scene.draw();
		window.update();
		//run();
	}
	
	public void run() {
		scene.draw();
		for(Jogador j: jogadores) {
			j.getPecaJogador().draw();
			j.getPecaJogador().update();
		}
		window.update();
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
	
}
