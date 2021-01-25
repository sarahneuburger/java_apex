package atividade03;

import javax.swing.JOptionPane;

public class Imc {
	
	public static void main(String[] args) {
		
		// Informando peso e altura
		Double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Informa sua altura:"));
		
		// Cálculo do IMC
		Double imc = peso / Math.pow(altura, 2);
				
		// Informando a situação
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc < 25) {
			System.out.println("Você está com o peso normal.");
		} else if (imc < 30) {
			System.out.println(("Você está acima do peso."));
		} else if (imc >= 30) {
			System.out.println("Você está com obesidade.");
		}
			
	}

}
