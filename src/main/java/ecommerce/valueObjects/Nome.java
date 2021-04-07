package ecommerce.valueObjects;

public class Nome {
	private String valor;
	
	public Nome(String valor) {
		setValor(valor);
	}
	
	public String getValor() {
		return valor;
	}
	
	private void setValor(String valor) {
		if (valor == null || valor.trim().length() == 0 || valor.trim().split(" ").length < 2) {
			throw new RuntimeException("Nome não pode ser nulo, nem vazio e deve ser composto por 2 palavras!");
		}		
		this.valor = valor;
	}
}
