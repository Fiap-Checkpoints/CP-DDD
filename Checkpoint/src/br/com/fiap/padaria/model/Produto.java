package br.com.fiap.padaria.model;
import java.util.ArrayList;

public class Produto {

	
	int id;
	
	String nome;
	
	ArrayList<Double> precoCusto = new ArrayList<Double>();
	
	ArrayList<Double> precoVenda = new ArrayList<Double>();
	
	ArrayList<Integer> quantidade = new ArrayList<Integer>();
	
	
	
	//getter and setters

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

	public ArrayList<Double> getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(ArrayList<Double> precoCusto) {
		this.precoCusto = precoCusto;
	}

	public ArrayList<Double> getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(ArrayList<Double> precoVenda) {
		this.precoVenda = precoVenda;
	}

	public ArrayList<Integer> getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(ArrayList<Integer> quantidade) {
		this.quantidade = quantidade;
	}

	
	
	//Metodos
	public double calcularLucro(int posicao) {
		double lucro;
		
		lucro = precoVenda.get(posicao) - precoCusto.get(posicao);
		
		return lucro;	
	}
	
}
