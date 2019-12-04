package Main;

import java.util.Scanner;

public class Tabuleiro {
	Scanner sc = new Scanner(System.in);

	private char pecaDefault = '#'; // OK
	private char[][] tabuleiro = new char[3][3];// OK
	private int qtdPecas = 0;// OK

	public Tabuleiro(int dimencaoDoTabuleiro, char pecaDefault) { // OK

		for (int linha = 0; linha < dimencaoDoTabuleiro; linha++) {
			System.out.println("+-----+-----+-----+");
			for (int coluna = 0; coluna < dimencaoDoTabuleiro; coluna++) {
				System.out.print("| ");
				System.out.print(" " + pecaDefault + " ");
				System.out.print(" ");;
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

	public void inicializaTabuleiro() { // OK

		System.out.println("         JOGO DA VELHA:");
		System.out.println("       Jogador Humano: X.");
		System.out.println("      Jogador Virtual: O.\n");

		for (int i = 0; i < 3; i++) {
			System.out.println("+-----+-----+-----+");
			for (int j = 0; j < 3; j++) {
				System.out.print("|");
				System.out.print("  ");
				System.out.print("" + tabuleiro[i][j] + "  ");
			}
			System.out.println("|");
		}
		System.out.println("+-----+-----+-----+");
	}

	public boolean adicionarPeca(char peca, int i, int j) { // OK
		if ((i < 0) || (i > 2)) {
			return false;
		}
		if ((j < 0) || (j > 2)) {
			return false;
		}
		if (tabuleiro[i][j] != 0) {
			return false;
		}
		tabuleiro[i][j] = peca;
		return true;

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