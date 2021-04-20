package aula20210419.estáticos;

public class AppEstáticos {
	
	public static void main(String[] args) {
		System.out.println(Math.sqrt(25));

		//N Ã O   F A Ç A M   I S S O!!!!  É só um exemplo dos uso de static!
		
		
		Validações.validarNome("Ana");
		Validações.validarNome("");
		Validações.validarNome(null);
		Validações.validarNome("Ana Maria de Almeida");
		
		Validações.validarCep("87010-555");
		
		
		
		
	}

}
