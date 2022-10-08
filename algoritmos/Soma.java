package algoritmos;

import java.util.Scanner;

public class Soma {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Informe um número: ");
		a = scan.nextInt();
		System.out.println("Informe outro número: ");
		b = scan.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma é: " + soma);		
		
	}

}
