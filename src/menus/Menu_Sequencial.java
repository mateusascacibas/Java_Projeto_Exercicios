package menus;

import linha.Linha;

public class Menu_Sequencial {
	public static String getMenu_Sequencial() {
		Linha linha = new Linha();
	
		System.out.println("Menu Sequencial");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma\r\n"
				+ "mensagem explicativa, conforme exemplos.\n"
				+ "2 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto\r\n"
				+ "de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D)."
				+ "0 - Sair");
		return null;
	}
}
