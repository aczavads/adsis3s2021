package aula20210322.carro;

public class AppCarro {
	
	//+ main(args : String[]) : void
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
			
		try {
			meuCarro.ligar();
			meuCarro.ligar();
		} catch (Exception e) {
			System.out.println("Opa, problemas ao tentar LIGAR o carro! " + e.getMessage());
		}
		
		try {
			meuCarro.desligar();
			meuCarro.desligar();			
		} catch (Exception e) {
			System.out.println("Opa, problemas ao DESLIGAR o carro! " + e.getMessage());
		}
		
		
		System.out.println("Fim. O carro está... " + (meuCarro.isLigado() ? "Ligado" : "Desligado")) ;
		
	}
	
	

}
