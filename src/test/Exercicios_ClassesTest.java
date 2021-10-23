package test;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import classes.Exercicios_Classes;

public class Exercicios_ClassesTest {
	static Scanner teclado = new Scanner(System.in);
	@Test
	public void exe1TestePessoa1() {
		teclado.nextLine();
		System.out.println("Pessoa 1 deve ter nome Mateus e ser a mais velha");
		String maior = Exercicios_Classes.exercicio01();
		Assert.assertEquals(maior, "Mateus");
		System.out.println("Digite enter para o proximo teste");
	}
	
	@Test
	public void exe1TestePessoa2() {
		teclado.nextLine();
		System.out.println("Pessoa 2 deve ter nome Tiago e ser a mais velha");
		String maior = Exercicios_Classes.exercicio01();
		Assert.assertEquals(maior, "Tiago");
	}
	
	@Test
	public void exe1TesteMesmaIdade() {
		System.out.println("Digite enter para comecar.");
		System.out.println("Pessoas devem ter a mesma idade");
		String maior = Exercicios_Classes.exercicio01();
		Assert.assertEquals(maior, "igual");
		System.out.println("Digite enter para o proximo teste");
	}
}
