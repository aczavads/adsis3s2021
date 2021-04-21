package aula20210420.getters_setters;

public class Celular {
	//Atributos não estáticos (normais) são atributos DA INSTÂNCIA(OU DO OBJETO), ou seja,
	//se tivemos 1_000_000 de objetos, teremos 1_000_000 de valores para a marca.
	private String marca;
	
	//Atributos static são atributos DA CLASSE, ou seja, um ÚNICO VALOR 
	//independentemente do número de objetos.
	//private static String marca;
	
	public String getMarca() {
		//return null;
		return this.marca;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}

}
