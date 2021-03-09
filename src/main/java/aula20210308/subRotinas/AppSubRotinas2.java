package aula20210308.subRotinas;

public class AppSubRotinas2 {
	
	public static void main(String[] args) {
		
		double peso = 74;
		double altura = 1.84;
		
		//System.out.println("IMC=" + (74 / (1.84*1.84)));
		//System.out.println("IMC=" + (peso / (altura*altura)));
		System.out.println(calcularIMC(peso, altura));
		System.out.println(calcularIMC(90, 1.78));
		System.out.println(calcularIMC(90, 0));
		
	}
	
	public static double calcularIMC(double peso, double altura) {
		if (peso <= 0 || altura <= 0) {
			throw new RuntimeException("Tá de brincadeira comigo né? Altura e/ou peso zerados ou negativos? :P");
		}
		return peso / (altura * altura);		
	}

}
