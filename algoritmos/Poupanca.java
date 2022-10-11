package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Poupanca {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		float deposito;
		double rendTotal, rendMes;
		
		System.out.println("Informe o valor depositado na poupança: ");
		deposito = sc.nextFloat();
		
		rendTotal = deposito * 1.007;
		rendMes = rendTotal - deposito;
		
		System.out.println("O rendimento total é de R$" + df.format(rendTotal));
		System.out.println("O rendimento mensal com 7% fixo é de R$" + df.format(rendMes));
	}
}
