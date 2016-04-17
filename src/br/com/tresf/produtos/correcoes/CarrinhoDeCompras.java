package br.com.tresf.produtos.correcoes;
import java.util.HashMap;
import java.util.Map;


public class CarrinhoDeCompras {

	private Map<Produto, Integer> produtos = new HashMap<>();
	public double valorTotalDaCompra = 0.0;
	
	public void adicionaProduto(Produto produto, int quantidade) {
		if(produtos.containsKey(produto)) {
			this.produtos.put(produto, produtos.get(produto) + quantidade);
			return;
		}
		this.produtos.put(produto, quantidade);
	}
	
	public void removeProduto(Produto produto, int quantidade) {
		if(produtos.containsKey(produto)) {
			this.produtos.put(produto, produtos.get(produto) - quantidade);
			if(this.produtos.get(produto) <= 0) {
				this.produtos.remove(produto);
			}
		}
	}
	
	public double calculaValorTotalDaCompra() {
		for (Produto produto : this.produtos.keySet()) {
			this.valorTotalDaCompra += produto.getPreco() * this.produtos.get(produto);
		}
		return this.valorTotalDaCompra;
	}

	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}
}
