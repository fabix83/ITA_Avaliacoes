package br.com.tresf.formatanome;

public class Autoridade {
	String nome;
	String sobrenome;
	FormatadorNome formatador;
	
	Autoridade (String nome, String sobre, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobre;
		this.formatador = formatador;
	}
	
	public void getTratamento(){
		System.out.println(formatador.formataNome(nome, sobrenome));
	}
}
