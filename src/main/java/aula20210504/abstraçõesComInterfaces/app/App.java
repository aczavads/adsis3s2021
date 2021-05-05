package aula20210504.abstraçõesComInterfaces.app;

import java.util.Arrays;
import java.util.List;

import aula20210504.abstraçõesComInterfaces.CoisaQueCai;
import aula20210504.abstraçõesComInterfaces.CoisaQueVoa;
import aula20210504.abstraçõesComInterfaces.Coruja;
import aula20210504.abstraçõesComInterfaces.Helicóptero;

public class App {
	
	public static void main(String[] args) {
		List<CoisaQueVoa> coisas = criarCoisasQueVoam();
		for (CoisaQueVoa coisa : coisas) {
			coisa.voar();
			if (coisa instanceof CoisaQueCai) {
				CoisaQueCai aux = (CoisaQueCai) coisa;
				aux.cair();
			}
		}
		
	}
	
	
	
	
	
	
	public static List<CoisaQueVoa> criarCoisasQueVoam() {
		return Arrays.asList(
				new Coruja(), 
				new Coruja(), 
				new Helicóptero());
	}

}
