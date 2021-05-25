package aula20210517.repositório;

public class Cor {
	private String nome;
	private String sigla;

	public Cor(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
