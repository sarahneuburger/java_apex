package br.com.apex.aula01;

import javax.swing.JOptionPane;

public class DesviosDeFluxo {

	public static void main(String[] args) {
		
		
		int idade = 18;
		
		String status = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(status);
		
		int opcao = 0;
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Sacar\n 2 - Depositar\n 3 - Saldo\n 4 - Sair"));
			
		} while (opcao != 4);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Sarah");
			
		}

	}

}
