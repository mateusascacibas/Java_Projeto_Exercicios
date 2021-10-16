package repeticao;

import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Repeticao extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		System.out.print("1 - Fa�a um programa que determine e mostre os cinco primeiros multiplos de 3, considerando n�meros maiores que 0\n");
		System.out.println("\n");
		int i = 1;
		while (i <= 5){
			System.out.println(i*3);
			i = i+1;
		}
		
	}
	
	public static void exercicio02() {
		int valor = (int) (Math.random() * 101);

		System.out.println("");
		System.out.println("BEM VINDO AO PROGRAMA DE SORTEIO DE NÚMEROS");
		System.out.println("Digite um número de 1 a 100 e tente adivinhar ele, você tem 5 chances!");
		System.out.println("");
		System.out.println("");

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			int sorteio = teclado.nextInt();

			if (sorteio == valor) {
				System.out.println("Você Acertou, Parabéns!");
				break;
			} else {
				if (sorteio < valor) {
					System.out.println("O número digitado é MENOR que o valor pedido!");
					System.out.println("Tente novamente");
				} else if (sorteio > valor) {
					System.out.println("O número digitado é MAIOR que o valor pedido!");
					System.out.println("Tente novamente");
				}
			}
		}
		System.out.println("Você não conseguiu :(");
	}
	
	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_Repeticao.exercicio01();
			ok = false;
			op = 0;
		}
		else if (op_exercicios == 2) {
			Exercicios_Repeticao.exercicio02();
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
