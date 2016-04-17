package br.com.tresf.formatanome;

public class Respeitoso implements FormatadorNome {
	
	String saudacao;
	
	Respeitoso (String sexo) {
		if (sexo == "m") {
			saudacao = "Sr. ";
		}
		if (sexo == "f") {
			saudacao = "Sra. ";
		}
	}
	
	public String formataNome(String nome, String sobrenome) {
		return saudacao + sobrenome;
	}
}
