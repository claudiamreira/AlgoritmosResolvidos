package algoritmos;

import java.util.Scanner;

public class Media2 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		} else if (media <= 5){
			System.out.println("Reprovado!");
		}
		else {
			System.out.println("Recuperação!");
		}
		
	}

}
