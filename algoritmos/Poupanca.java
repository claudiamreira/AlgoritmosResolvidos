package algoritmos;

import java.util.Scanner;

public class Poupanca {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		float deposito;
		double rend, rendMes;
		
		System.out.println("Informe o valor depositado na poupança: ");
		deposito = sc.nextFloat();
		
		rend = deposito * 0.005;
		rendMes = deposito + rend;
		
		System.out.println("O rendimento mensal é de: " + rendMes);
	}
}
