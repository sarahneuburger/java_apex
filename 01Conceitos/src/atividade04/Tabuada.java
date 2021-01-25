package atividade04;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {

		// Pedindo o valor da tabuada
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº que deseja saber a tabuada:"));

		// Cálculo da tabuada e apresentação na tela
		int indice = 1;
		
		while (indice < 11) {
		System.out.println(valor * indice);  
		indice++;
		}	
		
	}

}
