package adsis3s2021.introduçãoCalculadora;

public class Calculadora {
	private Integer memória = null; 
	private int resultadoÚltimaOperação; 
	
	
	public int somar(int valor1, int valor2) {
		resultadoÚltimaOperação = valor1 + valor2;
		//resultadoÚltimaOperação = valor1 + valor1;
		return resultadoÚltimaOperação;
	}
	
	public void memorizar() {
		memória = resultadoÚltimaOperação;		
	}
	
	public void limparMemória() {
		memória = null;		
	}
	
	public Integer getMemória() {
		return memória;
	}


}
