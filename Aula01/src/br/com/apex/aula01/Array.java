package br.com.apex.aula01;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		//Arrays - Vetor Unidimensional
		
		// iniciar e colocar valores
		int[] idades = new int[5];
		
		idades[0] = 48;
		idades[1] = 15;
		idades[2] = 36;
		idades[3] = 96;
		idades[4] = 18;

		// declarando valores direto no array
		String[] nomes = {"Maria", "Pedro", "Tiago", "Joao", "Barquinho"};
		
				// tamanho dos vetores
		System.out.println("Vetor idades: " + idades.length);
		
		System.out.println("Vetor nomes: " + nomes.length);
		
		// Imprimir idades
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		// Laço de repetição para adicionar valores no array
		
		int[] idades1 = new int[3];
		
		int valor = 0;
		
		for(int i = 0; i < idades1.length; i++) {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a " + (i+1) + "ª idade:"));
			idades1[i] = idade;
		}
		
		for(int i = 0; i < idades1.length; i++) {
			System.out.println(idades1[i]);
		
		}

	}
		
}
