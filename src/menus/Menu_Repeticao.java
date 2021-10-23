package menus;



import linha.Linha;

public class Menu_Repeticao {
	public static String getMenu_Repeticao() {
		Linha linha = new Linha();
		System.out.println("Menu Repeticao");
		System.out.println(linha.getLinha());
		System.out.println("1 - Faca um programa que determine e mostre os cinco primeiros multiplos de 3, considerando numeros maiores que 0\n"
				+ "2- Digite um numero de 1 a 100 e tente adivinhar ele, voce tem 5 chances! \n" +
				"0 - Sair");
		return null;
	}
}
