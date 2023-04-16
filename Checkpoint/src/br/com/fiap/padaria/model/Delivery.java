package br.com.fiap.padaria.model;

public class Delivery {

	private int id;
	
	private Carrinho carrinho;
	
	private Cliente cliente;

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
		
		carrinho.setTotal(carrinho.getTotal() * cliente.getCupom());
	}
	
}
