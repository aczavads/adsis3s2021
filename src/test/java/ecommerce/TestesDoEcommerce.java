package ecommerce;

import static org.junit.Assert.*;

import org.junit.Test;

import ecommerce.carrinhoDeCompra.CarrinhoDeCompra;
import ecommerce.cliente.Cliente;
import ecommerce.produto.Produto;
import ecommerce.valueObjects.CPF;
import ecommerce.valueObjects.Nome;
import ecommerce.valueObjects.PreçoDeVenda;

public class TestesDoEcommerce {

	@Test 
	public void testarTotalDoCarrinhoDeCompra() {
		Cliente ana = new Cliente(new Nome("Ana Luíza Marques"), new CPF("787.718.980-00"));
		Produto omo = new Produto(new Nome("Omo Progress"), new PreçoDeVenda(22.75));
		Produto ovos = new Produto(new Nome("Ovos 30 unidades"), new PreçoDeVenda(15.25));
		
		CarrinhoDeCompra carrinho01 = new CarrinhoDeCompra(ana);
		carrinho01.adicionarItem(omo);
		carrinho01.adicionarItem(ovos);
		
		assertEquals(38.00, carrinho01.getTotal(), 0.00);
		
	}
	
	@Test
	public void testarCarrinhoDeCompra() {		
		Cliente ana = new Cliente(new Nome("Ana Luíza Marques"), new CPF("787.718.980-00"));
		
		CarrinhoDeCompra carrinho01 = new CarrinhoDeCompra(ana);
		
		assertSame(ana, carrinho01.getCliente());		
		
		assertEquals(ana.getNome().getValor(), carrinho01.getCliente().getNome().getValor());
	}
	
	@Test
	public void testarProduto() {
		Produto novo = new Produto(new Nome("Omo Progress"), new PreçoDeVenda(22.75));
		
		assertEquals(22.75, novo.getPreçoDeVenda().getValor(), 0.00);
		
		assertEquals("Omo Progress", novo.getNome().getValor());
	}

}
