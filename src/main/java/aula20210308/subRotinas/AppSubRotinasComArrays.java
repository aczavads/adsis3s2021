package aula20210308.subRotinas;

import java.text.DecimalFormat;

public class AppSubRotinasComArrays {
	
	public static void main(String[] args) {
		DecimalFormat formater = new DecimalFormat("#,###,##0.00");
		
		
		//Primeiro array....  
		int[] valores1 = {10,30,125,1,2,3,80,15,7,8,9};
		System.out.println("Média dos valores=" + formater.format(calcularMédiaDosValores(valores1)));		
		System.out.println("Média dos valores=" + formater.format(26.363636363636363));		
		System.out.println("Média dos valores=" + (26.36));		
		System.out.println("Média dos valores=26.36");		
		
		//Segundo array...	
		int[] valores2 = {10,3,45,1,2,300};
		System.out.println("Média dos valores=" + formater.format(calcularMédiaDosValores(valores2)));		
	
		//Terceiro array...	
		int[] valores3 = {100,2,45,1,2,3,7,8,99};
		System.out.println("Média dos valores=" + formater.format(calcularMédiaDosValores(valores3)));
		
	}
	
	public static double calcularMédiaDosValores(int[] valores) {
		double somaDosValores = 0;
		for (int i = 0; i < valores.length; i++) {
			somaDosValores = somaDosValores + valores[i];
		}
		return somaDosValores / valores.length;
	}
	
	

}
