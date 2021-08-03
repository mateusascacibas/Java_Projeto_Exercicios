package menus;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Exercicios_Classes;
import collections.Exercicios_Collections;
import linha.Linha;
import repeticao.Exercicios_Repeticao;
import sequencial.Exercicios_Sequencial;
import vetorMatriz.Exercicios_VetorMatriz;
import condicional.Exercicios_Condicional;
import heranca.Exercicios_Heranca;

public class Menu_Principal {

	public static int op_exercicios = 1;
	public static int op = 1;
	public static int op_principal = 1;
	public static boolean ok = false;
	public static boolean ok_opcoes = false;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Linha linha = new Linha();
		MenuOpcoes menu = new MenuOpcoes();
		Scanner teclado = new Scanner(System.in);

		while (op_principal != 0) {
			while (!ok) {
				menu.mostraMenu();
				try {
					System.out.println("Digite uma opção: ");
					op_principal = teclado.nextInt();
					if (op_principal < 8) {
						ok = true;
						ok_opcoes = false;
						op = 1;
					} else {
						System.out.println("Digite uma opção valida.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Somente é suportado numeros inteiros!");
					teclado.nextLine();
				}

				if (op_principal == 0) {
					op = 0;
					System.out.println("Parando programa.");
					break;
				}
			}

			while (op != 0) {
				switch (op_principal) {
				case 1:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_Condicional.getMenuCondicional();
						try {

							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_Condicional.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
				case 2:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_Repeticao.getMenu_Repeticao();
						try {
							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_Repeticao.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
					break;

				case 3:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_VetorMatriz.getMenu_VetorMatriz();
						try {
							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_VetorMatriz.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
					break;

				case 4:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_Sequencial.getMenu_Sequencial();
						try {
							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_Sequencial.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
					break;
				case 5:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_Collections.getMenuCollections();
						try {
							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_Collections.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
					break;

				case 6:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_Classes.getMenuClasses();
						try {
							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_Classes.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
					break;

				case 7:
					while (!ok_opcoes) {
						System.out.println(linha.getLinha());
						Menu_Heranca.getMenuHeranca();
						try {
							System.out.println("Digite uma opção: ");
							op_exercicios = teclado.nextInt();
							ok_opcoes = true;
							System.out.println(linha.getLinha());
							Exercicios_Heranca.MostrarExercicios();
						} catch (InputMismatchException e) {
							System.out.println("Somente é suportado numeros inteiros!");
							teclado.nextLine();
						}
					}
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.print("Digite um opção valida: ");
					op = teclado.nextInt();
					break;
				}
			}
		}
		System.out.println("\n");
		teclado.close();
	}
}
