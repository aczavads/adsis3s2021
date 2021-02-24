package aula20210222.arraysVersusListas;

public class AppListaEstática {
	
	public static void main(String[] args) {
		
		System.out.println("Lista de nomes...");
		NossaLista nomes = new NossaLista();
		nomes.adicionar("Ana");
		nomes.adicionar("João");
		nomes.adicionar("Lucas");
		nomes.adicionar("Eliza");
		//nomes.exibirLista();
		System.out.println(nomes.obter(2));
		nomes.remover(2);
		System.out.println("Tamanho da lista de nomes: " + nomes.tamanho());
		for (int i = 0; i < nomes.tamanho(); i++) {
			System.out.println(nomes.obter(i));
		}
		
		
		System.out.println("Lista de idades...");
		NossaLista idades = new NossaLista();
		idades.adicionar(33);
		idades.exibirLista();
		
	}

}
