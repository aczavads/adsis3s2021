package arthur_cattaneo_zavadski.aula20210317.carro;

public class Carro {
	private boolean ligado = false;
		
	public void desligar() {
		if (isDesligado()) {
			throw new RuntimeException("Não é permitido desligar um carro já desligado!");
		}		
		this.ligado = false;
	}
	
	public void ligar() {
		if (isLigado()) {
			throw new RuntimeException("Não é permitido ligar um carro já ligado!");
		}
		this.ligado = true;
	}
	
	public boolean isLigado() {				
		return this.ligado;
	}
	
	public boolean isDesligado() {				
		return !isLigado();
	}
}
