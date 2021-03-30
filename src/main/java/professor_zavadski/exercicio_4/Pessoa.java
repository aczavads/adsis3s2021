package professor_zavadski.exercicio_4;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		/*
		if (nome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		if (nome.trim().length() == 0) {
			throw new RuntimeException("Nome não pode ser vazio!");
		}
		if (nome.trim().split(" ").length < 2) {
			throw new RuntimeException("O nome deve ser formado por mais de uma palavra!");
		}
		this.nome = nome;
		*/
		this.alterarNome(nome);
		
		

		/*
		if (idade < 0) {
			throw new RuntimeException("A idade deve ser maior ou igual a zero!");
		}
		this.idade = idade;
		*/
		this.alterarIdade(idade);
	}
	
	
	//deveria se chamar getNome()
	public String retornarNome() {
		return nome;
	}
	
	//deveria se chamar getIdade()
	public int retornarIdade() {
		return idade;
	}
	
	//deveria se chamar setNome(String novoNome)
	public void alterarNome(String novoNome) {
		if (novoNome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		if (novoNome.trim().length() == 0) {
			throw new RuntimeException("Nome não pode ser vazio!");
		}
		if (novoNome.trim().split(" ").length < 2) {
			throw new RuntimeException("O nome deve ser formado por mais de uma palavra!");
		}
		this.nome = novoNome;
	}
	
	//deveria se chamar setIdade(int novaIdade)
	public void alterarIdade(int novaIdade) {
		if (novaIdade < 0) {
			throw new RuntimeException("A idade deve ser maior ou igual a zero!");
		}
		this.idade = novaIdade;
	}

}



