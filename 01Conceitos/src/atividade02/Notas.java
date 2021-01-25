package atividade02;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		
		// Pedindo a quantidade de notas
		
		int notaDe2 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$2,00:")));
		int notaDe5 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$5,00:")));
		int notaDe10 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$10,00:")));
		int notaDe20 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$20,00:")));
		int notaDe50 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$50,00:")));
		int notaDe100 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$100,00:")));
		int notaDe200 = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe a quantidade de notas de R$200,00")));
		
		// Somando as notas
		double total = ((notaDe2 * 2.00) + (notaDe5 * 5.00) + (notaDe10 * 10.00) + (notaDe20 * 20.00) + (notaDe50 * 50.00) + (notaDe100 * 100.00) + (notaDe200 * 200.00));
		
		// Mostrando o total
		System.out.println("O valor total em notas é R$" + total);
		
	}

}
