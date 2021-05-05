package aula20210504.hierarquias;

public class AppHierarquias {
	
	
	public static void main(String[] args) {
		Biblioteca unicesumarCentral = new Biblioteca();
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		
		unicesumarCentral.adicionar(new Revista("Super Interessante", 33));
		unicesumarCentral.adicionar(new Revista("Super Interessante", 33));
		unicesumarCentral.adicionar(new Revista("Super Interessante", 34));
		unicesumarCentral.adicionar(new Revista("Super Interessante", 35));
		
		
		for (Publicação p : unicesumarCentral.getAcervo()) {
			if (p instanceof Livro) {
				//coerção de tipos (type casting)
				Livro aux = (Livro) p;
				System.out.println(aux.getTítulo() + " edição=" + aux.getEdição());
			} else if (p instanceof Revista) {
				Revista aux = (Revista) p;
				System.out.println(aux.getTítulo() + " edição=" + aux.getNúmero());
			}
		}
		
		
	}

}
