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
		nome1 = teclado.nextLine();
		System.out.println("Idade 1: ");
		idade1 = teclado.nextInt();
		System.out.println("Nome 2: ");
		nome2 = teclado.nextLine();
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
	
	public static void exercicio02() {

				int op = 3;
				ContaCorrente c1 = new ContaCorrente();
				System.out.print("2 - Fazer um programa para ler os dados bancarios de uma pessoas, depois fornecer ações ao usuarios:\n");
				System.out.println("Digite o numero da sua conta: ");
				c1.setNumCC(teclado.nextInt());
				System.out.println("Digite seu saldo: ");
				c1.setSaldo(teclado.nextDouble());
				while(op != 0) {
					
				
				System.out.println("Digite 1 para Sacar \n2 para Depositar \n3 para checar seu saldo\n0 para sair: ");
				op = teclado.nextInt();
					if(op == 1) {
					System.out.println("Digite o valor a ser sacado: ");
					c1.sacar(teclado.nextDouble());
					System.out.println("Saque feito com sucesso.");
				}
				else if(op == 2) {
					System.out.println("Digite o valor a ser depositado: ");
					c1.depositar(teclado.nextDouble());
					System.out.println("Deposito feito com sucesso.");
				}
				else if(op == 3) {
					System.out.println("Saldo atual: " + c1.getSaldo());
				}
				else if(op == 0) {
					System.out.println("Saindo.");
				}
				else {
					System.out.println("Opção invalida.");
				}
			
			}
			
			
		}

}
