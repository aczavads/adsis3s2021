package ecommerce.produto;

import ecommerce.valueObjects.Nome;
import ecommerce.valueObjects.PreçoDeVenda;

public class Produto {
	private Nome nome;
	private PreçoDeVenda preçoDeVenda;
	
	public Produto(Nome nome, PreçoDeVenda preçoDeVenda) {
		setNome(nome);
		setPreçoDeVenda(preçoDeVenda);
	}
	
	public Nome getNome() {
		return nome;
	}
	
	public PreçoDeVenda getPreçoDeVenda() {
		return preçoDeVenda;
	}
	
	public void setNome(Nome novoNome) {
		this.nome = novoNome;
	}
	
	public void setPreçoDeVenda(PreçoDeVenda novoPreçoDeVenda) {
		this.preçoDeVenda = novoPreçoDeVenda;
	}
}
