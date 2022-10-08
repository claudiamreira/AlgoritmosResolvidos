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
		
		System.out.println("Informe o nome do vendedor: ");
		nome = scan.next();
		
		System.out.println("Informe o seu salário fixo mensal: ");
		salarioFixo = scan.nextFloat();
		
		System.out.println("Informe a quantidade de vendas realizada no mês: ");
		qtdVendas = scan.nextInt();
		
		comissao = (qtdVendas * 0.15);
		salarioComis = salarioFixo + comissao;
		
		System.out.println("O nome do vendedor é: " + nome +
				" seu salário mensal é de: " + salarioFixo +
				" a quantidade de vendas realizada no mês é de: " + qtdVendas +
				" sua comissão é de: " + comissao +
				" o valor total a ser recebido é de: " + salarioComis);
	}

}
