package algoritmos;

import java.util.Scanner;

public class ConsumoMedio {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----Consumo médio de um automóvel-----");
		
		float distanciaTotal, combustivelGasto, resul;
		
		System.out.println("Informe a distância total percorrida pelo automóvel (km): ");
		distanciaTotal = scan.nextFloat();
		
		System.out.println("Informe a quantidade de combustível gasto (l): ");
		combustivelGasto = scan.nextFloat();
		
		resul = distanciaTotal / combustivelGasto;
		
		System.out.println("O consumo médio deste automóvel é de: " + resul);
	}

}
