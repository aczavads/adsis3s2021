package ecommerce.produto;

import ecommerce.valueObjects.Nome;

public class Produto {
	private Nome nome;
	private double preçoDeVenda;
	
	public Produto(Nome nome, double preçoDeVenda) {
		setNome(nome);
		setPreçoDeVenda(preçoDeVenda);
	}
	
	public Nome getNome() {
		return nome;
	}
	
	public double getPreçoDeVenda() {
		return preçoDeVenda;
	}
	
	public void setNome(Nome novoNome) {
		this.nome = novoNome;
	}
	
	public void setPreçoDeVenda(double novoPreçoDeVenda) {
		this.preçoDeVenda = novoPreçoDeVenda;
	}
	

}
