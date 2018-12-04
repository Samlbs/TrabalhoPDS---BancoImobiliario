package Baralho;

import Casa.Casa;
import Jogador.Jogador;
import Repositorios.RepositorioCasas;
import View.DesenhaComponenteGrafico;

public class AvanceInicioRecebe200 extends Carta{

	public AvanceInicioRecebe200(int id, String nome, double valor) {
		super(id, nome, valor);
	}
	
	@Override
	public void ativarEfeito(Jogador jogador) {
		DesenhaComponenteGrafico componenteGrafico = new DesenhaComponenteGrafico();
		Casa casa = RepositorioCasas.getInstance().getCasaByPosicao(1);
		jogador.getConta().depositar(200);
		jogador.setPosicaoAtual(casa.getPosicao(), casa.getX(), casa.getY());
		componenteGrafico.desenhaPecasNoTabuleiroInicio();
		componenteGrafico.mensagemVaiInicioGanha200();
	}
}
