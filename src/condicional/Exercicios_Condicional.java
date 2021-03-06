package condicional;

import java.util.Scanner;

import menus.Menu_Principal;



public class Exercicios_Condicional extends Menu_Principal {
	static int num, A,B, horaInicial, horaFinal;
	static Scanner teclado = new Scanner(System.in);

	
	public static void exercicio01() {
		System.out.print("1 - Fazer um programa para ler um numero inteiro, e depois dizer se este numero e negativo ou nao.\n");
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
		System.out.println("2 - Fazer um programa para ler um numero inteiro e dizer se este numero e par ou impar.");
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
	
	public static void exercicio03() {
		System.out.println("3 - Leia 2 valores inteiros (A e B). Apos, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\", indicando se os valores lidos sao m?ltiplos entre si. Atencao: os numeros devem poder ser digitados em\r\n"
				+ "ordem crescente ou decrescente. \n");
		System.out.println("Digite o valor A: ");
		A = teclado.nextInt();
		System.out.println("Digite o valor B: ");
		B = teclado.nextInt();
		System.out.println("\n");
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos.");
		}else {
			System.out.println("Nao sao multiplos");
		}
	}
	
	public static void exercicio04() {
		System.out.println("4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duracao do jogo, sabendo que o mesmo pode\r\n"
				+ "comecar em um dia e terminar em outro, tendo uma duracao minima de 1 hora e maxima de 24 horas. \n");
		System.out.println("Entre com a hora inicial: ");
		horaInicial = teclado.nextInt();
		System.out.println("Entre com a hora final: ");
		horaFinal = teclado.nextInt();
		if(horaInicial > horaFinal) {
			System.out.println("Duracao : " + (horaInicial - horaFinal));
		}
		else {
			System.out.println("Duracao: " + (horaFinal - horaInicial));
		}
	}

	public static void MostrarExercicios() {
		
		if (op_exercicios == 1) {
			Exercicios_Condicional.exercicio01();
			ok = false;
			op = 0;
		} else if (op_exercicios == 2) {
			Exercicios_Condicional.exercicio02();
			ok = false;
			op = 0;
		} else if (op_exercicios == 3) {
			Exercicios_Condicional.exercicio03();
			ok = false;
			op = 0;
		} else if (op_exercicios == 4) {
			Exercicios_Condicional.exercicio04();
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



