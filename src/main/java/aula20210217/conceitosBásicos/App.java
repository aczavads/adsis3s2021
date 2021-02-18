package aula20210217.conceitosBásicos;

import java.util.*;

public class App {
	
	public static void main(String[] args) {		
		Scanner leitor = new Scanner(System.in);			
		String linha = "";
		while (true) {
			System.out.println("Digite seu nome: ");
			linha = leitor.nextLine();
			if (linha == "") {
				break;
			}			
			System.out.println("Olá " + linha.trim().toUpperCase() + ", tudo bem?");
			System.out.println("Tamanho do seu nome: " + linha.trim().length());
		}
		System.out.println("Tchau!");				
	}
	
}
