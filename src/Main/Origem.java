package Main;

import java.util.Scanner;

public class Origem {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		JogoDaVelha jogo = new JogoDaVelha(3, '#');
//		Tabuleiro tab = new Tabuleiro(3, '#');
//		tab.inicializaTabuleiro();
//		
//		Jogador humano = new JogadorHumano('X');
//		Jogador virtual = new JogadorHumano('O');
//		
//		do {
//			System.out.println("Jogador : ");
//			System.out.println("Linha:");
//			int i = sc.nextInt();
//			System.out.println("Coluna:");
//			int j = sc.nextInt();
//			System.out.println("Peça:");
//			char peca = sc.next().charAt(0);
//			
//			tab.adicionarPeca(peca, i - 1, j - 1);
//			tab.inicializaTabuleiro();
//			
//			jogo.venceu('X');
//		} while (true);

		JogoDaVelha jogo = new JogoDaVelha(3, '#');
		jogo.jogar();
		

	}

}