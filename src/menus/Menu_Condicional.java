package menus;

import java.util.Scanner;

import linha.Linha;

public class Menu_Condicional {
	
	
	public static String getMenuCondicional() {
		
		Linha linha = new Linha();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu Condicional");
		System.out.println(linha.getLinha());
		System.out.println("1 - Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. \n"
				+ "2 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar. \n"
				+ "3 - Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em\r\n"
				+ "ordem crescente ou decrescente. \n"
				+ "4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode\r\n"
				+ "come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas. \n"
				+ "5 - Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A\r\n"
				+ "seguir, calcule e mostre o valor da conta a pagar. \n");
		return null;
	}
	
}
	
	

