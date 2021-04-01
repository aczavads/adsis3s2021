package aula20210331.valueObjectsV1;

public class Produto {
	private String nome;
	
	public Produto(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome == null || nome.trim().length() == 0 || nome.trim().split(" ").length < 2) {
			throw new RuntimeException("Nome não pode ser nulo, nem vazio e deve ser composto por 2 palavras!");
		}		
		this.nome = nome;
	}
}
