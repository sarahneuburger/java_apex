package exemplo05;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		
		// Tentativa - para verificar se o usuário está respondendo corretamente
		try {

		// Armazenar a idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		
		// Condicional
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "A pessoa é maior de idade.");			
		} else {
			JOptionPane.showMessageDialog(null, "A pessoa é menor de idade.");
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
		 == Igual (verifica apenas o conteúdo)
		 === Igual (verifica tipo e conteúdo)
		 != Diferente		 
		 */
		
	}

}
