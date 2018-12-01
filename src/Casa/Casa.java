package Casa;

import java.util.List;
import Jogador.Jogador;

public abstract class Casa implements IEfeitoCasa {

	private String nome;
	private List<Jogador> JogadoresNaCasa;
	private int posicao;
	private int id;

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public abstract void ativarEfeito(Jogador jogador);

}
