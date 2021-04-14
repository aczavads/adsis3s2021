package ecommerce;

import ecommerce.carrinhoDeCompra.CarrinhoDeCompra;
import ecommerce.cliente.Cliente;
import ecommerce.produto.Produto;
import ecommerce.valueObjects.CPF;
import ecommerce.valueObjects.Nome;
import ecommerce.valueObjects.PreçoDeVenda;

public class AppECommerce {
	
	public static void main(String[] args) {
		Produto pampersXXG = new Produto(
				new Nome("Fralda Pampers Confort Sec XXG 56un"), 
				new PreçoDeVenda(54.90));
		
		Produto pampersXG = new Produto(
				new Nome("Fralda Pampers Confort Sec XG 56un"), 
				new PreçoDeVenda(44.20));
		
		Cliente arthur = new Cliente(new Nome("Arthur Cattaneo Zavadski"), new CPF("659.389.750-77"));
		
		
		CarrinhoDeCompra compraDoArthur = new CarrinhoDeCompra(arthur);
		compraDoArthur.adicionarItem(pampersXXG);
		compraDoArthur.adicionarItem(pampersXG);
		
		System.out.println("Total compraDoArthur: " + compraDoArthur.getTotal());
		
		pampersXG.setPreçoDeVenda(new PreçoDeVenda(50.00));
		
		System.out.println("Total compraDoArthur: " + compraDoArthur.getTotal());
	}
}
