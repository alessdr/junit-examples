package br.com.ctrlabs.testes_unidade;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteClasse1 {

	@Test
	public void testFibonacci() {
		
		Classe1 c = new Classe1();
		// assertEquals(DESCRICAO, VALOR ESPERADO, EXECUCAO)
		assertEquals("Caso 1", 1, c.fibonacci(1));
		assertEquals("Caso 2", 1, c.fibonacci(2));
		assertEquals("Caso 3", 2, c.fibonacci(3));
		assertEquals("Caso 4", 3, c.fibonacci(4));
		assertEquals("Caso 5", 5, c.fibonacci(5));
		assertEquals("Caso 6", 8, c.fibonacci(6));
		assertEquals("Caso 7", 13, c.fibonacci(7));
		assertEquals("Caso 8", -1, c.fibonacci(-1));
		
		assertTrue(c.fibonacci(2)==1);
		//assertFalse(c.fibonacci(2)!=2);
	}

}
