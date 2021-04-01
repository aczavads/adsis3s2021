package professor_zavadski.exercicio_5;

public class AppExibirNúmerosMúltiplos {

	public static void main(String[] args) {
		for (int número = 50; número <= 150; número++) {
			
			if (múltiploDe(número, 3) && múltiploDe(número, 5) && múltiploDe(número, 2)) {
				System.out.println(número);			
			}
		}
	}
	
	public static boolean múltiploDe(int número, int divisor) {
		int resto = número % divisor;
		boolean éMúltiplo = resto == 0;
		return éMúltiplo;
	}
	
	
	/*
	public static void main(String[] args) {
		for (int número = 50; número <= 150; número++) {
			int restoDivisaoPor3 = número % 3;
			int restoDivisaoPor5 = número % 5;
			int restoDivisaoPor2 = número % 2;

			boolean divisivelPor3 = restoDivisaoPor3 == 0;
			boolean divisivelPor5 = restoDivisaoPor5 == 0;
			boolean divisivelPor2 = restoDivisaoPor2 == 0;
			boolean divisívelPor3e5e2 = divisivelPor3 && divisivelPor5 && divisivelPor2;

			if (divisívelPor3e5e2) {
				System.out.println(número);
			}
		}
	}
	*/

}
