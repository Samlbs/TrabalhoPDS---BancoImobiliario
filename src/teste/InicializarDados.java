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
	
	Casa pontoPartida = new Partida("Ponto de Partida", 1, 1);
	
	Casa leblon = new Imovel("Leblon", 2, 2, 100, "Lilás", 50, null);
	
	Casa sorteReves1 = new SorteReves("SorteOuReves", 3, 3);
	
	Casa avPresidenteVargas = new Imovel("Av. Presidente Vargas", 4, 4, 60, "Lilás", 50, null);
	
	Casa avNossaSenhoraCopacabana = new Imovel("Av. Nossa Senhora de Copacabana", 5, 5, 60, "Lilás", 50, null);
	
	Casa ferroviaria = new Companhia("Companhia Ferroviária", 6, 6, 200, 50);
	
	Casa avBrigadeiroFariaLima = new Imovel("Av. Brigadeiro Faria Lima", 7, 7, 240, "Azul", 150, null);
	
	Casa viacao = new Companhia("Companhia de Viacao", 8, 8, 200, 50);
	
	Casa avReboucas = new Imovel("Av. Reboucas", 9, 9, 220, "Azul", 150, null);
	
	Casa avNoveJulho = new Imovel("Av. 9 de Julho", 10, 10, 220, "Azul", 150, null);
	
	Casa prisao = new Cadeia("Cadeia", 11, 11);
	
	Casa avEuropa = new Imovel("Av. Europa", 12, 12, 200, "Roxo", 100, null);
	
	Casa sorteReves2 = new SorteReves("SorteOuReves", 13, 13);
	
	Casa ruaAugusta = new Imovel("Rua Augusta", 14, 14, 180, "Roxo", 100, null);
	
	Casa avPacaenbu = new Imovel("Av. Pacaembu", 15, 15, 180, "Roxo", 100, null);
	
	Casa taxi = new Companhia("Companhia de Taxi", 16, 16, 200, 40);
	
	Casa sorteReves3 = new SorteReves("SorteOuReves", 17, 17);
	
	Casa interlagos = new Imovel("Interlagos", 18, 18, 350, "Laranja", 200, null);
	
	Casa LucrosDividendos = new LucrosEDividendos("Lucros e Dividendos", 19, 19);
	
	Casa morumbi = new Imovel("Morumbi", 20, 20, 400, "Laranja", 200, null);
	
	Casa paradaLivre = new ParadaLivre("Parada Livre", 21, 21);
	
	Casa flamengo = new Imovel("Flamengo", 22, 22, 120, "Rosa", 50, null);
	
	Casa sorteReves4 = new SorteReves("SorteOuReves", 23, 23);
	
	Casa botafogo = new Imovel("Botafogo", 24, 24, 100, "Rosa", 50, null);
	
	Casa impostoRenda = new ImpostoDeRenda("Imposto de Renda", 25, 25);
	
	Casa navegacao = new Companhia("Companhia de Navegacao", 26, 26, 200, 40);
	
	Casa avBrasil = new Imovel("Av. Brasil", 27, 27, 160, "Amarelo", 100, null);
	
	Casa sorteReves5 = new SorteReves("SorteOuReves", 28, 28);
	
	Casa avPaulista = new Imovel("Av. Paulista", 29, 29, 140, "Amarelo", 100, null);
	
	Casa jardimEuropa = new Imovel("Jardim Europa", 30, 30, 140, "Amarelo", 100, null);
	
	Casa vaParaPrisao = new VaiParaCadeia("Vá Para Prisao", 31, 31);
	
	Casa copacabana = new Imovel("Copacabana", 32, 32, 260, "Verde", 150, null);
	
	Casa aviacao = new Companhia("Companhia de Aviacao", 33, 33, 200, 50);
	
	Casa avVieiraSouto = new Imovel("Av. Vieira Souto", 34, 34, 320, "Verde", 200, null);
	
	Casa avAtlantica = new Imovel("Av. Atlantica", 35, 35, 300, "Verde", 200, null);
	
	Casa taxiAereo = new Companhia("Companhia de Taxi Aereo", 36, 36, 200, 50);
	
	Casa ipanema = new Imovel("Ipanema", 37, 37, 300, "Verde", 200, null);
	
	Casa sorteReves6 = new SorteReves("SorteOuReves", 38, 38);
	
	Casa jardimPaulista = new Imovel("Jardim Paulista", 39, 39, 280, "Azul Escuro", 150, null);
	
	Casa brooklin = new Imovel("Brooklin", 40, 40, 260, "Azul Escuro", 150, null);
	
	public void inicialize(Tabuleiro tabuleiro) {
		
	}
}

