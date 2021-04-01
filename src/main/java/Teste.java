
public class Teste {
	
	public static void main(String[] args) {
		printHi(7);
	}

	private static void printHi(final int n) {
		for (int i = 1; i <= n-1; i++) {
			for( int j = i + 1; j <= n; j++) {
				System.out.println("Hi " + i + " ==> " + j);
			}
		}
	}

}
