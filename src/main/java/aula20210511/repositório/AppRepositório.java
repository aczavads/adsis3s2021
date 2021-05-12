package aula20210511.repositório;

public class AppRepositório {
	
	public static void main(String[] args) {
		Cor c1 = new Cor("Azul", "BL");
		Cor c2 = new Cor("Verde", "GRN");
		Cor c3 = new Cor("Preto", "BLCK");
		Cor c4 = new Cor("Prata", "SLVR");
		
		CorRepository repo = new CorRepository();
		repo.salvar(c1);
		repo.salvar(c2);
		repo.salvar(c3);
		repo.salvar(c4);
		
		
	}

}
