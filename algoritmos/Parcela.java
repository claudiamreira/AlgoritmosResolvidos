package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Parcela {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		float valor;
		double parc, juros;
		int parcelas;
		
		
		System.out.println("Digite o valor da compra: ");
		valor = sc.nextFloat();
		
		System.out.println("Digite a quantidade de parcelas: ");
		parcelas = sc.nextInt();
		
		
		switch(parcelas) {
			case 1:
				System.out.println("Você pagará R$" + valor + " á vista!");
				break;
			case 2:
				parc = valor / 2;
				System.out.println("Você pagará R$" + parc + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 3:
				parc = valor / 3;
				System.out.println("Você pagará R$" + parc + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 4:
				parc = valor / 4;
				System.out.println("Você pagará R$" + parc + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 5:
				parc = valor /5;
				System.out.println("Você pagará R$" + parc + " parcelado em " + parcelas 
						+ "x sem juros");
				break;
			case 6:
				juros = (valor * 1.06);
				parc = juros / 6;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 7:
				juros = (valor * 1.07);
				parc = juros / 7;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 8:
				juros = (valor * 1.08);
				parc = juros / 8;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 9:
				juros = (valor * 1.09);
				parc = juros / 9;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 10:
				juros = (valor * 1.10);
				parc = juros / 10;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			default:
				System.out.println("Quantidade de parcelas não permitida!");
				
		}
		
	}
}
