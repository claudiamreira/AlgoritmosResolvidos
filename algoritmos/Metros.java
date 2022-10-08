package algoritmos;

import java.util.Scanner;

public class Metros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double metros, km, hm, dam,dm, cm, mm;
		
		System.out.println("Informe a distância em metros: ");
		metros = sc.nextDouble();
		
		km = metros / 1000;
		hm = metros / 100;
		dam = metros / 10;
		dm = metros * 10;
		cm = metros * 100;
		mm = metros * 1000;
		
		System.out.println("A distância de " + metros + " metros é: " + km + " km");
		System.out.println("A distância de " + metros + " metros é: " + hm + " hm");
		System.out.println("A distância de " + metros + " metros é: " + dam + " dam");
		System.out.println("A distância de " + metros + " metros é: " + dm + " dm");
		System.out.println("A distância de " + metros + " metros é: " + cm + " cm");
		System.out.println("A distância de " + metros + " metros é: " + mm + " mm");
	}
}
