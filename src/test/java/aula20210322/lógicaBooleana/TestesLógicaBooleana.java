package aula20210322.lógicaBooleana;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesLógicaBooleana {

	@Test
	public void testarIgualdadeModoA() {
		int valor1 = 100;
		int valor2 = 100;		
		
		assertTrue(valor1 == valor2);
	}
	
	@Test
	public void testarIgualdadeModoB() {
		int valor1 = 100;
		int valor2 = 100;		
		boolean valor1IgualValor2 = valor1 == valor2;  //vai retornar true, pois 100 == 100, certo? 
		
		assertTrue(valor1IgualValor2);
	}
	

}
