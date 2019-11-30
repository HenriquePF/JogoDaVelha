package Main;

public class Tabuleiro {
	
	private char pecaDefault = '#';
	private char[][] tabuleiro = new char[3][3];
	private int qtdPecas = 0;

	public Tabuleiro(int dimencaoDoTabuleiro, char pecaDefault) {
		System.out.println("         JOGO DA VELHA:");
		System.out.println("       Jogador Humano: X.");
		System.out.println("      Jogador Virtual: O.\n");
		
		for (int linha = 0; linha < dimencaoDoTabuleiro; linha++) {
			for (int coluna = 0; coluna < dimencaoDoTabuleiro; coluna++) {
				System.out.print("| ");
				System.out.print(" " + tabuleiro[linha][coluna] + " ");
				System.out.print(" ");
			 	tabuleiro[linha][coluna] = pecaDefault;
			}
			System.out.println("|");
		}
	}
	
	// INICIALIZA = IMPRIME -> FAZER LINHAS DE CIMA E DE BAIXO!
	public void inicializaTabuleiro() {
		System.out.println("         JOGO DA VELHA:");
		System.out.println("       Jogador Humano: X.");
		System.out.println("      Jogador Virtual: O.\n");
		
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				System.out.print("| ");
				System.out.print(" " + tabuleiro[linha][coluna] + " ");
				System.out.print(" ");
			 	tabuleiro[linha][coluna] = pecaDefault;
			}
			System.out.println("|");
		}
	}
	
//	public void imprimir() {
//
//		int qtd = 3;
//		int qtd2 = 0;
//
//		System.out.println("----------------");
//		for (int linha = 0; linha <= 2; linha++) {
//			for (int coluna = 0; coluna <= 2; coluna++) {
//				if (((0 - 1) > 0) || (1 > qtd)) {
//					System.out.print("|    ");
//				} else {
//					if (qtd2 < 10) {
//
//						System.out.print("|  " + tabuleiro[coluna][linha] + " ");
//					}
//
//					qtd2 += 1;
//				}
//			}
//			System.out.println("|");
//			System.out.println("----------------");
//		}
//
//	}
	
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
