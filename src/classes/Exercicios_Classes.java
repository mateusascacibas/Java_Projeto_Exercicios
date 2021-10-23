package classes;

import java.util.Scanner;

import menus.Menu_Principal;

public class Exercicios_Classes extends Menu_Principal{
static Scanner teclado = new Scanner(System.in);
	
	
	public static String exercicio01() {
		
		System.out.print("1 - Fazer um programa para ler os dados de duas pessoas, depois mostrar o nome da pessoa mais\r\n"
				+ "velha.\n");
		String nome1, nome2;
		int idade1, idade2;
		teclado.nextLine();
		System.out.println("Nome 1: ");
		nome1 = teclado.nextLine();
		System.out.println("Idade 1: ");
		idade1 = teclado.nextInt();
		System.out.println("Nome 2: ");
		teclado.next();
		nome2 = teclado.nextLine();
		System.out.println("Idade 2: ");
		idade2 = teclado.nextInt();
		
		Pessoas p1 = new Pessoas(nome1, idade1);
		Pessoas p2 = new Pessoas(nome2, idade2);
		
		if(idade1 > idade2) {
			System.out.println("O(A) " + p1.getNome() +" e o mais velho(a).");
			return p1.getNome();
		}
		else if(idade2 > idade1) {
			System.out.println("O(A) " + p2.getNome() + " e o mais velho(a).");
			return p2.getNome();
		}
		else {
			System.out.println("Mesma idade.");
			return "igual";
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
	
	public static void exercicio03() {
				// TODO Auto-generated method stub
				Funcionario F01 = new Funcionario();
				Funcionario F02 = new Funcionario(1105, "Jose Carlos Silva", 6500.00);
				F01.setCodFunc(1200);
				F01.setNomeFunc("Maria Antonia Guimarães");
				F01.setSalarioMensal(8600.00);
				
				System.out.println("3 - Exercicio de dados dos funcionarios");
				
				System.out.println(F01.getCodFunc() + "\t\t" + F01.getNomeFunc() + "\t\t" + F01.getSalarioMensal());

				System.out.println(F02.getCodFunc() + "\t\t" + F02.getNomeFunc() + "\t\t" + F02.getSalarioMensal());
				System.out.printf(F01.getCodFunc() + "\t\t" + "%.2f", F01.getSalarioAnual());
				System.out.printf("\n" + F02.getCodFunc() + "\t\t" + "%.2f", F02.getSalarioAnual());
				
				F01.setAumento(15);
				F02.setAumento(15);
				
				System.out.println("\n Após aumento ");
				System.out.printf("\n" +F01.getCodFunc() + "\t\t" + "%.2f", F01.getSalarioAnual());
				System.out.printf("\n" + F02.getCodFunc() + "\t\t" + "%.2f", F02.getSalarioAnual());
				System.out.println("\n");
					
			}

	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_Classes.exercicio01();
			ok = false;
			op = 0;
		} else if (op_exercicios == 2) {
			Exercicios_Classes.exercicio02();
			ok = false;
			op = 0;
		} else if (op_exercicios == 3) {
			Exercicios_Classes.exercicio03();
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
