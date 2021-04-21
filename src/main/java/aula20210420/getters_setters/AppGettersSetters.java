package aula20210420.getters_setters;

public class AppGettersSetters {
	
	public static void main(String[] args) {
		
		Celular meu = new Celular();
		meu.setMarca("Apple");
		System.out.println( meu.getMarca() );
		
		Celular seu = new Celular();
		System.out.println( seu.getMarca() );
		
	}

}
