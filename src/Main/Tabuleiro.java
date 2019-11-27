package Main;

public class Tabuleiro {
	
	private char pecaDefault = 0;
	private char[][] tabuleiro = new char[3][3];
	private int qtdPecas = 0;

	public Tabuleiro(int dimencaoDoTabuleiro, char pecaDefault) {
		for (int i = 0; i < dimencaoDoTabuleiro; i++) {
			for (int j = 0; j < dimencaoDoTabuleiro; j++) {
				tabuleiro[i][j] = pecaDefault;
			}
		}
	}
	
	public void inicializaTabuleiro() {
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				tabuleiro[l][c] = ' ';
			}
		}
	}
	
	public void imprimir() {

		int qtd = 3;
		int qtd2 = 0;

		System.out.println("----------------");
		for (int linha = 0; linha <= 2; linha++) {
			for (int coluna = 0; coluna <= 2; coluna++) {
				if (((0 - 1) > 0) || (1 > qtd)) {
					System.out.print("|    ");
				} else {
					if (qtd2 < 10) {

						System.out.print("|  " + tabuleiro[coluna][linha] + " ");
					}

					qtd2 += 1;
				}
			}
			System.out.println("|");
			System.out.println("----------------");
		}

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
