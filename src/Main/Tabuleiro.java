package Main;

public class Tabuleiro {

	//REFAZER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	int[][] tab = new int[3][3];

	public void inicializa(int valor) {
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				tab[l][c] = valor;
			}
		}
	}

	//TEMPORARIO
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

						System.out.print("|  " + tab[coluna][linha] + " ");
					}

					qtd2 += 1;
				}
			}
			System.out.println("|");
			System.out.println("----------------");
		}

	}

	public void altera(int valor, int l, int c) {
		tab[l][c] = valor;
	}

	public int consulta(int l, int c) {
		return tab[l][c];
	}

}
