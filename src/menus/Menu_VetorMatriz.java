package menus;

import java.util.Scanner;

import linha.Linha;

public class Menu_VetorMatriz {
	public static String getMenu_VetorMatriz() {
		Linha linha = new Linha();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu Vetor e Matriz");
		System.out.println(linha.getLinha());
		System.out.println("1 - Crie um programa que l� 6 valores inteiros e, em seguida, mostre na tela os valores lidos\n"
				+ "2 - Leia um vetor de posi��es. Contar e escrever quantos valores pares ele possui.");
		return null;
	}
}
