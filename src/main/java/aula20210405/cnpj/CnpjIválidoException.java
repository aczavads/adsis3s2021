package aula20210405.cnpj;

public class CnpjIválidoException extends RuntimeException {
	private String cnpjInválido;
	
	public CnpjIválidoException(String mensagem, String cnpjInválido) {
		super(mensagem);
		this.cnpjInválido = cnpjInválido;
	}
	
	public String getCpfInválido() {
		return cnpjInválido;
	}

}
