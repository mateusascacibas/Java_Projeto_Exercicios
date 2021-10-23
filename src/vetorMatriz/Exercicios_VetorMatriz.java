package vetorMatriz;

import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_VetorMatriz  extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		System.out.print("1 - Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos");
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
			System.out.println("Valor " + i + " = " + vetor[j]);
		}
}

	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_VetorMatriz.exercicio01();
			ok = false;
			op = 0;
		} else if (op_exercicios == 0) {
			System.out.println("Saindo.");
			ok = false;
			op = 0;
		} else {
			System.out.println("Digite um opcao valida.");
			ok_opcoes = false;
		}
	}
}
