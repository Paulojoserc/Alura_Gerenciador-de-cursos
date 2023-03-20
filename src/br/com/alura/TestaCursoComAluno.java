package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
public static void main(String[] args) {
	
Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira" );
	
	javaColecoes.adciciona(new Aula("Trabalhando com ArrayList",21));
	javaColecoes.adciciona(new Aula("Criando uma Aula",20));
	javaColecoes.adciciona(new Aula("Modelando com coleções",22));
	
	Aluno a1 = new Aluno("Rodrigo Turini",34672);
	Aluno a2 = new Aluno("Guilherme Silveira",5617);
	Aluno a3 = new Aluno("Mauricio Aniche",17645);
	
	javaColecoes.matricula(a1);
	javaColecoes.matricula(a2);
	javaColecoes.matricula(a3);
	
	System.out.println("Todos os alunos matriculados: ");
	
	Set<Aluno> alunos = javaColecoes.getAlunos();
	Iterator<Aluno> iterador = alunos.iterator();
	while(iterador.hasNext()) {
		Aluno proximo = iterador.next();
		System.out.println(proximo);
	}
	
//	javaColecoes.getAlunos().forEach(a -> {
//		System.out.println(a);
//	});
	System.out.println("O aluno "+a1+" está matriculado?");
	System.out.println(javaColecoes.estaMatriculado(a1));
	
	Aluno turini = new Aluno("Rodrigo Turini",34672);
	System.out.println("E essse Turini, está matriculado?");
	System.out.println(javaColecoes.estaMatriculado(turini));
	
	System.out.println("Aluno a1 é o mesmo Turini?");
	System.out.println(a1==turini);
	
	System.out.println("Aluno a1 é equals Turini?");
	System.out.println(a1.equals(turini));
	
}
}
