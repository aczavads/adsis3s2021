package ecommerce.cliente;

import ecommerce.valueObjects.CPF;
import ecommerce.valueObjects.Nome;

public class Cliente {
	private Nome nome;
	private CPF cpf;
	
	public Cliente(Nome nome, CPF cpf) {
		//this.nome = nome;
		//this.cpf = cpf;
		setNome(nome);
		setCpf(cpf);
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
	public Nome getNome() {
		return nome;
	}
	public CPF getCpf() {
		return cpf;
	}

}
