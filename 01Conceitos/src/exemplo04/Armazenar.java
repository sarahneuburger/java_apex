package exemplo04;

import javax.swing.JOptionPane;

public class Armazenar {

	public static void main(String[] args) {
		
		// Capturar nome
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		// Capturar idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é o sua idade?"));
		
		// Capturar se estuda
		int estuda = JOptionPane.showConfirmDialog(null, "Você está estudando?");
		
		// Exibir mensagem 
		JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos e " + (estuda == 1 ? "não estuda." : "está estudando.")); // if else simplicado
		


	}

}
