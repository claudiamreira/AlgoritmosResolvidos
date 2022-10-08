package algoritmos;

import java.util.Scanner;

public class Delta {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, delta;
		
		System.out.println("Informe o valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = sc.nextInt();
		
		System.out.println("Informe o valor de C: ");
		C = sc.nextInt();
		
		delta = (B * B) - 4 * A * C;
		
		System.out.println("O valor de Delta é: " + delta);
		
	}
	

}
