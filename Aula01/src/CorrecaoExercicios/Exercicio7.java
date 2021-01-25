package CorrecaoExercicios;

public class Exercicio7 {

	public static void main(String[] args) {
		// Array bidimensional para impressão de valores
		
		// A 
		int[][] a = new int[3][10];
		
		for(int linha = 0; linha < a.length; linha++) {
			for(int coluna = 0; coluna < a[linha].length; coluna++) {				
				a[linha][coluna] = coluna;				
			}
		}

		
		for(int linha = 0; linha < a.length; linha++) {
			for(int coluna = 0; coluna < a[linha].length; coluna++) {				
				System.out.print(a[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// B
		
		int[][] b = new int[5][10];
		
		for(int linha = 0; linha < b.length; linha++) {
			for(int coluna = 0; coluna < b[linha].length; coluna++) {				
				b[linha][coluna] = coluna * coluna;		
			}
		}

		
		for(int linha = 0; linha < b.length; linha++) {
			for(int coluna = 0; coluna < b[linha].length; coluna++) {				
				System.out.print(b[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println();
		
		// C
		
		int[][] c = new int[6][6];
		
		
		for(int linha = 0; linha < c.length; linha++) {
			for(int coluna = 0; coluna < c[linha].length; coluna++) {				
				c[linha][coluna] = linha;		
			}
		}

		for(int linha = 0; linha < c.length; linha++) {
			for(int coluna = 0; coluna < c[linha].length; coluna++) {				
				System.out.print(c[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		// D
		
		int[][] d = new int[6][9];
		
		for(int linha = 0; linha < d.length; linha++) {
			for(int coluna = 0; coluna < d[linha].length; coluna++) {
				if(linha % 2 == 0) {
					d[linha][coluna] = -1;	
				} else {
					d[linha][coluna] = 0;
				}
			}
		}
		
		
		for(int linha = 0; linha < d.length; linha++) {
			for(int coluna = 0; coluna < d[linha].length; coluna++) {			
				System.out.print(d[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		
		
		
	}

}
