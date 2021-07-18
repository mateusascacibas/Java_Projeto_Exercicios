package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;


public class Exercicios_Collections {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		Collection<Integer> num = new ArrayList<Integer>();
		int i = 0;
		System.out.print("1 - Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos\n");
		while (i < 6) {
			System.out.println("Digite o numero: ");
			num.add(teclado.nextInt()); 
			i += 1;
		}
		System.out.println("\n");
		for(int j = 0; j < 6; j++) {
			
			System.out.println(((ArrayList<Integer>) num).get(j));
			
		}
		
	}
}
