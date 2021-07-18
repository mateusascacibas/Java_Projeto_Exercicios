package menus;

import java.util.Scanner;

import linha.Linha;

public class Menu_Heranca {
public static String getMenuHeranca() {
		
		Linha linha = new Linha();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu Herança");
		System.out.println(linha.getLinha());
		System.out.println("1 -Escreva um código em Java que apresente a classe pessoa, com atributos Nome\"\r\n"
				+ "				+ \", endereço e telefone, e o metodo imprimir.\n");
		return null;
	}
}
