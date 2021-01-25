package CorrecaoExercicios;

public class Exercicio3 {
	
	// Correção exercício 3 - Arrays
	
	public static void main(String[] args) {
		
		int[] numeros = {3, -8, 12, 10, -18};
		
		int qtd = Exercicio3.retornaQtdNegativos(numeros);
		System.out.println("O array possui " + qtd + " números negativos.");
		
	}
	
	public static int retornaQtdNegativos(int[] numeros) {
		int totalNegativos = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				totalNegativos++;
			}
		}
		return totalNegativos;
		
		
	}

}
