package br.com.tresf.heranca;

import java.util.HashMap;

public class CarrinhoDeCompra {
	
	private HashMap<Produto, Integer> carrinho;
	private double valorTotal;

	CarrinhoDeCompra() {
		carrinho = new HashMap<>();
	}

	public void adicionaProduto(Produto produto, Integer quantidade) {
		Integer contador;
		if (carrinho.containsKey(produto)) {
			contador = carrinho.get(produto) + quantidade;
			carrinho.put(produto, contador);
			this.calculaValorTotal();
		} else {
			carrinho.put(produto, quantidade);
			this.calculaValorTotal();
		}
	}
	
	public void removerProduto (Produto produto, int quantidade) {
		Integer contador;
		
		if (carrinho.containsKey(produto)) {
			contador = carrinho.get(produto);
			if (quantidade > contador) {
			} else {
				contador -=quantidade;
				carrinho.put(produto, contador);
				
				//para saber se o produto chegou ao valor zero no carrinho, sera removido na listagem final
				contador = carrinho.get(produto);
				if (contador == 0) {
					carrinho.remove(produto);
				}
				this.calculaValorTotal();
			}
		} else {
			System.out.println("Erro: nao existe ainda o produto " + produto.getNome() + " de cod: " + produto.getCodigo());
		}
	}
	
	public void calculaValorTotal() {
		int valorInicial = 0;
		int valorFinal = 0;
		Integer quantidadeDeItens = 0;
		
		for (Produto chave : carrinho.keySet()) {
			quantidadeDeItens = carrinho.get(chave);
			valorInicial = chave.getPreco();
			valorInicial *= quantidadeDeItens;
			valorFinal += valorInicial;
		}
		this.setValorTotal(valorFinal);
	}
	
	public void imprimirCarrinho() {
		for (Produto chave : carrinho.keySet()) {
			Integer valor = carrinho.get(chave);
			System.out.println(chave + " \t\t" + valor + " Unid. " + " \t R$: " + chave.getPreco());
		}
		System.out.println("Valor Total do Carrinho = " + this.valorTotal);
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
