package aula20210614.hierarquiaComPessoa;

public class PessoaFísica extends Pessoa {
	private CPF cpf;
	
	public PessoaFísica(long id, String nome, CPF cpf) {
		super(id, nome);
		this.cpf = cpf;
	}
	
	public CPF getCpf() {
		return cpf;
	}

}
