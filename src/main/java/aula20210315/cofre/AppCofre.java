package aula20210315.cofre;

public class AppCofre {
	
	
	public static void main(String[] args) {
		//Declarando 4 referências sendo que
		//3 delas estão inicializadas com 1 instância cada uma,
		//totalizando 3 instâncias de Cofre;
		Cofre doQuarto101 = new Cofre();
		Cofre doQuarto102 = new Cofre();
		Cofre doQuarto201 = new Cofre();
		Cofre doQuarto202 = null;
		
		testarCofre(doQuarto101);		
		testarCofre(doQuarto102);		
		testarCofre(doQuarto201);		
		testarCofre(doQuarto202);		
	}
	
	public static void testarCofre(Cofre cofre) {
		System.out.println(cofre);
		System.out.println("Está aberto (ao criar)? " + cofre.isAberto());
		cofre.fechar("1234");
		System.out.println("Está aberto (ao fechar)? " + cofre.isAberto());
		cofre.abrir("9999");
		System.out.println("Está aberto (abrir com senha errada)? " + cofre.isAberto());
		cofre.abrir("1234");
		System.out.println("Está aberto (abrir com senha certa)? " + cofre.isAberto());
	}
	

}
