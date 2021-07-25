package menus;

import linha.Linha;

public class Menu_Sequencial {
	public static String getMenu_Sequencial() {
		Linha linha = new Linha();
	
		System.out.println("Menu Sequencial");
		System.out.println(linha.getLinha());
		System.out.println("1 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma\r\n"
				+ "mensagem explicativa, conforme exemplos.\n"
				+ "2 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\r\n"
				+ "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)."
				+ "0 - Sair");
		return null;
	}
}
