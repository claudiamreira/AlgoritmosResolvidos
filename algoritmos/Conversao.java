package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.###");
		
		double valorDolar, conversaoReais;
		
		System.out.println("Digite o valor em dólar ($): ");
		valorDolar = scan.nextDouble();
		
		conversaoReais = valorDolar * 5.17d;
		
		System.out.println("O valor $" + valorDolar + " convertido para reais é: R$" + df.format(conversaoReais));
		
		
	}

}
