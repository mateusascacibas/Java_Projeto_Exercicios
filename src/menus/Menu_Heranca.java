package menus;

import linha.Linha;

public class Menu_Heranca {
public static String getMenuHeranca() {
		
		Linha linha = new Linha();
		System.out.println("Menu Heran�a");
		System.out.println(linha.getLinha());
		System.out.println("1 -Escreva um c�digo em Java que apresente a classe pessoa, com atributos Nome\"\r\n"
				+ ", endere�o e telefone, e o metodo imprimir.\n"
				+ "0 - Sair");
		return null;

	}
}
