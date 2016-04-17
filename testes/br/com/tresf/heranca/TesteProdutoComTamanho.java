package br.com.tresf.heranca;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho produtoComTamanho;
	ProdutoComTamanho outroProdutoComTamanho;
	
	@Test
	public void testProdutoComTamanhoIguais() {
		produtoComTamanho = new ProdutoComTamanho("ProdutoComTamanho1", "COD1", 9, 42);
		outroProdutoComTamanho = new ProdutoComTamanho("ProdutoComTamanho2", "COD1", 26, 42);
		assertTrue(produtoComTamanho.equals(outroProdutoComTamanho));
	}
	
	@Test
	public void testProdutoComTamanhoDiferentes() {
		produtoComTamanho = new ProdutoComTamanho("ProdutoComTamanho1", "COD1", 9, 42);
		outroProdutoComTamanho = new ProdutoComTamanho("ProdutoComTamanho2", "COD2", 26, 42);
		assertFalse(produtoComTamanho.equals(outroProdutoComTamanho));
	}
}
