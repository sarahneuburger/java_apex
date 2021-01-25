package exemplo09;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {
	
		// Vetor de cidades // No Java é obrigado a inserir o tamanho do vetor
		String[] cidades = new String[3];
		
		// Adicionando valores
		for(int indice = 0; indice<cidades.length; indice++) {
			cidades[indice] = JOptionPane.showInputDialog((indice+1)+"ª cidade.");
		}
	}

}
