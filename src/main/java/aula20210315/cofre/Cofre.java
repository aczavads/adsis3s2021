package aula20210315.cofre;

public class Cofre {
	//- senha : String
	private String senha;
	
	//- aberto : boolean = true
	private boolean aberto = true;
	
	
	//+ fechar(senha : String) : void
	public void fechar(String senhaInformada) {
		this.aberto = false;
		this.senha = senhaInformada;
	}
	
	//+ abrir(senhaInformada : String) : void
	public void abrir(String senhaInformada) {
		//NÃO USAMOS O == PARA COMPARAR CONTEÚDO DE REFERÊNCIAS, usamos o método "equals".
		//if (this.senha == senhaInformada) { 
		if (this.senha.equals(senhaInformada)) {
			this.aberto = true;
			this.senha = null;			
		}
	}
	
	//+ isAberto() : boolean
	public boolean isAberto() {				
		return this.aberto;
	}
	
	
	
	

}
