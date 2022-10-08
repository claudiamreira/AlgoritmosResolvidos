package algoritmos;

import java.util.Scanner;

public class RepeticaoNota {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = null;
		int n1 = 0, n2 = 0, media, aluno = 0;
		
		while(aluno <= 3) {
			System.out.println("Digite o nome do aluno: ");
			nome = sc.next();
			System.out.println("Informe a primera nota: ");
			n1 = sc.nextInt();
			System.out.println("Informe a outra nota: ");
			n2 = sc.nextInt();
			
			media = (n1 + n2) / 2;
			System.out.println("Aluno: " + nome + " média: " + media);
			aluno++;
		}
		
		
		
		
	}

}
