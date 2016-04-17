package br.com.tresf.heranca;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteCarrinhoDeCompra {
	
	@Test
	public void testeCarrinhoCompra() {
		
		Produto produto = new Produto("produto1", "COD1", 1);
		Produto outroProduto = new Produto ("produto2", "COD2", 10);
		
		ProdutoComTamanho produtoComTamanho = new ProdutoComTamanho("ProdutoComTamanho1", "COD3", 1, 10);
		ProdutoComTamanho outroProdutoComTamanho = new ProdutoComTamanho("ProdutoComTamanho2", "COD4", 10, 10);
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		carrinho.adicionaProduto(produto, 1);
		carrinho.adicionaProduto(outroProduto, 1);
		carrinho.adicionaProduto(produtoComTamanho, 1);
		carrinho.adicionaProduto(outroProdutoComTamanho, 1);

		assertEquals(22, carrinho.getValorTotal(), 0.00001);
		
		carrinho.imprimirCarrinho();
		
	}
}
