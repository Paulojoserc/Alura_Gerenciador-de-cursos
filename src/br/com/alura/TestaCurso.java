package br.com.alura;

import java.util.List;

public class TestaCurso {
public static void main(String[] args) {
	Curso javaColecoes = new Curso("Dominando as cole��es do java", "Paulo Silveira" );
	
	//List<Aula> aulas = javaColecoes.getAulas();
	//System.out.println(aulas);
	
	//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
	javaColecoes.adciciona(new Aula("Trabalhando com ArrayList",21));
	javaColecoes.adciciona(new Aula("Criando uma Aula",20));
	javaColecoes.adciciona(new Aula("Modelando com cole��es",22));
	
	List<Aula> aulas = javaColecoes.getAulas();
	
	//System.out.println(aulas);
	
	System.out.println(javaColecoes.getAulas());
	
	//System.out.println(aulas == javaColecoes.getAulas());
}
}
