package br.com.fiap.padaria.model;

public class Carrinho {

	private int id, quantidade;
	
	private double total;
	
	private String items = "";
	
	
	//getter and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
	
	
	//Metodos
	
	public void adicionarItem(String nome, double valor) {
		
		items = items + nome + " , ";
		
		total = total + valor;
		
		quantidade += 1;

	}
	
}
