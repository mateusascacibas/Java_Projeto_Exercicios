package repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Repeticao extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);

	public static int exercicio01() {

		int contador = 0;
		System.out.print("1 - Faca um programa que determine e mostre os cinco primeiros multiplos de 3, considerando numeros maiores que 0\n");
		System.out.println();
		int i = 1;
		while (i <= 5) {
			System.out.println(i * 3);
			contador += i * 3;
			i = i + 1;	
		}
		return contador;
	}

	public static void exercicio02() {
		int valor = (int) (Math.random() * 101);

		System.out.println("");
		System.out.println("BEM VINDO AO PROGRAMA DE SORTEIO DE NUMEROS");
		System.out.println("Digite um numero de 1 a 100 e tente adivinhar ele, voce tem 5 chances!");
		System.out.println("");
		System.out.println("");

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Digite um numero: ");
				int sorteio = teclado.nextInt();

				if (sorteio == valor) {
					System.out.println("Voce Acertou, Parabens!");
					break;
				} else {
					if (sorteio < valor) {
						System.out.println("O numero digitado foi MENOR que o valor pedido!");
						System.out.println("Tente novamente");
					} else if (sorteio > valor) {
						System.out.println("O numero digitado foi MAIOR que o valor pedido!");
						System.out.println("Tente novamente");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Somente e suportado numeros inteiros!");
				System.out.print("Tente novamente: ");
				teclado.nextLine();
			}

		}
		System.out.println("Voce nao conseguiu :(");
	}

	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_Repeticao.exercicio01();
			ok = false;
			op = 0;
		} else if (op_exercicios == 2) {
			Exercicios_Repeticao.exercicio02();
			ok = false;
			op = 0;
		} else if (op_exercicios == 0) {
			System.out.println("Saindo.");
			ok = false;
			op = 0;
		} else {
			System.out.println("Digite uma opcao valida.");
			ok_opcoes = false;
		}
	}

}
