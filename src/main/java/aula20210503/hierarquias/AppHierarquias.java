package aula20210503.hierarquias;

public class AppHierarquias {
	
	
	public static void main(String[] args) {
		Biblioteca unicesumarCentral = new Biblioteca();
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		unicesumarCentral.adicionar(new Livro("Big Java", 5));
		/*
		unicesumarCentral.adicionar(new Revista("Super Interessante ed. 33");
		unicesumarCentral.adicionar(new Revista("Super Interessante ed. 33");
		unicesumarCentral.adicionar(new Revista("Super Interessante ed. 34");
		unicesumarCentral.adicionar(new Revista("Super Interessante ed. 35");
		*/
		
		for (Publicação p : unicesumarCentral.getAcervo()) {
			if (p instanceof Livro) {
				//coerção de tipos (type casting)
				Livro aux = (Livro) p;
				System.out.println(aux.getTítulo() + " edição=" + aux.getEdição());
			} else {
				System.out.println(p.getTítulo());				
			}
		}
		
		
	}

}
