package Main;

import java.util.Scanner;

public class Tabuleiro {
	Scanner sc = new Scanner(System.in);

	private char pecaDefault = '#';
	private char[][] tabuleiro = new char[3][3];
	private int qtdPecas = 0;

	public Tabuleiro(int dimencaoDoTabuleiro, char pecaDefault) {

		for (int linha = 0; linha < dimencaoDoTabuleiro; linha++) {
			System.out.println("+-----+-----+-----+");
			for (int coluna = 0; coluna < dimencaoDoTabuleiro; coluna++) {
				System.out.print("| ");
				System.out.print(" " + pecaDefault + " ");
				System.out.print(" ");
				tabuleiro[linha][coluna] = pecaDefault;
			}
			System.out.println("|");
		}
		System.out.println("+-----+-----+-----+");

		char op;

		do {

			System.out.println("Deseja iniciar o tabuleiro?");
			System.out.println("I - Iniciar Jogo\nS - Sair.");
			op = sc.next().charAt(0);

			switch (op) {
			case 'i':
				break;

			case 's':
				System.out.println("Saindo...");
				System.exit('s');
				break;

			default:
				System.out.println("Entrada inválida.");
				break;
			}

		} while (op != 'i');
	}

	// INICIALIZA = IMPRIME -> FAZER LINHAS DE CIMA E DE BAIXO!
	public void inicializaTabuleiro() {

		System.out.println("         JOGO DA VELHA:");
		System.out.println("       Jogador Humano: X.");
		System.out.println("      Jogador Virtual: O.\n");

		for (int linha = 0; linha < tabuleiro.length; linha++) {
			System.out.println("+-----+-----+-----+");
			for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				System.out.print("| ");
				System.out.print("   ");
				System.out.print(" ");
				tabuleiro[linha][coluna] = ' ';
			}
			System.out.println("|");
		}
		System.out.println("+-----+-----+-----+");

	}

	public boolean adicionarPeca(char peca, int i, int j) {

		return false;

	}

	public void removerPeca(int i, int j) {

	}

	public String toString() {
		return null;

	}

	public char getPecas(int i, int j) {
		return pecaDefault;

	}

	public int getQtdPecas() {
		return pecaDefault;

	}

}
