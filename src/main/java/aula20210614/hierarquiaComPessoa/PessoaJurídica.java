package aula20210614.hierarquiaComPessoa;

public class PessoaJurídica extends Pessoa {
	private CNPJ cnpj;

	
	public PessoaJurídica(long id, String nome, CNPJ cnpj) {
		super(id, nome);
		this.cnpj = cnpj;
	}
	
	public CNPJ getCnpj() {
		return cnpj;
	}
	
}
