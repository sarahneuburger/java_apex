package CorrecaoExercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	// Exercicio 2 - Array
	
	public static void main(String[] args) {
		
		double[] numeros = new double[10];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Informe o " + (i + 1) + "º número:");
			numeros[i] = s.nextDouble();
			
		}
		
		s.close();
		Exercicio2.imprimeVetor(numeros);
		
	}
	
	
	public static void imprimeVetor(double[] vetor) {
		System.out.println("Conteúdo do vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\n");
		}
	}

}
