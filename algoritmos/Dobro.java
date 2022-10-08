package algoritmos;

import java.util.Scanner;

public class Dobro {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero, dobro, tercaParte;
		
		System.out.println("Informe um número: ");
		numero = scan.nextDouble();
		
		dobro = numero * 2;
		tercaParte = numero / 3;
		
		System.out.println("O dobro de " + numero + " é: " + dobro);
		System.out.println("A terça parte de " + numero + " é: " + tercaParte);
	}

}
