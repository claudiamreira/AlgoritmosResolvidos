package algoritmos;

import java.util.Scanner;

public class SucessAntec {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, sucessor, antecessor;
		
		System.out.println("Informe um número inteiro: ");
		numero = sc.nextInt();
		
		sucessor = numero + 1;
		antecessor = numero - 1;
		
		System.out.println("O sucessor de " + numero + " é: " + sucessor);
		System.out.println("O antecessor de " + numero + " é: " + antecessor);
	}
}
