package professor_zavadski.exercicio_3;

public class AppMaiorOuMenor {
	
	public static void main(String[] args) {
		//int[] valores = {1,2,3};
		//boolean[] booleanos = {true, true, false};
		//char[] caracteres = {'z', 'x', '5'};
		
		Pessoa arthur = new Pessoa();
		arthur.nome = "Arthur Cattaneo Zavadski";
		arthur.idade = 45;
		
		Pessoa josé = new Pessoa();
		josé.nome = "José Matias Gualberto Salles";
		josé.idade = 16;
		
		Pessoa ana = new Pessoa();
		ana.nome = "Ana Luíza Schwingel";
		ana.idade = 15;
		
		
		Pessoa[] pessoas = {ana, arthur, josé};
		

		/*
		Pessoa[] pessoas = {new Pessoa(),  new Pessoa(), new Pessoa()};
		pessoas[0].nome = "Arthur Cattaneo Zavadski";
		pessoas[0].idade = 45;
		pessoas[1].nome = "José Matias Gualberto Salles";
		pessoas[1].idade = 16;
		pessoas[2].nome = "Ana Luíza Schwingel";
		pessoas[2].idade = 15;
		*/

		
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa atual = pessoas[i];
			if (atual.idade >= 18) {
				System.out.println(atual.nome + " ==> maior de idade");
			} else {
				System.out.println(atual.nome + " ==> menor de idade");
			}
			System.out.println();
		}
	}

}





