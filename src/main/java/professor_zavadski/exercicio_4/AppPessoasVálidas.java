package professor_zavadski.exercicio_4;

public class AppPessoasVálidas {
	
	public static void main(String[] args) {
		//Pessoa primeira = new Pessoa(null, -33);
		//Pessoa primeira = new Pessoa("     ", -33);
		//Pessoa primeira = new Pessoa("Xis", -33);
		//Pessoa primeira = new Pessoa("Xis Alencar", -33);
		//Pessoa primeira = new Pessoa("Xis Alencar", 0);
		Pessoa primeira = new Pessoa("Xis Alencar", 33);
		
		//primeira.nome = null;
		//primeira.idade = -999;
		primeira.alterarNome(null);
		primeira.alterarIdade(-999);
		
		//System.out.println(primeira.nome);
		//System.out.println(primeira.idade);
		System.out.println(primeira.retornarNome());
		System.out.println(primeira.retornarIdade());
	}
}



/*
String nome = "   Felisbino de Almeida Costa e Silva    ";
String[] componentesDoNome = nome.trim().split(" ");
//componentes do nome ==> {"Felisbino", "de", "Almeida", "Costa", "e", "Silva"}
for (String componente : componentesDoNome) {
	System.out.println(componente);
}
*/
