package Figuras;

public class Triangulo extends FiguraGeometrica implements IFiguraGeometrica{
	
	// Formas diferentes que utilizam os mesmos métodos da interface, porém, com suas próprias regras

	private int ladoA;
	private int ladoB;
	private int ladoC;
	private int base;
	private int altura;
	
	@Override
	public String getNomeFigura() {
		return "Triângulo";
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public int getArea() {
		int area = 0;
		area = base * altura / 2;
		return area;
	}

	@Override
	public int getPerimetro() {
		int perimetro = 0;
		perimetro = ladoA + ladoB + ladoC;
		return perimetro;
	}

}
