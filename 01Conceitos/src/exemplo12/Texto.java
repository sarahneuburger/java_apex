package exemplo12;

import javax.swing.JOptionPane;

public class Texto {

	public static void main(String[] args) {
		
		// Obter dois nomes // string n�o � primitivo, logo a compara��o crua (==) n�o funciona, utilizar equals
		String nome1 = JOptionPane.showInputDialog(null, "1� nome");
		String nome2 = JOptionPane.showInputDialog(null, "2� nome");
		
		// Verificar se os nomes s�o iguais
		System.out.println(nome1.equals(nome2));

	}

}
