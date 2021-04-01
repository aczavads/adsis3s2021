package aula20210331.valueObjectsV1;

public class AppValueObjects {
	
	public static void main(String[] args) {
		try {
			Pessoa teste = new Pessoa("Fábio Silva");
			
			teste.setNome("Fábio Silva Jr");
			
			System.out.println(teste.getNome());			
		} catch (Exception e) {
			System.out.println("Xiiii... erro! " + e.getMessage());
		}
		System.out.println("Fim.");		
	}

}
