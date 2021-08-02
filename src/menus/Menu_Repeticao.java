package menus;



import linha.Linha;

public class Menu_Repeticao {
	public static String getMenu_Repeticao() {
		Linha linha = new Linha();
		System.out.println("Menu Repetição");
		System.out.println(linha.getLinha());
		System.out.println("1 - Faça um programa que determine e mostre os cinco primeiros multiplos de 3, considerando números maiores que 0\n"
				+ "0 - Sair");
		return null;
	}
}
