package CorrecaoExercicios;

import javax.swing.JOptionPane;

public class Exericio9 {

	public static void main(String[] args) {
		// Identificar pal�ndromo
		
		String fraseOriginal = JOptionPane.showInputDialog("Informe uma palavra para verifica��o:");
		
		fraseOriginal = fraseOriginal.replaceAll(" ", "");
		
		String[] palindromo = fraseOriginal.split("");
		
		String contrario = "";
		
		
		
			for (int j = (palindromo.length - 1); j >= 0; j--) {
				contrario = contrario + palindromo[j];
			}
		
			
		if(contrario.equalsIgnoreCase(fraseOriginal)) {
			JOptionPane.showMessageDialog(null, "A palavra � um pal�ndromo.");
		} else {JOptionPane.showMessageDialog(null, "A palavra n�o � um pal�ndromo.");}
			
		}
		
	}


