package aula20210503.conjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppConjuntos {
	
	public static void main(String[] args) {
		String nome = "Arthur Cattaneo Zavadski Jr";
		System.out.println(nome.hashCode());
		
		Integer cem = 100;
		System.out.println(cem.hashCode());
		
		List<Integer> listaDeInteiros = new ArrayList<>(); 
		listaDeInteiros.add(100);
		listaDeInteiros.add(50);
		listaDeInteiros.add(50);
		listaDeInteiros.add(2);
		
		Set<Integer> conjuntoDeInteiros = new HashSet<>();
		conjuntoDeInteiros.add(100);
		conjuntoDeInteiros.add(50);
		conjuntoDeInteiros.add(50);
		conjuntoDeInteiros.add(2);

		Set<String> conjuntoDeNomes= new HashSet<>();
		conjuntoDeNomes.add("Maria");
		conjuntoDeNomes.add("Maria");
		conjuntoDeNomes.add("Maria");
		conjuntoDeNomes.add("Maria");
		conjuntoDeNomes.add("Maria");
		
		listarColeção(">>> List", listaDeInteiros);
		listarColeção(">>> Set", conjuntoDeInteiros);
		listarColeção(">>> Set de Nomes", conjuntoDeNomes);
	}
	
	public static void listarColeção(String mensagem, Collection<? extends Object> coleção) {
		System.out.println(mensagem);
		for (Object elemento : coleção) {
			System.out.println(elemento);
		}
		System.out.println("------------------");
	}

}





