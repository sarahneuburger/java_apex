package br.com.apex.aula01;

public class Matriz {

	public static void main(String[] args) {

		//Matriz
		// Array multidimensional
		
		// primeiro linha depois coluna
		
		int[][] numeros = new int[3][3];
		
		numeros[0][0] = 47;
		numeros[0][1] = 34;
		numeros[0][2] = 56;
		numeros[1][0] = 90;
		numeros[1][0] = 34;
		numeros[1][0] = 32;
		numeros[2][0] = 45;
		numeros[2][1] = 23;
		numeros[2][2] = 12;
		
		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = linha * coluna;				
			}
		}
		

		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros[linha].length; coluna++) {
			System.out.print(numeros[linha][coluna] + " ");				
			}
			
			System.out.println();
		}
		
		
	}

}
