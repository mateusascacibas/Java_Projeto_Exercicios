package menus;



import linha.Linha;

public class Menu_Repeticao {
	public static String getMenu_Repeticao() {
		Linha linha = new Linha();
		System.out.println("Menu Repeti��o");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fa�a um programa que determine e mostre os cinco primeiros multiplos de 3, considerando n�meros maiores que 0\n"
				+ "2- Digite um número de 1 a 100 e tente adivinhar ele, você tem 5 chances! \n" +
				"0 - Sair");
		return null;
	}
}
