package triangulo;

public class Main {

	public static void main(String[] args) {
		
		Triangulo tg = new Triangulo();
		tg.setLado1(10);
		tg.setLado2(15);
		tg.setLado3(25);
		tg.validacao();
		tg.tipoTriangulo();
		
		Triangulo tg2 = new Triangulo();
		tg2.setLado1(35);
		tg2.setLado2(35);
		tg2.setLado3(35);
		tg2.validacao();
		tg2.tipoTriangulo();
		
		Triangulo tg3 = new Triangulo();
		tg3.setLado1(22);
		tg3.setLado2(22);
		tg.setLado3(15);
		tg.validacao();
		tg.tipoTriangulo();
	}
}
