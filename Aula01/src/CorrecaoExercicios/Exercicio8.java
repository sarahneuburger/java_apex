package CorrecaoExercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		// Contar vogais na frase
		
		String[] frase = JOptionPane.showInputDialog("Informe uma frase:").split("");
		
		int vogais = 0;
		
		for (int i = 0; i < frase.length; i++) {
			if(frase[i].equalsIgnoreCase("a") || 
					frase[i].equalsIgnoreCase("e") ||
					frase[i].equalsIgnoreCase("i") ||
					frase[i].equalsIgnoreCase("o") ||
					frase[i].equalsIgnoreCase("u")) {
				
				vogais++;
			}
		}
			
			System.out.println("A frase contém " + vogais + ".");
		}

	}


