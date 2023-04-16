package br.com.fiap.padaria.model;

public class Cliente {

	private int id;
	
	private double cupom;
	
	private String cpf, nome;

	
	//getter and setters
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCupom() {
		return cupom;
	}

	public void setCupom(double cupom) {
		this.cupom = cupom;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodos
	
	public void darCupom(double valor) {
		
		cupom = 1 - (valor / 100);
	}
}
