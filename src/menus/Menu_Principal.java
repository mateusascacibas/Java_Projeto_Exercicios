package menus;

import java.util.Scanner;

import collections.Exercicios_Collections;
import linha.Linha;
import repeticao.Exercicios_Repeticao;
import sequencial.Exercicios_Sequencial;
import vetorMatriz.Exercicios_VetorMatriz;
import condicional.Exercicios_Condicional;

public class Menu_Principal {
	
	
	public static int op_exercicios;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linha linha = new Linha();
	
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
		System.out.println("Digite uma opção: ");
		
		op = teclado.nextInt();
		System.out.println("\n");
		
		switch(op) {
			case 1:
				System.out.println(linha.getLinha());
				Menu_Condicional.getMenuCondicional();
				System.out.println("Digite uma opção: ");
				op_exercicios = teclado.nextInt();
				System.out.println(linha.getLinha());
				if(op_exercicios == 1) {
					Exercicios_Condicional.exercicio01();
				}
				else if(op_exercicios == 2) {
					Exercicios_Condicional.exercicio02();
				}
				
				break;
			case 2:
				System.out.println(linha.getLinha());
				Menu_Repeticao.getMenu_Repeticao();
				System.out.println("Digite uma opção: ");
				op_exercicios = teclado.nextInt();
				System.out.println(linha.getLinha());
				if(op_exercicios == 1) {
					Exercicios_Repeticao.exercicio01();
				}
				else if(op_exercicios == 2) {
					Exercicios_Repeticao.exercicio02();
				}
	
				break;
			
			case 3:
				System.out.println(linha.getLinha());
				Menu_VetorMatriz.getMenu_VetorMatriz();
				System.out.println("Digite uma opção: ");
				op_exercicios = teclado.nextInt();
				System.out.println(linha.getLinha());
				if(op_exercicios == 1) {
					Exercicios_VetorMatriz.exercicio01();
				}
				
				break;
			
			case 4:
				System.out.println(linha.getLinha());
				Menu_Sequencial.getMenu_Sequencial();
				System.out.println("Digite uma opção: ");
				op_exercicios = teclado.nextInt();
				System.out.println(linha.getLinha());
				if(op_exercicios == 1) {
					Exercicios_Sequencial.exercicio01();
				}
				
				break;
			
			case 5:
				System.out.println(linha.getLinha());
				Menu_Collections.getMenuCollections();
				System.out.println("Digite uma opção: ");
				op_exercicios = teclado.nextInt();
				System.out.println(linha.getLinha());
				if(op_exercicios == 1) {
					Exercicios_Collections.exercicio01();
				}
				
				break;
			case 0:
				break;
		}
	
	}

}
