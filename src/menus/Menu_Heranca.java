package menus;

import linha.Linha;

public class Menu_Heranca {
public static void getMenuHeranca() {
		
		Linha linha = new Linha();
		System.out.println("Menu Herança");
		System.out.println(linha.getLinha());
		System.out.println("1 - Escreva um código em Java que apresente a classe pessoa, com atributos Nome , endereço e telefone, e o metodo imprimir.\n"
				+ "2 - Exercicio do Elevador \n"
				+ "3 - Exercicia da Lampada \n"
				+ "0 - Sair");

	}
}
