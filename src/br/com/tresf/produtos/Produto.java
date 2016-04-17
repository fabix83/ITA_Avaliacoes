package br.com.tresf.produtos;
public class Produto {

	private String nome;
	private int codigo;
	private Integer preco;

	public Produto(String nome, int codigo, Integer preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int hashCode(Produto p) {
		int result = 1;
		if (equals(p) == true) {
			final int prime = 31;
			result = prime * result + codigo;
			return result;
		} else {
			return result;
		}
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public Integer getPreco() {
		return preco;
	}

}
