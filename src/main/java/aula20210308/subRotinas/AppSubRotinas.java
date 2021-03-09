package aula20210308.subRotinas;

public class AppSubRotinas {
	
	public static void main(String[] args) {
		
		double salário = 4500.00;
		
		//double metadeDoSalário = salário / 2;
		dividirValidandoDivisor(salário, 2);
			
		double divisor = 0;
		//double fraçãoDoSalário = salário / divisor;
		dividirValidandoDivisor(salário, divisor);
		
		dividirValidandoDivisor(100, 33);
		dividirValidandoDivisor(1000, 2);
		dividirValidandoDivisor(200, 125);
		
	}
	
	public static void dividirValidandoDivisor(double dividendo, double divisor) {
		if (divisor <= 0) {
			System.out.println("Opa, divisor zero!");
		} else {
			System.out.println(dividendo +  " / " + divisor + " = " + (dividendo/divisor));
		}
	}

}
