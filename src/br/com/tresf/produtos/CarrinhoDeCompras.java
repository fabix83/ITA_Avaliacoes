package br.com.tresf.produtos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private static Map<Produto, Integer> registroProdutos = new HashMap<Produto, Integer>();
	private ArrayList<Produto> listaCarrinho = new ArrayList<Produto>();

	// ADD PRODUTO
	public void adicionaProduto(Produto p, int qnt) {
		int i = 0;
		int soma = 0;

		if (registroProdutos.equals(p)) {
			soma += registroProdutos.get(p);
			registroProdutos.replace(p, soma);
		} else {
			registroProdutos.put(p, qnt);
		}
		while (i < qnt) {
			listaCarrinho.add(p);
			++i;
		}

	}

	// REMOVE PRODUTO
	public void removoProduto(Produto p, int qnt) {
		registroProdutos.remove(p);
	}

	// RETORNA PRECO TOTAL
	public int valorTotal() {

		int valorTotal = 0;

		for (int i = 0; i < listaCarrinho.size(); i++) {
			valorTotal += listaCarrinho.get(i).getPreco();
		}
		return valorTotal;
	}

	public static Map<Produto, Integer> getRegistroProdutos() {
		return registroProdutos;
	}

	public ArrayList<Produto> getListaCarrinho() {
		return listaCarrinho;
	}

}
