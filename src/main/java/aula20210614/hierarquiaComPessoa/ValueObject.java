package aula20210614.hierarquiaComPessoa;

public abstract class ValueObject {
	private String valor;
	
	public ValueObject(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
