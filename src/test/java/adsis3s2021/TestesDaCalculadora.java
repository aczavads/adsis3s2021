package adsis3s2021;

import static org.junit.Assert.*;

import org.junit.Test;

import adsis3s2021.introduçãoCalculadora.Calculadora;

public class TestesDaCalculadora {

	@Test
	public void testarSomar() {
		Calculadora calculadoraDeTeste = new Calculadora();

		assertEquals(2, calculadoraDeTeste.somar(1, 1));
		assertEquals(0, calculadoraDeTeste.somar(-1, 1));
	}

}
