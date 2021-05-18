package aula20210517.repositório;

public class AppRepositório {
	
	public static void main(String[] args) {
		Cor c1 = new Cor("Azul", "BL");
		Cor c2 = new Cor("Verde", "GRN");
		Cor c3 = new Cor("Preto", "BLCK");
		Cor c4 = new Cor("Prata", "SLVR");
		
		//CorRepository repo = new CorRepositoryTransient();
		CorRepository repo = new CorRepositoryPersistent();
		repo.salvar(c1);
		repo.salvar(c2);
		repo.salvar(c3);
		repo.salvar(c4);
		
		imprimirCoresNoConsole(repo);
	}

	private static void imprimirCoresNoConsole(CorRepository repo) {
		System.out.println();
		for (Cor c : repo.obterTodas()) {
			System.out.println(c.getNome() + " " + c.getSigla());
		}
	}
}
