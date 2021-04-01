package aula20210331.valueObjectsV2;

public class Produto {
	private Nome nome;
	
	public Produto(Nome nome) {
		setNome(nome);
	}
	
	public Nome getNome() {
		return nome;
	}
	
	public void setNome(Nome nome) {
		this.nome = nome;
	}
}
