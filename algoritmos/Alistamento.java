package algoritmos;

import java.util.Scanner;

public class Alistamento {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe quantos anos você tem: ");
		idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("Você ainda não precisa votar!");
		} else {
			System.out.println("Você deve votar!");
		}
	}

}
