package menus;



import linha.Linha;

public class Menu_Repeticao {
	public static String getMenu_Repeticao() {
		Linha linha = new Linha();
		System.out.println("Menu Repetição");
		System.out.println(linha.getLinha());
		System.out.println("1 - Faça um programa que determine e mostre os cinco primeiros multiplos de 3, considerando números maiores que 0\n"
				+ "2 - Escreva um programa que escreva na tela de 1 até 100, de 1 em 1, 3 vezes. Na primeira vez deve usar o FOR, depois While e por ultimo o Do While."
				+ "0 - Sair");
		return null;
	}
}
