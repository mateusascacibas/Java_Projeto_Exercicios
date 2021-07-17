package menus;

import java.util.Scanner;

import linha.Linha;
import repeticao.Exercicios_Repeticao;
import condicional.Exercicios_Condicional;

public class Menu_Principal {
	
	
	public static int op_exercicios;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linha linha = new Linha();
		Exercicios_Condicional condicional = new Exercicios_Condicional();
		Exercicios_Repeticao repeticao = new Exercicios_Repeticao();
		
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		
		
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
		System.out.println("6 - Functions");
		System.out.println(linha.getLinha());
		System.out.println("7 - Classe");
		System.out.println(linha.getLinha());
		System.out.println("8 - Herenças");
		System.out.println(linha.getLinha());
		System.out.println("0 - Sair");
		System.out.println(linha.getLinha());
		
		op = teclado.nextInt();
		System.out.println("\n");
		
		switch(op) {
			case 1:
				System.out.println(linha.getLinha());
				Menu_Condicional.getMenuCondicional();
				op_exercicios = teclado.nextInt();
				if(op_exercicios == 1) {
					Exercicios_Condicional.exercicio01();
				}
				else if(op_exercicios == 2) {
					Exercicios_Condicional.exercicio02();
				}
				
				
			case 2:
				System.out.println(linha.getLinha());
				Menu_Repeticao.getMenu_Repeticao();
				op_exercicios = teclado.nextInt();
				switch(op_exercicios) {
				case 1:
					Exercicios_Repeticao.exercicio01();
		
				}
			case 0:
				break;
		}
	
	}

}
