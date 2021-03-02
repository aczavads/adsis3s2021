package aula20210301.lista01.exercicio01;

public class AppStrings {
	
	public static void main(String[] args) {
		String original = "     olha que legal    ";
		String resultante = original.trim().toUpperCase();
		
		System.out.println("Original: ["  + original + "]. Tamanho=" + original.length());
		System.out.println("Resultante: ["  + resultante + "]. Tamanho=" + resultante.length());	
	}

}
