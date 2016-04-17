package br.com.tresf.heranca;

public class ProdutoComTamanho extends Produto {
	
	private int tamanho;

	ProdutoComTamanho(String n, String c, int p, int t) {
		super(n, c, p);
		this.tamanho = t;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho;
		return result;
	}
	
	public int getTamanho() {
		return tamanho;
	}
}
