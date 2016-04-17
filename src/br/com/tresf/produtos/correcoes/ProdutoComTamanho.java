package br.com.tresf.produtos.correcoes;

public class ProdutoComTamanho extends Produto {

	private String tamanho;
	
	public ProdutoComTamanho(String nome, Integer codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		return result;
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
		if (tamanho == null && getCodigo() == null) {
			if (other.tamanho != null && other.getCodigo() != null)
				return false;
		} else if (!tamanho.equals(other.tamanho) && !getCodigo().equals(other.getCodigo()))
			return false;
		return true;
	}

	public String getTamanho() {
		return tamanho;
	}
}
