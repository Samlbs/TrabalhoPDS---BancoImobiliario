package recursos.cenarios;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class CenarioPrincipal {
	private Window window;
	private Scene scene;
	
	public CenarioPrincipal(Window window) {
		this.window = window;
		scene = new Scene();
		scene.loadFromFile(URL.scenario("cenario.scn"));
		
		run();
	}

	private void run() {
		while(true) {
			scene.draw();
			window.update();
		}
	}
}
