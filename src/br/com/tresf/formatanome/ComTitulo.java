package br.com.tresf.formatanome;

public class ComTitulo implements FormatadorNome {

	String titulo;
	
	ComTitulo (String titulo) {
		this.titulo = titulo;
	}
	
	public String formataNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}

}
