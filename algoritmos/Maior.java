package algoritmos;

import java.util.Scanner;

public class Maior {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe um número inteiro: ");
		num1 = sc.nextInt();
		
		System.out.println("Informe outro número inteiro: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro valor é o maior!");
		} if (num1 < num2) {
			System.out.println("O segundo valor é o maior!");
		} else {
			System.out.println("Não existe valor maior, os dois são iguais!");
		}
	}
}
