package menus;


import linha.Linha;

public class Menu_Condicional {
	
	
	public static void getMenuCondicional() {
		
		Linha linha = new Linha();
		System.out.println("Menu Condicional");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. \n"
				+ "2 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. \n"
				+ "3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\r\n"
				+ "ordem crescente ou decrescente. \n"
				+ "4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\r\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. \n"
				+ "0 - Sair");
	}
	
}
	
	

