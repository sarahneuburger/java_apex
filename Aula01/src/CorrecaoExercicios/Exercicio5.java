package CorrecaoExercicios;

public class Exercicio5 {

	public static void main(String[] args) {
		// Indentificar o maior número do array
		
		int[] numeros = {-11, -3, -56, -78, -34};
		
		Exercicio5.menorNumero(numeros);
		
		int m = Exercicio5.menorNumero(numeros);
		
		System.out.println(m);

	}
	
	public static int menorNumero(int[] numeros) {
		int menor = numeros[0];
		int indiceMenor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(menor < numeros[i]) {
				menor = numeros[i];
				indiceMenor = i;
			}
		}
		
		return indiceMenor;
	}

}
