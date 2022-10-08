package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int R;
		double PI = 3.14159d, VOLUME;
		
		System.out.println("Informe o valor do raio: ");
		R = sc.nextInt();
		
		VOLUME = (4 / 3.0) * PI * Math.pow(R, 3);
		System.out.println("VOLUME = " + df.format(VOLUME));
	}
}
