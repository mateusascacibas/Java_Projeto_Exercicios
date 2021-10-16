package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import classes.Pessoas;

public class classesTest {
	@Test
	public void exe1Teste() {
		String maior;
		Pessoas p1 = new Pessoas("Mateus", 19);
		Pessoas p2 = new Pessoas("Tiago", 21);
		if(p1.getIdade() > p2.getIdade()) {
			maior = p1.getNome();
		}
		else if(p2.getIdade() > p1.getIdade()) {
			maior = p2.getNome();
		}
		else {
			maior = "igual";
		}
		Assert.assertEquals(maior, "Tiago");
	}
}
