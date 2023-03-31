package br.com.fiap.padaria.model;

public class Produto {

	
	int id, quantidade;
	
	String nome;
	
	double precoCusto, precoVenda;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
	//Metodos
	
	public double calcularLucro() {
		double lucro;
		
		lucro = precoVenda - precoCusto;
		
		return lucro;	
	}
	
}
