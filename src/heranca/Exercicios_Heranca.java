package heranca;

import java.util.Scanner;

import linha.Linha;
import menus.Menu_Principal;

public class Exercicios_Heranca extends Menu_Principal{
	static int num;
	static Scanner teclado = new Scanner(System.in);
	static Linha linha = new Linha();
	
	
	public static void exercicio01() {
		System.out.print("1 -Escreva um código em Java que apresente a classe pessoa, com atributos Nome, endereço e telefone, e o metodo imprimir.\n");
		Pessoa p1 = new Pessoa();
		p1.setNome("Mateus");
		p1.setEndereco("Rua Ascacibas");
		p1.setTelefone(987654321);
		Pessoa p2= new Pessoa("Tiago", "Rua Rodrigues", 123456789);
		
		System.out.println("Nome 1: " + p1.getNome());
		System.out.println("Endereco 1: " + p1.getEndereco());
		System.out.println("Telefone 1: " + p1.getTelefone());
		
		System.out.println("Nome 2: " + p2.getNome());
		System.out.println("Endereco 2: " + p2.getEndereco());
		System.out.println("Telefone 2: " + p2.getTelefone());
		
		
		
	}
	
	public static void exercicio02() {		
		int capacidade, totalAndares, op = 1;
		System.out.println("2) Exercicio do Elevador ");
		System.out.println("Digite a capacidade do elevador: ");
		capacidade = teclado.nextInt();
		System.out.println("Digite o total de andares: ");
		totalAndares = teclado.nextInt();
		Elevador elevador = new Elevador(capacidade, totalAndares);
		while(op != 0) {
			System.out.println(linha.getLinha());
			elevador.getInformacoes();
			System.out.println(linha.getLinha());
			System.out.println("Digite a opção desejada: \n1 - Subir \n2 - Descer \n3 - Entrar 1 pessoa no elevador \n4 - Sair 1 pessoas do elevador \n0 - Sair");
			System.out.println(linha.getLinha());
			op = teclado.nextInt();
			if(op == 1) {
				elevador.Subir();
			}
			else if(op == 2) {
				elevador.Descer();
			}
			else if(op == 3) {
				elevador.Entrar();
			}
			else if(op == 4) {
				elevador.Sair();
			}
			else if(op == 0) {
				System.out.println("Saindo. Obrigado!");
			}
			else {
				System.out.println("Digite uma opção valida");
			}
		}
		
	}
	
	public static void exercicio03() {
		Lampada lampada = new Lampada();
		int op = 1;
		while(op != 0) {
			System.out.println(linha.getLinha());
			System.out.println("Digite uma opção: ");
			System.out.println("1 - Ligar a lampada \n2 - Desligar a lampada \n3 - Ver status da lampada \n0 - Sair: ");
			System.out.println(linha.getLinha());
			op = teclado.nextInt();
			if(op == 1) {
				lampada.ligar();
			}
			else if(op == 2) {
				lampada.desligar();
			}
			else if(op == 3) {
				lampada.isLigada();
			}
			else if(op == 0) {
				System.out.println("Saindo, obrigado!");
			}
			else {
				System.out.println("Digite uma opção valida");
			}
		}
	}
	public static void MostrarExercicios() {
		if (op_exercicios == 1) {
			Exercicios_Heranca.exercicio01();
		} else if(op_exercicios == 2) {
			Exercicios_Heranca.exercicio02();
		} else if(op_exercicios == 3) {
			Exercicios_Heranca.exercicio03();
		}else if (op_exercicios == 0) {
		
			System.out.println("Saindo.");
			ok = false;
			op = 0;
		} else {
			System.out.println("Digite um opção valida.");
			ok_opcoes = false;
		}
	}
}
