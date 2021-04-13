package ecommerce;

import ecommerce.produto.Produto;
import ecommerce.valueObjects.Nome;
import ecommerce.valueObjects.PreçoDeVenda;

public class AppECommerce {
	
	public static void main(String[] args) {
		Produto teste = new Produto(
				new Nome("Produto Teste 5kg"), 
				new PreçoDeVenda(-100.75));
		
		System.out.println(teste.getNome().getValor() + "  " + teste.getPreçoDeVenda().getValor());

	}
	
}
