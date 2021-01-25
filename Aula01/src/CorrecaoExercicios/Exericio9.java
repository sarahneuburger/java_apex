package CorrecaoExercicios;

import javax.swing.JOptionPane;

public class Exericio9 {

	public static void main(String[] args) {
		// Identificar palíndromo
		
		String fraseOriginal = JOptionPane.showInputDialog("Informe uma palavra para verificação:");
		
		fraseOriginal = fraseOriginal.replaceAll(" ", "");
		
		String[] palindromo = fraseOriginal.split("");
		
		String contrario = "";
		
		
		
			for (int j = (palindromo.length - 1); j >= 0; j--) {
				contrario = contrario + palindromo[j];
			}
		
			
		if(contrario.equalsIgnoreCase(fraseOriginal)) {
			JOptionPane.showMessageDialog(null, "A palavra é um palíndromo.");
		} else {JOptionPane.showMessageDialog(null, "A palavra não é um palíndromo.");}
			
		}
		
	}


