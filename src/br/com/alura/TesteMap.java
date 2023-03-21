package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {
	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		// Para acessar as chaves devemos executar:
		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}

		// E para pegar os valores usamos:
		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println(idade);
		}

		//    Agora s� falta a terceira cole��o que devolve a associa��o. 
		//    Para tal, existe o m�todo entrySet() e cada associa��o � representado atrav�s da classe Entry:

		//Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		
		// Repare que o m�todo devolve um Set de Entry (respire fundo!!). Para acessar essa cole��o basta usar o foreach:
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
		for (Entry<String, Integer> associacao : associacoes) {
		    System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}
}
