package atividade06;

import javax.swing.JOptionPane;

public class EntreValores {

	public static void main(String[] args) {

		// Informando os dois n�meros
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero:"));
		
		// Apresentados os n�meros 
		while (numero1 < numero2) { 
			System.out.println(numero1++);
		} 
		
		while(numero1 >= numero2) {
			System.out.println(numero1--);
		}
	}

}
