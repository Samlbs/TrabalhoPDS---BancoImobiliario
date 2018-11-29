package Casa;

import Verificadores.VerificadorRegraCasa;
import Casa.TerrenoComercializavel.ControladorTerrenoComercializavel;
import Jogador.Jogador;

public class ControladorCasa implements VerificadorRegraCasa {

	private ControladorTerrenoComercializavel controlTerrenoComercializavel;

	public int getId() {
		return 0;
	}

	public String getNome() {
		return null;
	}

	public int getPosicao() {
		return 0;
	}

	public void setPosicao(int posicao) {

	}

	public void ativarEfeito(Jogador jogador) {

	}


	/**
	 * @see Verificadores.VerificadorRegraCasa#validaRegraConstrucoes()
	 */
	public void validaRegraConstrucoes() {

	}

}
