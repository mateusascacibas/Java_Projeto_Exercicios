package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Collections extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);

	public static void exercicio01() {
		Collection<Integer> num = new ArrayList<Integer>();
		int i = 0;
		System.out.print(
				"1 - Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos\n");
		while (i < 6) {
			System.out.println("Digite o numero: ");
			try {
				num.add(teclado.nextInt());
				i += 1;
			} catch (InputMismatchException e) {
				System.out.println("Somente e suportado numeros inteiros!");
				num.add(teclado.nextInt());
			}
		}
		System.out.println("");
		for (Integer x : num) {
			System.out.println(x);
		}

	}

	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_Collections.exercicio01();
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
