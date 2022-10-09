package algoritmos;

import java.util.Scanner;

public class EstadoCivil {

	@SuppressWarnings("resource")

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int estadoCivil;
	
	System.out.println("Digite o estado cívil (1- Solteiro, 2- Casado, 3- Outros)");
	estadoCivil = scan.nextInt();
	
	switch(estadoCivil) {
			case 1:
				System.out.println("Solteiro!");
				break;
			case 2:
				System.out.println("Casado!");
				break;
			case 3:
				System.out.println("Outros!");
				break;
			default:
				System.out.println("A opção informada é inválida!");
		}
	
	}
		
}
