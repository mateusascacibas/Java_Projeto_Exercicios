package menus;

import linha.Linha;

public class Menu_Heranca {
public static String getMenuHeranca() {
		
		Linha linha = new Linha();
		System.out.println("Menu Herança");
		System.out.println(linha.getLinha());
		System.out.println("1 -Escreva um código em Java que apresente a classe pessoa, com atributos Nome\"\r\n"
				+ ", endereço e telefone, e o metodo imprimir.\n"
				+ "0 - Sair");
		return null;

	}
}
