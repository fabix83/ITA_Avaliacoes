package br.com.tresf.produtos;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoCompras {

	Produto p;
	ProdutoComTamanho p2;
	CarrinhoDeCompras c;

	@Before
	public void before() {
		p = new Produto("Produto001", 001, 34);
		p2 = new ProdutoComTamanho("Produto002", 001, 56, 36);
		c = new CarrinhoDeCompras();
	}

	@Test
	public void testeAddCarrinho() {
		c.adicionaProduto(p, 1);
		assertEquals(34, c.valorTotal());
	}

	@Test
	public void testeRemoveCarrinho() {
		c.adicionaProduto(p2, 2);
		assertEquals(112, c.valorTotal());
	}

	@Test
	public void testeValorTotal() {
		c.adicionaProduto(p, 2);
		assertEquals(68, c.valorTotal());

		c.adicionaProduto(p2, 1);
		assertEquals(124, c.valorTotal());
	}

}
