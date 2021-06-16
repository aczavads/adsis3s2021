package aula20210615.tryCatchFinally;

import java.util.Random;

public class AppTryCatch {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		Long valorQualquer = 5000L;
		
		for (int i = 0; i < 100; i++) {
			try {
				System.out.println(valorQualquer / ((int) (5 * r.nextDouble())));				
			} catch (ArithmeticException e) {
				System.out.println("Opa, acho que tentou dividir por zero! " + e.getMessage());
			}
		}
		
	}

}
