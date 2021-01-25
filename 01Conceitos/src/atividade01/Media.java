package atividade01;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {

		// Pedir as notas
		Double nota1 = Double.parseDouble((JOptionPane.showInputDialog(null, "Informe a primeira nota:")));
		Double nota2 = Double.parseDouble((JOptionPane.showInputDialog(null, "Informe a segunda nota:")));
		Double nota3 = Double.parseDouble((JOptionPane.showInputDialog(null, "Informe a terceira nota:")));
		
		Double media = (nota1 + nota2 + nota3) / 3;
		
		// Avaliando a média e sinalizando se foi aprovado
		if(media >= 7) {
			System.out.println("O aluno foi aprovado e a média foi " + media);
		} else {
			System.out.println("O aluno foi reprovado e a média foi " + media);
		}
		
	}

}
