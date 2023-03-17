package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {
public static void main(String[] args) {
	/*Set*/ Collection<String> alunos = new HashSet<>();
	alunos.add("Rodrigo Turini");
	alunos.add("Alberto Souza");
	alunos.add("Nico Steppat");
	alunos.add("Sergio Lopes");
	alunos.add("Renan Saggio");
	alunos.add("Mauricio Aniche");
	//Não repete elementos
	alunos.add("Alberto Souza");
	
	System.out.println("Testando o mmetodo contains ");
	boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
	System.out.println(pauloEstaMatriculado);
	System.out.println();		
	System.out.println("Tamanho do conjunto -------------");
	System.out.println(alunos.size());
	System.out.println();
	System.out.println("FOREACH--------------------------");
	for (String aluno : alunos) {
		System.out.println(aluno);
	}
	System.out.println();
	System.out.println("For Lambda--------------------- ");
	alunos.forEach(aluno -> {
		System.out.println(aluno);
	});
	System.out.println();
	System.out.println("Elementos do conjunto------------");
	System.out.println(alunos);
	
	alunos.remove("Sergio Lopes");
}
}
