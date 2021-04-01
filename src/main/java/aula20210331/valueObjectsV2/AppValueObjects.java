package aula20210331.valueObjectsV2;

public class AppValueObjects {
	
	public static void main(String[] args) {
		try {
			Produto omo  = new Produto(new Nome("Omo"));
			
			Pessoa teste = new Pessoa(new Nome("Fábio Silva"));
			
			teste.setNome(new Nome("Fábio Silva Jr"));
			
			System.out.println(teste.getNome().getValor());			
		} catch (Exception e) {
			System.out.println("Xiiii... erro! " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim.");		
	}

}
