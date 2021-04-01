package aula20210331.valueObjectsV2;

public class Pessoa {
	private Nome nome;
	
	public Pessoa(Nome nome) {
		setNome(nome);
	}
	
	public Nome getNome() {
		return nome;
	}
	
	public void setNome(Nome nome) {
		this.nome = nome;
	}
}
