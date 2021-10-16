package test;

import org.junit.Assert;
import org.junit.Test;

public class Exercicios_RepeticaoTest {

	int valor = (int) (Math.random() * 101);
	int sorteio = 59;
	boolean correto = true;

	@Test
	public void exercicio02() {

		while (valor != sorteio) {

			correto = false;
			valor = (int) (Math.random() * 101);
		}
		Assert.assertFalse(correto);

	}
}
