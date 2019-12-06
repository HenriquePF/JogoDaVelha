package Main;

import java.util.Scanner;

public class Tabuleiro {
	Scanner sc = new Scanner(System.in);

	private char pecaDefault = '#';
	private char[][] tabuleiro = new char[3][3];
	private int qtdPecas = 0;

	public Tabuleiro(int dimencaoDoTabuleiro, char pecaDefault) {
		this.pecaDefault = pecaDefault;
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
		this.qtdPecas = 0;
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

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
		
	}

	public boolean adicionarPeca(char peca, int i, int j) {
		if ((i < 0) || (i > 2)) {
			return false;
		}
		if ((j < 0) || (j > 2)) {
			return false;
		}
		if (tabuleiro[i][j] == ' ') {
			tabuleiro[i][j] = peca;
			return true;

		}
		return false;
	}

	public void removerPeca(int i, int j) {
		
	}

	@Override
	public String toString() {

		for (int linha = 0; linha < tabuleiro.length; linha++) {
			System.out.println("+-----+-----+-----+");
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				System.out.print("| ");
				if(tabuleiro[linha][coluna] == ' ') {
					System.out.print("   ");
				}else {
					System.out.print(tabuleiro[linha][coluna] + "  ");
				}
				System.out.print(" ");;
			}
			System.out.println("|");
		}
		System.out.println("+-----+-----+-----+");
		return "X";

	}

	public char getPecas(int i, int j) {
		return tabuleiro[i][j];

	}

	public int getQtdPecas() {
		return qtdPecas;

	}

}