package aula20210601.nanoTime;

public class AppNanoTime {
	
	public static void main(String[] args) {
		String qualquer = "Qualquer ";
		
		for (int i = 0; i < 20; i++) {
			System.out.println(qualquer + ": " + System.nanoTime());
			
		}
	}

}
