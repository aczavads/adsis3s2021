package adsis3s2021.introduçãoCalculadora;

public class AppIntroduçãoCalculadora {
	
	//MÉTODO MAIN: método é o nome que se dá a um procedimento que foi declarado dentro da classe.
	public static void main(String[] args) {
		Calculadora minha = new Calculadora();
		Calculadora sua = new Calculadora();
		sua.somar(1000, 9999);
		sua.memorizar();
		
		int somaTresComQuatro = minha.somar(3,4);
		minha.memorizar();
		int somaUmComUm = minha.somar(1,1);
		
		System.out.println("3+4=" + somaTresComQuatro);
		System.out.println("1+1=" + somaUmComUm);
		System.out.println("Memória da minha calculadora=" + minha.getMemória()); 
		minha.limparMemória();
		System.out.println("Memória da minha calculadora=" + minha.getMemória());
		
		System.out.println("Memória da sua calculadora=" + sua.getMemória());
	}

}
