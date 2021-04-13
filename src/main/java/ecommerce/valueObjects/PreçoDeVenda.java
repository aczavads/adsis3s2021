package ecommerce.valueObjects;

public class PreçoDeVenda {
	private double valor;
	
	public PreçoDeVenda(double valor) {
		//this.valor = valor;
		setValor(valor);
	}
	
	public void setValor(double novoValor) {
		if (novoValor < 0.00) {
			throw new RuntimeException("O preço não pode ser negativo!");
		}
		this.valor = novoValor;
	}
	
	public double getValor() {
		return valor;
	}

}



