package br.com.tresf.heranca;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteProduto {

	Produto produto;
	Produto outroProduto;
	
	@Test
	public void testProdutosIguais() {
		produto = new Produto ("produto1", "COD1", 30);
		outroProduto = new Produto ("produto2", "COD1", 20);	
		assertTrue(produto.equals(outroProduto));
		//assertEquals(true, produto.equals(outroProduto));
	}
	
	@Test
	public void testProdutosDiferentes() {
		produto = new Produto ("produto1", "COD1", 30);
		outroProduto = new Produto ("produto2", "COD2", 20);
		assertFalse(produto.equals(outroProduto));
		//assertEquals(false, produto.equals(outroProduto));
	}
	
}
