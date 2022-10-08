package algoritmos;

import java.util.Scanner;

public class Imc {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Informe o seu peso: ");
		peso = sc.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		altura = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5d ) {
			System.out.println("Abaixo do peso!");
		} else if (imc >= 18.5d && imc <= 24.9d) {
			System.out.println("Peso normal!");
		} else if (imc >= 25 && imc <= 29.9d) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9d) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 35 && imc <= 39.9d) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III ou mórbida");
		}
	}

}
