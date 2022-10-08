package algoritmos;

import java.util.Scanner;

public class Calc {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float a, b, soma, subtracao, multiplicacao, divisao;
		
		System.out.println("Informe um número: ");
		a = scan.nextFloat();
		
		System.out.println("Informe outro número: ");
		b = scan.nextFloat();
		
		soma = (a + b);
		subtracao = (a - b);
		multiplicacao = (a * b);
		divisao = (a / b);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A multiplicação é: " + multiplicacao);
		System.out.println("A divisão é: " + divisao);
		
	}

}
