package algoritmos;

import java.util.Scanner;

public class Parcela {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float valor, juros, total;
		int parcelas;
		
		
		System.out.println("Digite o valor da compra: ");
		valor = sc.nextFloat();
		
		System.out.println("Digite a quantidade de parcelas: ");
		parcelas = sc.nextInt();
		
		juros = valor * 0.10f;
		total = valor + juros;
		
		switch(parcelas) {
			case 1:
				System.out.println("Você pagará R$" + valor + " á vista!");
				break;
			case 2:
				System.out.println("Você pagará R$" + valor + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 3:
				System.out.println("Você pagará R$" + valor + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 4:
				System.out.println("Você pagará R$" + valor + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 5:
				System.out.println("Você pagará R$" + valor + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 6:
				System.out.println("Você pagará R$" + total + " parcelado em " + parcelas
						+ "x com 10% de juros!");
				break;
			default:
				System.out.println("Quantidade de parcelas não permitido!");
				
		}
	}

}
