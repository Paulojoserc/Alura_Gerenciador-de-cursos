package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
public static void main(String[] args) {
	Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira" );
	
	javaColecoes.adciciona(new Aula("Trabalhando com ArrayList",21));
	javaColecoes.adciciona(new Aula("Criando uma Aula",20));
	javaColecoes.adciciona(new Aula("Modelando com coleções",22));
	
	List<Aula> aulasImutaveis = javaColecoes.getAulas();
	System.out.println(aulasImutaveis);
	
	System.out.println();
	List<Aula> aulas = new ArrayList<>(aulasImutaveis);
	
	Collections.sort(aulas);
	System.out.println(aulas);
	
	System.out.println();
	
	System.out.println(javaColecoes.getTempoTotal());
	
	System.out.println(javaColecoes);
}
}
