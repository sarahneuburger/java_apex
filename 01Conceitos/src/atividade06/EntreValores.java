package atividade06;

import javax.swing.JOptionPane;

public class EntreValores {

	public static void main(String[] args) {

		// Informando os dois números
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:"));
		
		// Apresentados os números 
		while (numero1 < numero2) { 
			System.out.println(numero1++);
		} 
		
		while(numero1 >= numero2) {
			System.out.println(numero1--);
		}
	}

}
