package professor_zavadski.exercicio_5;

public class AppDivisíveisPorTrêsECinco {

	public static void main(String[] args) {
		for (int número = 50; número <= 150; número++) {
			int restoDivisaoPor3 = número % 3;
			int restoDivisaoPor5 = número % 5;

			boolean divisivelPor3 = restoDivisaoPor3 == 0;
			boolean divisivelPor5 = restoDivisaoPor5 == 0;
			boolean divisívelPor3e5 = divisivelPor3 && divisivelPor5;

			if (divisívelPor3e5) {
				System.out.println(número);
			}
		}
	}

}
