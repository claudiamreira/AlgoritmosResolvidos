package algoritmos;

import java.util.Scanner;

public class EstadoCivil {

	@SuppressWarnings("resource")

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int EstadoCivil;
	
	System.out.println("Digite o estado cívil (1 - solteiro, 2 - casado, 3 - outros)");
	EstadoCivil = scan.nextInt();
	
	if(EstadoCivil == 1) {
		System.out.println("Solteiro!");
	} else {
		if(EstadoCivil == 2) {
			System.out.println("Casado!");
		} else {
			if(EstadoCivil == 3) {
				System.out.println("Outros");
			} else {
				System.out.println("Opção Inválida!");
			}
		}
	}
	
	}
		
}