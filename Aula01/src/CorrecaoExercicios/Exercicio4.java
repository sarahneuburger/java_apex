package CorrecaoExercicios;

public class Exercicio4 {
	
	// Array de inteiros por um array de boolean
	
	public static void main(String[] args) {
		
		int[] numeros = {1, -3, 8, 0, -3, 9, 8, -5};
		
		boolean[] c = Exercicio4.converte(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
			
		}
			
	}

	public static boolean[] converte(int[] numeros) {
		
		boolean[] conversao = new boolean[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				conversao[i] = true;
			} else if (numeros[1] <= 0) {
				conversao[i] = false;
			}	
		}
		
		return conversao;
	}
	

}
