package algoritmos;

import java.util.Scanner;

public class Saque {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		int agenciaConta, senha;
		double valorSaque;
		float saldo = 750;
		
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		
		System.out.println("Informe o número da agência e conta: ");
		agenciaConta = sc.nextInt();
		
		System.out.println("Informe o valor do saque: ");
		valorSaque = sc.nextDouble();
		
		if(saldo > valorSaque) {
			System.out.println("Informe a senha de 4 dígitos: ");
			senha = sc.nextInt();
			System.out.println("Saque Aprovado!");
		} else 
			System.out.println("Saque Recusado! Saldo insulficiente.");
		}
	}

