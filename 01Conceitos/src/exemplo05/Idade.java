package exemplo05;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		
		// Tentativa - para verificar se o usu�rio est� respondendo corretamente
		try {

		// Armazenar a idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		
		// Condicional
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "A pessoa � maior de idade.");			
		} else {
			JOptionPane.showMessageDialog(null, "A pessoa � menor de idade.");
		}
		
		} catch (Exception erro) {
			
			// Mensagem de erro
			JOptionPane.showMessageDialog(null, "Falha ao obter idade " + erro.getMessage());
			
			
		}

		/* 
		 Operadores relacionais
		 > Maior
		 < Menor
		 >= Maior ou igual
		 <= Menor ou igual
		 == Igual (verifica apenas o conte�do)
		 === Igual (verifica tipo e conte�do)
		 != Diferente		 
		 */
		
	}

}
