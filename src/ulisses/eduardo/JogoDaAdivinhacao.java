package extra;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

	public static void main(String[] args) {

		int NUMERO_ALEATORIO = new Random().nextInt(101);
		
		Scanner sc = new Scanner(System.in);

		int tentativas = 0;
		int chute = -1;
		
		
		System.out.println
		("""
				
		======================
		JOGO DO NÚMERO SECRETO
		======================

		""");
				
		while (chute != NUMERO_ALEATORIO) {
			System.out.printf("Chute um número entre 0 e 100: %n");
			chute  = sc.nextInt();
			tentativas++;
			if (chute == NUMERO_ALEATORIO) {
				System.out.printf("Parabéns! Você acertou em %d tentativas", tentativas);
				break;
			} else if (chute < NUMERO_ALEATORIO) {
				System.out.println("Errou. Muito baixo");
			} else {
				System.out.println("Errou. Número muito alto");
			}
		}
		
		sc.close();
	}

}
