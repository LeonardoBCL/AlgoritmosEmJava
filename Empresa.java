package atvddpt;

import java.util.Scanner;


public class Empresa {
	
	

	public static void main(String[] args) {
		//Inicializando o m�todo para virar objeto:
		Produto produto = new Produto();
		Cliente cliente = new Cliente();
		Fornecedor fornecedor = new Fornecedor();
		Funcionario funcionario = new Funcionario();
		
		Scanner keyboard = new Scanner(System.in);
		
		// Informa��o sobre produto:
		System.out.println("\n \t Escreva o nome do produto: ");
		produto.nome = keyboard.next();
		
		System.out.println("\n Informe a quantidade dispon�vel: ");
		produto.quantidade = keyboard.nextInt();
		
		System.out.println("\n Informe o pre�o: ");
		produto.preco = keyboard.nextDouble();
		
		//Cliente:
		System.out.println("\n Insira o login do cliente: ");
		cliente.nome = keyboard.next();
		
		//Comprar:
		System.out.println("\n Deseja comprar algum produto? ");
		String resposta = keyboard.next();
		if(resposta.equals("sim")){
			
			//Solicita quantidade:
			System.out.println("Insira a quantidade de compra: ");
			int compras = keyboard.nextInt();
			if (produto.quantidade > compras) {
			cliente.compra_do_cliente(compras);
			System.out.println("\n O login: " +cliente.nome + ", comprou: " +produto.nome + ", e a quantidade �: " +cliente.qtdcomprada);
			}
			else {
				System.out.print("\n A quantidade de solicita��o de produto ultrapassa o estoque.");
			}
			
		}
		else if(resposta.equals("nao")) {
			System.out.println("\n A quantidade solicitada � maior do que o estoque dispon�vel. ");
		}
		 
		
		System.out.println("\n Fim da sess�o como cliente.");
		//

		
		System.out.println("\n Como fornecedor. Insira o quanto R$ em produto foram vendidos: ");
		fornecedor.preco_vendido = keyboard.nextDouble();
		double lucro = fornecedor.preco_vendido;
		System.out.println("\n O lucro obtido equivale a: " +fornecedor.preco_vendido);
		
		
		System.out.println("\n Fim da sess�o de fornecedor.");
		System.out.println("\n Inicio da sess�o como funcionario.");
		System.out.println("\n Insira o codigo de funcionario: ");
		funcionario.codigo_funcionario = keyboard.nextInt();
		System.out.println("\n Insira o nome do funcionario: ");
		funcionario.nome_funcionario = keyboard.next();
		System.out.println("\n C�digo de funcion�rio: "+funcionario.codigo_funcionario + " Nome: " +funcionario.nome_funcionario);
		
		

	}

}
