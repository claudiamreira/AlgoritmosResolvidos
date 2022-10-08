package algoritmos;

import java.util.Scanner;

public class Media {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		float nota1, nota2, nota3, media;
		
		System.out.println("Informe o nome do aluno: ");
		nome = scan.next();
		
		System.out.println("Informe a primeira nota: ");
		nota1 = scan.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = scan.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média do(a) " + nome + " é: " + media);
	}
}
