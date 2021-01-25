package Figuras;

public class FiguraGeometrica {
	
	// Pra ser herdado em triangulo e quadrado
	
	public String dadosFigura(IFiguraGeometrica figura) {
		String relatorio = "";
		relatorio += "Nome: " + figura.getNomeFigura();
		relatorio += "\n¡rea: " + figura.getArea();
		relatorio += "\nPerimetro: " + figura.getPerimetro();
		return relatorio;
	}

}
