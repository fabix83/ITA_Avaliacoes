package br.com.tresf.produtos.correcoes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TesteCarrinhoDeCompras {
	
	private static final double DELTA = 1e-15;
	
	/*
	@Test
	public void testAdicionarProdutoComCodigosIgual() {
		Produto produto1 = new Produto("Camiseta", 123, 10.0);
		Produto produto2 = new Produto("Camiseta", 123, 10.0);
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionaProduto(produto1, 2);
		carrinhoDeCompras.adicionaProduto(produto2, 2);
		
		assertEquals(1, carrinhoDeCompras.getProdutos().size());
		assertEquals((Integer) 4, carrinhoDeCompras.getProdutos().get(produto1));
	}
		
	@Test
	public void testValorTotalDaCompraComCodigosDiferentes() {
		Produto produto1 = new Produto("Camiseta", 123, 10.0);
		Produto produto2 = new Produto("Camiseta", 123, 10.0);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionaProduto(produto1, 1);
		carrinhoDeCompras.adicionaProduto(produto2, 1);
		
		assertEquals(20.0, carrinhoDeCompras.calculaValorTotalDaCompra(), DELTA);
	}
	
	@Test
	public void testRemoverProdutoComTamanhosDiferentes() {
		ProdutoComTamanho produtoComTamanho1 = new ProdutoComTamanho("Camiseta", 123, 10.0, "p");
		ProdutoComTamanho produtoComTamanho2 = new ProdutoComTamanho("Camiseta", 123, 10.0, "m");
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionaProduto(produtoComTamanho1, 10);
		carrinhoDeCompras.adicionaProduto(produtoComTamanho2, 1);
		carrinhoDeCompras.removeProduto(produtoComTamanho1, 10);
		//assertEquals(2, carrinhoDeCompras.getProdutos().size());
		//assertEquals(0, carrinhoDeCompras.getProdutos().get(produtoComTamanho1), 0);
	}
	
	*/
	
	@Test
	public void testRemoverTodasAsQuantidadesProdutoComTamanhosIguais() {
		ProdutoComTamanho produtoComTamanho1 = new ProdutoComTamanho("Camiseta", 123, 10.0, "p");
		ProdutoComTamanho produtoComTamanho2 = new ProdutoComTamanho("Camiseta", 123, 10.0, "p");
		Produto produto1 = new Produto("Camiseta", 123, 10.0);
		Produto produto2 = new Produto("Camiseta", 123, 10.0);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionaProduto(produto1, 10);
		carrinhoDeCompras.adicionaProduto(produto2, 1);
		
		carrinhoDeCompras.adicionaProduto(produtoComTamanho1, 10);
		carrinhoDeCompras.adicionaProduto(produtoComTamanho2, 1);
		
		//carrinhoDeCompras.removeProduto(produtoComTamanho1, 11);
		
		//assertEquals(0, carrinhoDeCompras.getProdutos().size());
	}
}
