package sequencial;

import java.util.Scanner;

public class Exercicios_Sequencial {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		int n1, n2;
		
			System.out.print("1 - Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma\r\n"
				+ "mensagem explicativa, conforme exemplos.\n");
			System.out.println("Primeiro numero: ");
			n1 = teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2 = teclado.nextInt();
			System.out.println("\n");
			System.out.println("Soma: " + (n1 + n2));
			
		
	}
}
