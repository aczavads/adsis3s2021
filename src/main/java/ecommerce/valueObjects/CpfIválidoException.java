package ecommerce.valueObjects;

public class CpfIválidoException extends RuntimeException {
	private String cpfInválido;
	
	public CpfIválidoException(String mensagem, String cpfInválido) {
		super(mensagem);
		this.cpfInválido = cpfInválido;
	}
	
	public String getCpfInválido() {
		return cpfInválido;
	}

}
