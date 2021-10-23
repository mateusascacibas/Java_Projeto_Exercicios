package menus;


import linha.Linha;

public class Menu_Condicional {
	
	
	public static void getMenuCondicional() {
		
		Linha linha = new Linha();
		System.out.println("Menu Condicional");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fazer um programa para ler um numero inteiro, e depois dizer se este numero e negativo ou nao. \n"
				+ "2 - Fazer um programa para ler um numero inteiro e dizer se este numero e par ou impar. \n"
				+ "3 - Leia 2 valores inteiros (A e B). Apos, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\", indicando se os valores lidos sao múltiplos entre si. Atencao: os numeros devem poder ser digitados em\r\n"
				+ "ordem crescente ou decrescente. \n"
				+ "4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\r\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. \n"
				+ "0 - Sair");
	}
	
}
	
	

