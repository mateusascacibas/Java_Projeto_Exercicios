package menus;

import java.util.Scanner;

import linha.Linha;

public class Menu_Repeticao {
	public static String getMenu_Repeticao() {
		Linha linha = new Linha();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu Repeti��o");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fa�a um programa que determine e mostre os cinco primeiros multiplos de 3, considerando n�meros maiores que 0\n"
				+ "2 - Fa�a um programa que realize a soma de bin�rios \n.");
		return null;
	}
}
