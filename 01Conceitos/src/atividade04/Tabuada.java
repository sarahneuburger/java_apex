package atividade04;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {

		// Pedindo o valor da tabuada
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o n� que deseja saber a tabuada:"));

		// C�lculo da tabuada e apresenta��o na tela
		int indice = 1;
		
		while (indice < 11) {
		System.out.println(valor * indice);  
		indice++;
		}	
		
	}

}
