package menus;

import linha.Linha;

public class MenuOpcoes {
	Linha linha = new Linha();
	public void mostraMenu() {
		System.out.println(linha.getLinha());
		System.out.println("Menu Principal");
		System.out.println(linha.getLinha());
		System.out.println("1 - Condicional");
		System.out.println(linha.getLinha());
		System.out.println("2 - Repeticao");
		System.out.println(linha.getLinha());
		System.out.println("3 - Vetor e Matriz");
		System.out.println(linha.getLinha());
		System.out.println("4 - Sequencial");
		System.out.println(linha.getLinha());
		System.out.println("5 - Collections");
		System.out.println(linha.getLinha());
		System.out.println("6 - Classe");
		System.out.println(linha.getLinha());
		System.out.println("7 - Heranca");
		System.out.println(linha.getLinha());
		System.out.println("0 - Sair");
		System.out.println(linha.getLinha());
	}
	
}
