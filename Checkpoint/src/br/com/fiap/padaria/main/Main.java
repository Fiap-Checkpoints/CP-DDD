package br.com.fiap.padaria.main;
import br.com.fiap.padaria.model.*;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// Declarações
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Delivery delivery = new Delivery();
		Produto produto = new Produto();
		Carrinho carrinho = new Carrinho();
		
		// Criando Scanner
		Scanner leitor = new Scanner(System.in);
		
		// Criando o random
		Random rand = new Random();
		
		
		// Condições para criação ou uso default
		String r;
		System.out.println("Caso queira cadastrar um cliente (digite 's'), caso queira usar padrão (digite 'n')");
		r = leitor.next().toLowerCase();
		
		while (!r.equals("s") && !r.equals("n")) {
			System.out.println("Utilize apenas ('s' ou 'n') ");
			r = leitor.next();
		}
		
		// colocando dados do Cliente
		String cpf = "", nomeC = "";
		int idC = rand.nextInt(10000);
		if (r.equals("s")) {
			System.out.println("Digite o nome do Cliente");
			nomeC = leitor.next();
			System.out.println("Digite o cpf do Cliente");
			cpf = leitor.next();
		} else if (r.equals("n")) {
			nomeC = "João Dubas";
			cpf = "394.984.458-47";
		}
		String ok = "s";
		
		while (ok.equals("s")) {
			System.out.println("|---------------------");
			System.out.println("| Id: " + idC);
			System.out.println("| Nome: " + nomeC);
			System.out.println("| CPF: " + cpf);
			System.out.println("|---------------------");
			
			// Confirmação do cliente
			System.out.println("Quer fazer alguma alterção? (use 's' ou 'n')");
			ok = leitor.next().toLowerCase();
			
			while (!ok.equals("s") && !ok.equals("n")) {
				System.out.println("Utilize apenas ('s' ou 'n') ");
				ok = leitor.next();
			}
			if (ok.equals("s")) {
				System.out.println("Digite o nome do Cliente");
				nomeC = leitor.next();
				System.out.println("Digite o cpf do Cliente");
				cpf = leitor.next();
			}
		}
		
		cliente.setId(idC);
		cliente.setCpf(cpf);
		cliente.setNome(nomeC);
		
		System.out.println("Quer dar um cupom para o cliente? (use 's' ou 'n'");
		r = leitor.next().toLowerCase();
		
		while (!r.equals("s") && !r.equals("n")) {
			System.out.println("Utilize apenas ('s' ou 'n') ");
			r = leitor.next();
		}
		
		double cupom;
		if (r.equals("s")) {
			System.out.println("Digite o valor em % do cupom (use um valor double)");
			cupom = leitor.nextDouble();
			cliente.darCupom(cupom);
		}
		
		
		
	}

}
