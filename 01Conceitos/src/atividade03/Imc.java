package atividade03;

import javax.swing.JOptionPane;

public class Imc {
	
	public static void main(String[] args) {
		
		// Informando peso e altura
		Double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Informa sua altura:"));
		
		// C�lculo do IMC
		Double imc = peso / Math.pow(altura, 2);
				
		// Informando a situa��o
		if (imc < 18.5) {
			System.out.println("Voc� est� abaixo do peso.");
		} else if (imc < 25) {
			System.out.println("Voc� est� com o peso normal.");
		} else if (imc < 30) {
			System.out.println(("Voc� est� acima do peso."));
		} else if (imc >= 30) {
			System.out.println("Voc� est� com obesidade.");
		}
			
	}

}
