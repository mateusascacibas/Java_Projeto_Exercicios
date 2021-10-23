package menus;

import linha.Linha;

public class Menu_Classes {
public static void getMenuClasses() {
		
		Linha linha = new Linha();
	
		System.out.println("Menu Classes");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fazer um programa para ler os dados de duas pessoas, depois mostrar o nome da pessoa mais \n"
				+ "velha.\n2 - Fazer um programa para ler os dados bancarios de uma pessoas, depois fornecer acoes ao usuarios \n"
				+ "3 - Exercicio de dados dos funcionarios\n"
				+ "0 - Sair");

	}
}
