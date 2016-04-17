package br.com.tresf.heranca;

public class Produto{
	private String nome;
	private String codigo;
	private int preco;
	
	//Construtor da Classe
	Produto (String n, String c, int p) {
		this.nome = n;
		this.codigo = c;
		this.preco = p;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	//Metodos Getters & Setters
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}
}
