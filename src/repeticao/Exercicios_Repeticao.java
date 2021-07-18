package repeticao;

import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Repeticao extends Menu_Principal {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		System.out.print("1 - Faça um programa que determine e mostre os cinco primeiros multiplos de 3, considerando números maiores que 0\n");
		System.out.println("\n");
		int i = 1;
		while (i <= 5){
			System.out.println(i*3);
			i = i+1;
		}
		
	}
	
}
