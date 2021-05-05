package aula20210504.abstraçõesComClasses;

import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<CoisaQueVoa> coisas = criarCoisasQueVoam();
		for (CoisaQueVoa coisa : coisas) {
			coisa.voar();
		}
	}
	
	
	
	
	
	
	public static List<CoisaQueVoa> criarCoisasQueVoam() {
		return Arrays.asList(
				new Coruja(), 
				new Coruja(), 
				new Helicóptero());
	}

}
