package menus;

import java.util.Scanner;

import linha.Linha;

public class Menu_Classes {
public static String getMenuClasses() {
		
		Linha linha = new Linha();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu Classes");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fazer um programa para ler os dados de duas pessoas, depois mostrar o nome da pessoa mais \n"
				+ "velha.\n2 - Fazer um programa para ler os dados bancarios de uma pessoas, depois fornecer ações ao usuarios \n"
				+ "3 - Exercicio de dados dos funcionarios");
		
		return null;
	}
}
