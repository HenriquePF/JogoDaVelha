package Main;

public class JogadorVirtual extends Jogador{

	public JogadorVirtual(char id) {
		super(id);
	}
	
	int inteligencia() {
		return 0;
		
	}
	
	@Override
	public int[] jogar() {
		int[] position = new int[2];
		position[0] = Utils.sortear(0, 3);
		position[1] = Utils.sortear(0, 3);
 		return position;
	}
	
}