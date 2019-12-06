package Main;

public class JogoDaVelha extends JogoDeTabuleiro{
	
	protected int tamaho;
	
	public JogoDaVelha(int tamanho, char caractereDefault) {
		super(tamanho, caractereDefault);
		this.tamaho = tamanho;
	}

	public boolean venceu(char idJogador) {
		for (int i = 0; i < 3; i++) {							// linha
			if ((tabuleiro.getPecas(i, 0) == idJogador) && (tabuleiro.getPecas(i, 1) == idJogador)
					&& (tabuleiro.getPecas(i, 2) == idJogador)) {
				return true;
			}
		}
		
		for (int i = 0; i < 3; i++) {							// coluna
			if ((tabuleiro.getPecas(0, i) == idJogador) && (tabuleiro.getPecas(1, i) == idJogador)
					&& (tabuleiro.getPecas(2, i) == idJogador)) {
				return true;
			}
		}


		if ((tabuleiro.getPecas(0, 0) == idJogador) && (tabuleiro.getPecas(1, 1) == idJogador) 
				&& (tabuleiro.getPecas(2, 2) == idJogador)) {
			return true;
		}
		if ((tabuleiro.getPecas(0, 2) == idJogador) && (tabuleiro.getPecas(1, 1) == idJogador) 
				&& (tabuleiro.getPecas(2, 0) == idJogador)) {
			return true;
		}

		
		return false;
	}
	
	public void jogar() {
		tabuleiro.inicializaTabuleiro();
		
		while (true) {
			tabuleiro.toString();
			jogar(jogador1);
			if (venceu(jogador1.getId())) {
				tabuleiro.toString();
				System.out.println("Jogador Humano venceu!");
				break;
			}
			
			if (tabuleiro.getQtdPecas() == 9) {
				tabuleiro.toString();
				System.out.println("Velha");
				break;
			}
			
			jogar(jogador2);
			if (venceu(jogador2.getId())) {
				tabuleiro.toString();
				System.out.println("Jogador Virtual venceu!");
				break;
			}
			
			if (tabuleiro.getQtdPecas() == 9) {
				tabuleiro.toString();
				System.out.println("Velha");
				break;
			}
		}
		
	}
	
	private void jogar(Jogador jogador) {
		int [] position = new int[1];
		do {
			position = jogador.jogar();
		} while(tabuleiro.adicionarPeca(jogador.getId(), position[0], position[1]));
 	}
	
	
 }