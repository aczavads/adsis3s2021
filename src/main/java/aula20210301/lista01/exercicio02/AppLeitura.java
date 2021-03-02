package aula20210301.lista01.exercicio02;

import java.util.Scanner;

public class AppLeitura {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);		
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		String idade = leitor.nextLine();
		
		System.out.println(nome + " " + idade);
		
	}

}
