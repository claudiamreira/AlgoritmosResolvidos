package algoritmos;

import java.util.Scanner;

public class Numero {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número de 0 a 10: ");
		numero = sc.nextInt();
		
		if(numero > 10) {
			System.out.println("Erro! Informe um número válido.");
		} else {
			System.out.println("O número informado é: " + numero );
		}
	}

}
