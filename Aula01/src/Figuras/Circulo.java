package Figuras;

public class Circulo extends FiguraGeometrica implements IFiguraGeometrica {
	
	
	private double pi = 3.14;
	private double raio;
	
	// Sobrescrita dos métodos da interface
	@Override
	public String getNomeFigura() {
		return "Círculo";
	}

	@Override
	public int getArea() {
		double area = 0;
		area = pi * (raio * raio);
		return (int)area;
	}

	@Override
	public int getPerimetro() {
		double perimetro = 0;
		perimetro = 2 * pi * raio;
		return (int)perimetro;
	}

	
	// Set e get
	public double getPI() {
		return pi;
	}

	public void setPI(double pi) {
		pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
