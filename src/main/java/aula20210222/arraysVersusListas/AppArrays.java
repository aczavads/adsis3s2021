package aula20210222.arraysVersusListas;

public class AppArrays {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Ana","João","Lucas"};				
		exibirArray(nomes);

		String[] nomesPlus = new String[nomes.length+1];
		nomesPlus[3] = "Eliza";

		for (int i = 0; i < nomes.length; i++) {
			nomesPlus[i] = nomes[i];
		}
		exibirArray(nomesPlus);

		nomes[0] = null;
		nomes[1] = null;
		nomes[2] = null;
		exibirArray(nomes);
		
	}
	
	public static void exibirArray(String[] arrayDeStrings) {
		System.out.println("Tamanho do array: " + arrayDeStrings.length);
		for (int i = 0; i < arrayDeStrings.length; i++) {
			System.out.println(arrayDeStrings[i]);
		}
	}

}
