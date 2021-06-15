package aula20210614.entidadesComSuperclasses;

import java.util.ArrayList;
import java.util.List;

public class AppEntidadesComSuperclasses {
	
	public static void main(String[] args) {
		
		Computador hp445g7 = new Notebook();
		Computador dellPoweredgeT140 = new Servidor();
		Computador pcMontado = new Desktop();
		
		List<Computador> computadoresParaConsertar = new ArrayList<>();
		computadoresParaConsertar.add(hp445g7);
		computadoresParaConsertar.add(pcMontado);
		computadoresParaConsertar.add(dellPoweredgeT140);
		
		for (Computador computador : computadoresParaConsertar) {
			System.out.println(
					computador.getId() 
					+ " => " 
					+ computador.getClass().getSimpleName());
		}
		
		
	}

}
