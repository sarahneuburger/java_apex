package atividade07;

import javax.swing.JOptionPane;

public class MenorNumero {

	public static void main(String[] args) {
		
		// Pedindo os sete n�meros
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro n�mero:"));
		int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto n�mero:"));
		int numero5 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quinto n�mero:"));
		int numero6 = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexto n�mero:"));
		int numero7 = Integer.parseInt(JOptionPane.showInputDialog("Informe o s�timo n�mero:"));

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
		
		System.out.println("O menor n�mero digitado � " + menorNumero + ".");
	}		
}
