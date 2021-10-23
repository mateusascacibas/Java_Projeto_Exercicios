package menus;

import linha.Linha;

public class Menu_VetorMatriz {
	public static String getMenu_VetorMatriz() {
		Linha linha = new Linha();
		System.out.println("Menu Vetor e Matriz");
		System.out.println(linha.getLinha());
		System.out.println("1 - Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos\n"
				+ "2 - Leia um vetor de posicoes. Contar e escrever quantos valores pares ele possui.\n"
				+ "0 - Sair");
		return null;
	}
}
