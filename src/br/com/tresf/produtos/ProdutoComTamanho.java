package br.com.tresf.produtos;
public class ProdutoComTamanho extends Produto {

	private int numeracaoTamanho;

	public ProdutoComTamanho(String nome, int codigo, Integer preco,
			int numeracaoTamanho) {
		super(nome, codigo, preco);
		this.numeracaoTamanho = numeracaoTamanho;

	}

	public int hashCode(ProdutoComTamanho p) {
		int result = 1;
		if (equals(p) == true) {
			final int prime = 31;
			result = prime * result + p.numeracaoTamanho;
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
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (numeracaoTamanho != other.numeracaoTamanho)
			return false;
		return true;
	}

	public int getNumeracaoTamanho() {
		return numeracaoTamanho;
	}

}
