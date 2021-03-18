package aula20210317.cofreComRegrasDeNegócio;

public class Cofre {
	//- senha : String
	private String senha;
	
	//- aberto : boolean = true
	private boolean aberto = true;
	
	
	//+ fechar(senha : String) : void
	public void fechar(String senhaInformada) {
		if (isFechado()) {
			throw new RuntimeException("Não é permitido fechar um cofre já fechado!");
		}		
		this.aberto = false;
		this.senha = senhaInformada;
	}
	
	//+ abrir(senhaInformada : String) : void
	public void abrir(String senhaInformada) {
		if (isAberto()) {
			throw new RuntimeException("Não é permitido abrir um cofre já aberto!");
		}
		if (this.senha.equals(senhaInformada)) {
			this.aberto = true;
			this.senha = null;			
		}
	}
	
	//+ isAberto() : boolean
	public boolean isAberto() {				
		return this.aberto;
	}
	
	public boolean isFechado() {				
		return !isAberto();
	}
	
	
	

}
