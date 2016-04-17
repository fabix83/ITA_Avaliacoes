package br.com.tresf.formatanome;

public class Informal implements FormatadorNome {

	@Override
	public String formataNome(String nome, String sobrenome) {
		return nome;
	}

}
