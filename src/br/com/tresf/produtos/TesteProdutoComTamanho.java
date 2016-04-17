package br.com.tresf.produtos;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	Produto p;
	ProdutoComTamanho p2, p3;

	@Before
	public void before() {
		p = new Produto("Produto", 001, 5);
		
		p2 = new ProdutoComTamanho("ProdutoA", 001, 5, 42);
		p3 = new ProdutoComTamanho("ProdutoB", 001, 25, 42);

	}

	@Test
	public void testeProdutosIguaisComTamanhoDiferentes() {
		assertEquals(equals(p2), equals(p3));
	}

	@Test
	public void testeProdutosDiferentes() {
		if (equals(p2) != equals(p3) && p2.hashCode() != p3.hashCode())
			System.out.println("falha no metodo equals");
		else
			System.out
					.println("HasCode Diferentes, porem retorno Equals; produtos iguals");

	}
	
	@Test
	public void testeProdutosTiposDiferentes(){
		if (equals(p) != equals(p2) && p.hashCode() != p2.hashCode()){
			System.out.println("Produtos de Tipos Diferentes");
		}else{
			System.out.println("Falha no metodo Equals.");
		}
	}

	@Test
	public void testeEquals() {
		assertEquals(true, p2.equals(p3));
	}

}
