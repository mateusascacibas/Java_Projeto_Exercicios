package menus;

import linha.Linha;

public class Menu_VetorMatriz {
	public static String getMenu_VetorMatriz() {
		Linha linha = new Linha();
		System.out.println("Menu Vetor e Matriz");
		System.out.println(linha.getLinha());
		System.out.println("1 - Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos\n"
				+ "2 - Leia um vetor de posições. Contar e escrever quantos valores pares ele possui."
				+ "0 - Sair");
		return null;
	}
}
