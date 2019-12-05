package Main;

abstract class JogoDeTabuleiro implements Jogo{

	protected Tabuleiro tabuleiro;
	
	JogadorHumano jogador1 = new JogadorHumano('X');
	JogadorVirtual jogador2 = new JogadorVirtual('O');
	
	public JogoDeTabuleiro(int tamanho, char caractereDefault) {
		this.tabuleiro = new Tabuleiro(tamanho, caractereDefault);
	}
	
	
	
}