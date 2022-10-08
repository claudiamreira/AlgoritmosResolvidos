package algoritmos;

import java.util.Scanner;
import java.text.*;

public class Cotacao {
	
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double valorReal, cotacaoDolar, conversao;
		
		System.out.println("Digite o valor disponível em reais: ");
		valorReal = sc.nextFloat();
		
		System.out.println("Digite o valor da cotação do dólar do dia: ");
		cotacaoDolar = sc.nextFloat();
		
		conversao = valorReal / cotacaoDolar;
		
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("O valor R$" + valorReal + " convertido em dólar é: $" + df.format (conversao));
	}

}
