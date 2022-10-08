package algoritmos;

import java.util.Scanner;

public class Parcela {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int preco = 0;
		int parcelas;
		
		System.out.println("Informe o valor do produto: ");
		preco = sc.nextInt();
		
		for(int cont = 1; cont <= 5; cont++) {
			parcelas = preco / cont;
			System.out.println("Sua compra parcelada em até 5x (sem juros): " + parcelas + "\n");
		}
	}

}
