package algoritmos;

import java.util.Scanner;

public class Promocao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor, promo, resul;
		String produ;
		
		System.out.println("Informe o nome do produto: ");
		produ = sc.next();
		
		System.out.println("Informe o valor do produto: ");
		valor = sc.nextDouble();
		
		promo = valor * 0.15;
		resul = valor - promo;
		
		System.out.println("O valor do(a): " + produ + " com 15% de desconto é de: " + resul);
	}
}
