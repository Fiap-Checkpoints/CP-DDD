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
		
// ------------------------------------------------------------------------------

		// Condições para criação ou uso default
		String r;
		System.out.println("Caso queira cadastrar um cliente (digite 's'), caso queira usar padrão (digite 'n')");
		r = leitor.next().toLowerCase();
		
		while (!r.equals("s") && !r.equals("n")) {
			System.out.println("Utilize apenas ('s' ou 'n') ");
			r = leitor.next();
		}
// ------------------------------------------------------------------------------
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

// ------------------------------------------------------------------------------
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

// ------------------------------------------------------------------------------
		// Usando os setters
		cliente.setId(idC);
		cliente.setCpf(cpf);
		cliente.setNome(nomeC);
		

		
// ------------------------------------------------------------------------------
		// Usando o metodo darCupom
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
		
// ------------------------------------------------------------------------------
//--------------------------Funcionario------------------------------------------
		// Condições para criação ou uso default
		System.out.println("Caso queira cadastrar um funcionario (digite 's'), caso queira usar padrão (digite 'n')");
		r = leitor.next().toLowerCase();
		
		while (!r.equals("s") && !r.equals("n")) {
			System.out.println("Utilize apenas ('s' ou 'n') ");
			r = leitor.next();
		}
		
		int idF = rand.nextInt(10000);
		String nomeF = "", cargo = "";
		double salario = 0;
		
		if (r.equals("s")) {
			System.out.println("Digite o nome do Funcionario");
			nomeF = leitor.next();
			System.out.println("Digite o cargo do Funcionario");
			cargo = leitor.next();
			System.out.println("Digite o salario do Funcionario");
			salario = leitor.nextDouble();
		} else if (r.equals("n")) {
			nomeF = "Pedro Henrique";
			cargo = "Gerente";
			salario = 9500;
		}
		
		
		
		ok = "s";
		
		while (ok.equals("s")) {
			System.out.println("|---------------------");
			System.out.println("| Id: " + idF);
			System.out.println("| Nome: " + nomeF);
			System.out.println("| Cargo: " + cargo);
			System.out.println("| Salario: " + salario);
			System.out.println("|---------------------");

// ------------------------------------------------------------------------------
			// Confirmação do Funcionario
			System.out.println("Quer fazer alguma alterção? (use 's' ou 'n')");
			ok = leitor.next().toLowerCase();
			
			while (!ok.equals("s") && !ok.equals("n")) {
				System.out.println("Utilize apenas ('s' ou 'n') ");
				ok = leitor.next();
			}
			if (ok.equals("s")) {
				System.out.println("Digite o nome do Funcionario");
				nomeF = leitor.next();
				System.out.println("Digite o cargo do Funcionario");
				cargo = leitor.next();
				System.out.println("Digite o salario do Funcionario");
				salario = leitor.nextDouble();
			}
		}
		
		
// ------------------------------------------------------------------------------
		// Usando o metodo aumento
		System.out.println("Quer dar um cupom para o cliente? (use 's' ou 'n'");
		r = leitor.next().toLowerCase();
				
		while (!r.equals("s") && !r.equals("n")) {
			System.out.println("Utilize apenas ('s' ou 'n') ");
			r = leitor.next();
		}
				
		double aumento;
		if (r.equals("s")) {
			System.out.println("Digite o valor em % do aumento salarial (use um valor double)");
			aumento = leitor.nextDouble();
			funcionario.aumento(aumento);
		}
						
		
		
		
		
	}

}
