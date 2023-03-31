package br.com.fiap.padaria.model;

public class Delivery {

	int id;
	
	Carrinho carrinho;
	
	Cliente cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public void aplicarCupom() {
		
		carrinho.total = carrinho.total * cliente.cupom;
	}
	
}
