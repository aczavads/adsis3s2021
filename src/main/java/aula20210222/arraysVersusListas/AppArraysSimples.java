package aula20210222.arraysVersusListas;

public class AppArraysSimples {
	
	public static void main(String[] args) {
		int[] idades = new int[5];
		idades[3] = 21;
		for (int i : idades) {
			System.out.println(i);
		}
		
		String[] cidades = new String[5];
		cidades[3] = "Maringá";
		for (String c: cidades) {
			System.out.println(c);
		}
	}
}
