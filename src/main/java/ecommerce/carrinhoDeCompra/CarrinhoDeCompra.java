package ecommerce.carrinhoDeCompra;

import java.util.LinkedList;
import java.util.List;

import ecommerce.cliente.Cliente;
import ecommerce.produto.Produto;

public class CarrinhoDeCompra {
	// Atributo que representa a associação ([1] -cliente)
	// existente entre CarrinhoDeCompra e Cliente
	private Cliente cliente;

	private List<Produto> itens = new LinkedList<>();

	public CarrinhoDeCompra(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void adicionarItem(Produto produto) {
		this.itens.add(produto);
	}

	public double getTotal() {
		double total = 0.00;
		for (int i = 0; i < itens.size(); i++) {
			total = total + itens.get(i).getPreçoDeVenda().getValor();
		}
		return total;
	}

}
