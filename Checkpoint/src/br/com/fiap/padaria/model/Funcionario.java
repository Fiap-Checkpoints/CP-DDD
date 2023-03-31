package br.com.fiap.padaria.model;

public class Funcionario {

	int id;
	
	String nome, cargo;
	
	double salario;
	
	//getter and setters:
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	//Metodos:
	
	public void aumento(double aumento) {
		
		salario = salario * (1 + (aumento / 100));
		
	}




}
