package Main;

import java.util.Scanner;

public class JogadorHumano extends Jogador{
	Scanner sc = new Scanner(System.in);
	
	public JogadorHumano(char id) {
		super(id); 
	}
	
	@Override
	public int[] jogar() {
		
		System.out.println("Insira linha e a coluna:");
		int[] position = new int[2];
		position[0] = sc.nextInt();
		position[1] = sc.nextInt();
 		return position;	
	}

}