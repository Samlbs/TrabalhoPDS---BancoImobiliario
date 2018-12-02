package teste;

import java.util.ArrayList;
import java.util.List;

import Casa.Cadeia;
import Casa.Casa;
import Casa.ImpostoDeRenda;
import Casa.LucrosEDividendos;
import Casa.ParadaLivre;
import Casa.Partida;
import Casa.SorteReves;
import Casa.VaiParaCadeia;
import Casa.TerrenoComercializavel.Companhia;
import Casa.TerrenoComercializavel.Imovel;
import Jogo.Tabuleiro;

public class InicializarDados {
	//lado esquerdo da tela
	Casa pontoPartida = new Partida("Ponto de Partida", 1, 1, 640, 0);
	
	Casa leblon = new Imovel("Leblon", 2, 2, 640, 64, 100, "Lilas", 50, null);
	
	Casa sorteReves1 = new SorteReves("SorteOuReves", 3, 3, 640, 128);
	
	Casa avPresidenteVargas = new Imovel("Av. Presidente Vargas", 4, 4, 640, 192, 60, "Lilas", 50, null);
	
	Casa avNossaSenhoraCopacabana = new Imovel("Av. Nossa Senhora de Copacabana", 5, 5, 640, 256, 60, "Lilas", 50, null);
	
	Casa ferroviaria = new Companhia("Companhia Ferroviaria", 6, 6, 640, 320, 200, 50);
	
	Casa avBrigadeiroFariaLima = new Imovel("Av. Brigadeiro Faria Lima", 7, 7, 640, 384, 240, "Azul", 150, null);
	
	Casa viacao = new Companhia("Companhia de Viacao", 8, 8, 640, 448, 200, 50);
	
	Casa avReboucas = new Imovel("Av. Reboucas", 9, 9, 640, 512, 220, "Azul", 150, null);
	
	Casa avNoveJulho = new Imovel("Av. 9 de Julho", 10, 10, 640, 576, 220, "Azul", 150, null);
	
	Casa prisao = new Cadeia("Cadeia", 11, 11, 640, 640);
	//parte de baixo da tela
	Casa avEuropa = new Imovel("Av. Europa", 12, 12, 576, 640, 200, "Roxo", 100, null);
	
	Casa sorteReves2 = new SorteReves("SorteOuReves", 13, 13, 512, 640);
	
	Casa ruaAugusta = new Imovel("Rua Augusta", 14, 14, 448, 640, 180, "Roxo", 100, null);
	
	Casa avPacaenbu = new Imovel("Av. Pacaembu", 15, 15, 384, 640, 180, "Roxo", 100, null);
	
	Casa taxi = new Companhia("Companhia de Taxi", 16, 16, 320, 640, 200, 40);
	
	Casa sorteReves3 = new SorteReves("SorteOuReves", 17, 17, 256, 640);
	
	Casa interlagos = new Imovel("Interlagos", 18, 18, 192, 640, 350, "Laranja", 200, null);
	
	Casa LucrosDividendos = new LucrosEDividendos("Lucros e Dividendos", 19, 19, 128, 640);
	
	Casa morumbi = new Imovel("Morumbi", 20, 20, 64, 640, 400, "Laranja", 200, null);
	//lado direito da tela
	Casa paradaLivre = new ParadaLivre("Parada Livre", 21, 21, 0, 640);
	
	Casa flamengo = new Imovel("Flamengo", 22, 22, 0, 576, 120, "Rosa", 50, null);
	
	Casa sorteReves4 = new SorteReves("SorteOuReves", 23, 23, 0, 512);
	
	Casa botafogo = new Imovel("Botafogo", 24, 24, 0, 448, 100, "Rosa", 50, null);
	
	Casa impostoRenda = new ImpostoDeRenda("Imposto de Renda", 25, 25, 0, 384);
	
	Casa navegacao = new Companhia("Companhia de Navegacao", 26, 26, 0, 320, 200, 40);
	
	Casa avBrasil = new Imovel("Av. Brasil", 27, 27, 0, 256, 160, "Amarelo", 100, null);
	
	Casa sorteReves5 = new SorteReves("SorteOuReves", 28, 28, 0, 192);
	
	Casa avPaulista = new Imovel("Av. Paulista", 29, 29, 0, 128, 140, "Amarelo", 100, null);
	
	Casa jardimEuropa = new Imovel("Jardim Europa", 30, 30, 0, 64, 140, "Amarelo", 100, null);
	
	Casa vaParaPrisao = new VaiParaCadeia("Va Para Prisao", 31, 31, 0, 0);
	//lado de cima
	Casa copacabana = new Imovel("Copacabana", 32, 32, 64, 0, 260, "Verde", 150, null);
	
	Casa aviacao = new Companhia("Companhia de Aviacao", 33, 33, 128, 0, 200, 50);
	
	Casa avVieiraSouto = new Imovel("Av. Vieira Souto", 34, 34, 192, 0, 320, "Verde", 200, null);
	
	Casa avAtlantica = new Imovel("Av. Atlantica", 35, 35, 256, 0, 300, "Verde", 200, null);
	
	Casa taxiAereo = new Companhia("Companhia de Taxi Aereo", 36, 36, 320, 0, 200, 50);
	
	Casa ipanema = new Imovel("Ipanema", 37, 37, 384, 0, 300, "Verde", 200, null);
	
	Casa sorteReves6 = new SorteReves("SorteOuReves", 38, 38, 448, 0);
	
	Casa jardimPaulista = new Imovel("Jardim Paulista", 39, 39, 512, 0, 280, "Azul Escuro", 150, null);
	
	Casa brooklin = new Imovel("Brooklin", 40, 40, 576, 0, 260, "Azul Escuro", 150, null);
	
	public void inicialize(Tabuleiro tabuleiro) {
		
	}
}

