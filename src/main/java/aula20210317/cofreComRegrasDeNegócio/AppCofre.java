package aula20210317.cofreComRegrasDeNegócio;

public class AppCofre {
	
	
	public static void main(String[] args) {
		Cofre doQuarto101 = new Cofre();
		
		try {
			doQuarto101.abrir("8887");
		} catch (Exception e) {
			System.out.println("Opa, problemas ao tentar abrir o cofre! " + e.getMessage());
		}
		
		try {
			doQuarto101.fechar("1234");
			doQuarto101.fechar("1234");			
		} catch (Exception e) {
			System.out.println("Opa, problemas ao FECHAR o cofre! " + e.getMessage());
		}
		
		
		System.out.println("Fim. O cofre está... " + (doQuarto101.isAberto() ? "Aberto" : "Fechado")) ;
		
	}
	
	

}
