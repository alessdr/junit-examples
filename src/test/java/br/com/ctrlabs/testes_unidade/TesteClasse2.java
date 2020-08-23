package br.com.ctrlabs.testes_unidade;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteClasse2 {

	@Test
	public void test() {
		
		Classe2 c = new Classe2();
		
		assertEquals("Caso 1", 1, c.fatorial(0));
		assertEquals("Caso 2", 1, c.fatorial(1));
		assertEquals("Caso 3", 2, c.fatorial(2));
		assertEquals("Caso 4", 6, c.fatorial(3));
	}

}
