package algoritmos;

import java.util.Scanner;

public class Comissao {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		float salarioFixo;
		double salarioComis, comissao;
		int qtdVendas;
		
		System.out.println("Informe o nome do(a) vendedor(a): ");
		nome = scan.next();
		
		System.out.println("Informe o seu salário fixo mensal: ");
		salarioFixo = scan.nextFloat();
		
		System.out.println("Informe a quantidade de vendas realizada no mês: ");
		qtdVendas = scan.nextInt();
		
		comissao = qtdVendas * 1.15;
		salarioComis = comissao + salarioFixo;
		
		System.out.println("O nome do(a) vendedor(a) é: " + nome);
		System.out.println("Seu salário é de R$" + salarioFixo);
		System.out.println("A quantidade de vendas realizada no mês é de: " + qtdVendas);
		System.out.println("Sua comissão é de R$" + comissao);
		System.out.println("O valor total a ser recebido é de R$" + salarioComis);
	}

}
