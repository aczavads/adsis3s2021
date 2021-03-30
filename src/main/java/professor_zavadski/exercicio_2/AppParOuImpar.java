package professor_zavadski.exercicio_2;

public class AppParOuImpar {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int restoDaDivisãoPorDois = i % 2;
			boolean éPar = restoDaDivisãoPorDois == 0; 
			if (éPar) {
				System.out.println(i + " ==> par");				
			} else {
				System.out.println(i + " ==> ímpar");								
			}
		}
	}
}
