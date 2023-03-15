package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String geyInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		//apenas leitura não pode add ou remover apenas consultar 
		return Collections.unmodifiableList(aulas);
	}
	
	public void adciciona(Aula aula) {
		this.aulas.add(aula);
	}
}
