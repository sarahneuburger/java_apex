package exemplo04;

import javax.swing.JOptionPane;

public class Armazenar {

	public static void main(String[] args) {
		
		// Capturar nome
		String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		
		// Capturar idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � o sua idade?"));
		
		// Capturar se estuda
		int estuda = JOptionPane.showConfirmDialog(null, "Voc� est� estudando?");
		
		// Exibir mensagem 
		JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos e " + (estuda == 1 ? "n�o estuda." : "est� estudando.")); // if else simplicado
		


	}

}
