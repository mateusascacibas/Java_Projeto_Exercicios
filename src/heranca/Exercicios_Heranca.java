package heranca;

import java.util.Scanner;

public class Exercicios_Heranca {
	static int num;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void exercicio01() {
		System.out.print("1 -Escreva um código em Java que apresente a classe pessoa, com atributos Nome , endereço e telefone, e o metodo imprimir.\n");
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
}
