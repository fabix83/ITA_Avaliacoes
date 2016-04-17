package br.com.tresf.formatanome;
import org.junit.Test;

public class TesteAutoridade {

	Autoridade autoridade;
	String nome = "Fabio";
	String sobrenome = "Felix";
	FormatadorNome formatador;
	
	@Test
	public void testInformal() {
		formatador = new Informal();
		autoridade = new Autoridade(nome, sobrenome, formatador);
		
		//Imprimir apenas o nome
		System.out.print("Informal: ");
		autoridade.getTratamento();
	}

	@Test
	public void testRespeitoso() {
		formatador = new Respeitoso("m");
		autoridade = new Autoridade(nome, sobrenome, formatador);
		
		//Imprimir Sr. + nome (Masculino m) e Sra. nome (Feminino f)
		System.out.print("Respeitoso: ");
		autoridade.getTratamento();
	}
	
	@Test
	public void testComTitulo() {
		formatador = new ComTitulo("Mestre");
		autoridade = new Autoridade(nome, sobrenome, formatador);
		
		//Imprimir titulo + nome
		System.out.print("Com Titulo: ");
		autoridade.getTratamento();
	}
}
