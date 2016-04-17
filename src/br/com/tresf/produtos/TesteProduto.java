package br.com.tresf.produtos;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {
	Produto p, p2;

	@Before
	public void before() {
		p = new Produto("Produto001", 001, 5);
		p2 = new Produto("Produto002", 001, 10);
	}

	@Test
	public void testeProdutosIguais() {
		//assertEquals(p, p);
		//assertEquals(p2, p2);
		assertEquals(true, p.equals(p2));
	}

	@Test
	public void testeProdutosDiferentes() {
		if (equals(p) != equals(p2) && p.hashCode() != p2.hashCode())
			System.out.println("falha no metodo equals");
		else
			System.out
					.println("HasCode Diferentes, porem retorno Equals; produtos iguals");
	}

	@Test
	public void testeEquals() {
		assertEquals(equals(p), equals(p2));
	}

}
