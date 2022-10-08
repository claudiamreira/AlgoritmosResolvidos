package triangulo;

public class Triangulo {

	private int lado1, lado2, lado3;
	
	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public void validacao(){
		if((this.getLado1() > this.getLado2() + this.getLado3()) || (this.getLado2() 
				> this.getLado1() + this.getLado3()) || (this.getLado3() > this.getLado1() 
				+ this.getLado2())){
			System.out.println("Não é um triângulo!");
		} else {
			System.out.println("É um triângulo!");
		}
	}
	
	public void tipoTriangulo() {
		if((this.getLado1() == this.getLado2()) && (this.getLado2() == this.getLado3())){
			System.out.println("Triângulo equilátero");
		} else if ((this.getLado1() == this.getLado2()) || (this.getLado2() == this.getLado3()) 
				|| (this.getLado1() == this.getLado3())) {
			System.out.println("Triângulo isósceles");
		} else {
			System.out.println("Triângulo escaleno");
		}
	}

	@Override
	public String toString() {
		return "Triangulo [lado1: " + lado1 + ", lado2: " + lado2 + ", lado3: " + lado3 + "]";
	}
	
}
