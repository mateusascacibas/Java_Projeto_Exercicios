package vetorMatriz;

import java.util.Scanner;

public class Exercicios_VetorMatriz {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		System.out.print("1 - Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos");
		int vetor[] = new int[6];
		int i = 0;
		int j = 0;
		while (i < 5){
			System.out.println("Digite um valor inteiro: ");
			vetor[i] = teclado.nextInt();
			i = i + 1;
		}
		System.out.println("\n");
		while(j < 5) {
			System.out.println("Valor " + i + " é " + vetor[j]);
		}
}
}
