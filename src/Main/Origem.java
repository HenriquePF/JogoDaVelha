package Main;

import java.util.Scanner;

public class Origem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tabuleiro tab = new Tabuleiro(3, '#');
		tab.inicializaTabuleiro();
		JogadorHumano humanPlayer = new JogadorHumano('X');
		JogadorVirtual virtualPlayer = new JogadorVirtual('O');
		
		do {
			System.out.println("Jogador : ");
			System.out.println("Linha:");
			int i = sc.nextInt();
			System.out.println("Coluna:");
			int j = sc.nextInt();
			System.out.println("Peça:");
			char peca = sc.next().charAt(0);
			
			tab.adicionarPeca(peca, i - 1, j - 1);
			tab.inicializaTabuleiro();
			
		} while (true);

		

	}

}