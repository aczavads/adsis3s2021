package aula20210322.carro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesDoCarro {

	@Test
	public void testarSeNovoCarroNasceDesligado() {
		Carro novo = new Carro();
		
		assertTrue("Quando criados, carros devem estar DESLIGADOS!",novo.isDesligado());
	}
	@Test
	public void testarSeNovoCarroLiga() {
		Carro novo = new Carro();
		novo.ligar();
		assertTrue("Quando ligados, carros devem ficar LIGADOS!", novo.isLigado());
	}
	@Test
	public void testarSeCarroLigadoDesliga() {
		Carro novo = new Carro();
		novo.ligar();
		
		novo.desligar();
		assertTrue("Quando desligados, carros devem ficar DESLIGADOS!", novo.isDesligado());
	}
	@Test(expected = RuntimeException.class)
	public void testarSeTentativaDeLigarCarroJáLigadoGeraExceção() {
		Carro novo = new Carro();
		novo.ligar();
		novo.ligar();		
	}
	
	@Test(expected = RuntimeException.class)
	public void testarSeTentativaDeDesligarCarroJáDesligadoGeraExceção() {
		Carro novo = new Carro();
		novo.ligar();
		
		novo.desligar();
		novo.desligar();		
	}
	

}












