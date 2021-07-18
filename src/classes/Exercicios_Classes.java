package classes;


import java.util.Scanner;

public class Exercicios_Classes {
static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		
		System.out.print("1 - Fazer um programa para ler os dados de duas pessoas, depois mostrar o nome da pessoa mais\r\n"
				+ "velha.\n");
		String nome1, nome2;
		int idade1, idade2;
		System.out.println("Nome 1: ");
		nome1 = teclado.next();
		System.out.println("Idade 1: ");
		idade1 = teclado.nextInt();
		System.out.println("Nome 2: ");
		nome2 = teclado.next();
		System.out.println("Idade 2: ");
		idade2 = teclado.nextInt();
		
		Pessoas p1 = new Pessoas(nome1, idade1);
		Pessoas p2 = new Pessoas(nome2, idade2);
		if(idade1 > idade2) {
			System.out.println("O(A) " + p1.getNome() +" é o mais velho(a).");
		}
		else if(idade2 > idade1) {
			System.out.println("O(A) " + p2.getNome() + " é o mais velho(a).");
		}
		else {
			System.out.println("Mesma idade.");
		}
		
		
		
}
}

