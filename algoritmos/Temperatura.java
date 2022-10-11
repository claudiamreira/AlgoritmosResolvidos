package algoritmos;

import java.util.Scanner;

public class Temperatura {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float F, C;
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		C = scan.nextFloat();
		
		F = (9 * C + 160) / 5;
		
		System.out.println(C + "ºC convertido para Fahrenheit é: " + F);
	}

}
