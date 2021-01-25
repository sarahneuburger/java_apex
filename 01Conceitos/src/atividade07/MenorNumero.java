package atividade07;

import javax.swing.JOptionPane;

public class MenorNumero {

	public static void main(String[] args) {
		
		// Pedindo os sete números
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número:"));
		int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número:"));
		int numero5 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quinto número:"));
		int numero6 = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexto número:"));
		int numero7 = Integer.parseInt(JOptionPane.showInputDialog("Informe o sétimo número:"));

		int menorNumero = numero1;
		
		if (menorNumero > numero2) {
			menorNumero = numero2;
		} 
		
		if (menorNumero > numero3) {
			menorNumero = numero3;
		} 
		
		if (menorNumero > numero4) {
			menorNumero = numero4; 
		} 
		
		if (menorNumero > numero5) {
			menorNumero = numero5;
		} 
		
		if (menorNumero > numero6) {
			menorNumero = numero6;
		} 
		
		if (menorNumero > numero7) {
			menorNumero = numero7;
		}
		
		System.out.println("O menor número digitado é " + menorNumero + ".");
	}		
}
