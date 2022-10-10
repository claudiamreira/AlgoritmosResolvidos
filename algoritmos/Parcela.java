package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Parcela {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		float valor;
		double parc, juros, total;
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
				juros = (valor * 0.06);
				total = valor + juros;
				parc = total / 6;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 7:
				juros = (valor * 0.07);
				total = valor + juros;
				parc = total / 7;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 8:
				juros = (valor * 0.08);
				total = valor + juros;
				parc = total / 8;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 9:
				juros = (valor * 0.09);
				total = valor + juros;
				parc = total / 9;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			case 10:
				juros = (valor * 0.10);
				total = valor + juros;
				parc = total / 10;
				System.out.println("Você pagará R$" + df.format(parc) + " parcelado em " + parcelas
						+ "x com acréscimo de juros!");
				break;
			default:
				System.out.println("Quantidade de parcelas não permitida!");
				
		}
	}

}
