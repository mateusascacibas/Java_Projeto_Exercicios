package condicional;

import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Condicional extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		System.out.print("1 - Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.\n");
		System.out.println("Digite o numero: ");
		num = teclado.nextInt();
		System.out.println("\n");
		if(num < 0 ) {
			System.out.println("Negativo.");
		}
		else {
			System.out.println("Positivo ou 0.");
		}
		
	}
	
	public static void exercicio02() {
		System.out.println("2 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.");
		System.out.println("Digite o numero: ");
		num = teclado.nextInt();
		System.out.println("\n");
		if(num % 2 == 0 ) {
			System.out.println("Par.");
		}
		else {
			System.out.println("Impar.");
		}
	}

	
	
	
}


