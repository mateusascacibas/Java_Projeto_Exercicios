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
	public static void exercicio02() {
		System.out.println("2- Faça um programa que realize a soma de binários \n");
		long binary1, binary2;
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite um Binário: ");
		binary1 = in.nextLong();
		System.out.println("Digite outro Binário: ");
		binary2 = in.nextLong();
		
		while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		  }
		 
		 if (remainder != 0) {
			  sum[i++] = remainder;
			 }
			 --i;
			 System.out.print("O resultado da soma dos binários é: ");
			 while (i >= 0) {
			  System.out.print(sum[i--]);
			 }
			  System.out.print("\n");  
		}
	}	

