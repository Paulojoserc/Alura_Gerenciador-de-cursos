package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args)  {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Paulo Silveira" );
			
			javaColecoes.adciciona(new Aula("Trabalhando com ArrayList",21));
			javaColecoes.adciciona(new Aula("Criando uma Aula",20));
			javaColecoes.adciciona(new Aula("Modelando com cole��es",22));
			
			Aluno a1 = new Aluno("Rodrigo Turini",34672);
			Aluno a2 = new Aluno("Guilherme Silveira",5617);
			Aluno a3 = new Aluno("Mauricio Aniche",17645);
			
			javaColecoes.matricula(a1);
			javaColecoes.matricula(a2);
			javaColecoes.matricula(a3);
			
			System.out.println("Quem � o aluno com matricula 5617?");
			Aluno aluno = javaColecoes.buscaMatriculado(5617);
			System.out.println("Aluno: "+aluno);
	}
}