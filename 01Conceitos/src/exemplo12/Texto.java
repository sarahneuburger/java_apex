package exemplo12;

import javax.swing.JOptionPane;

public class Texto {

	public static void main(String[] args) {
		
		// Obter dois nomes // string não é primitivo, logo a comparação crua (==) não funciona, utilizar equals
		String nome1 = JOptionPane.showInputDialog(null, "1º nome");
		String nome2 = JOptionPane.showInputDialog(null, "2º nome");
		
		// Verificar se os nomes são iguais
		System.out.println(nome1.equals(nome2));

	}

}
