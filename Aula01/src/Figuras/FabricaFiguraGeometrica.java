package Figuras;

import javax.swing.JOptionPane;

public class FabricaFiguraGeometrica {

	public static void main(String[] args) {
		// Criando um quadrado
		
		int figura = Integer.parseInt(JOptionPane.showInputDialog("Informe a figura que deseja calcular: \n 1 - Quadrado \n 2 - Triângulo \n 3 - Círculo"));

		switch (figura) {
		
		case 1:
			Quadrado q = new Quadrado();
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do lado do quadrado:"));
			q.setLado(lado);		
			JOptionPane.showMessageDialog(null, q.dadosFigura(q));
			break;
			
		case 2:
			Triangulo t = new Triangulo();
			int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do lado A do triângulo:"));
			int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do lado B do triângulo:"));
			int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do lado C do triângulo:"));
			int base = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da base do triângulo:"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da altura do triângulo:"));
			t.setLadoA(ladoA);
			t.setLadoB(ladoB);
			t.setLadoC(ladoC);
			t.setBase(base);
			t.setAltura(altura);
			JOptionPane.showMessageDialog(null, t.dadosFigura(t));
			break;
			
		case 3:
			Circulo c = new Circulo();
			int raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio do círculo:"));
			c.setRaio(raio);
			JOptionPane.showMessageDialog(null, c.dadosFigura(c));
			break;
			
			
			
		}
		
		
	}

}
