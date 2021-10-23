package sequencial;

import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Sequencial extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		int n1, n2;
		
			System.out.print("1 - Faca um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses numeros com uma\r\n"
				+ "mensagem explicativa, conforme exemplos.\n");
			System.out.println("Primeiro numero: ");
			n1 = teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2 = teclado.nextInt();
			System.out.println("\n");
			System.out.println("Soma: " + (n1 + n2));
			
		
	}

	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_Sequencial.exercicio01();
			ok = false;
			op = 0;
		} else if (op_exercicios == 0) {
			System.out.println("Saindo.");
			ok = false;
			op = 0;
		} else {
			System.out.println("Digite um opção valida.");
			ok_opcoes = false;
		}
	}
}
