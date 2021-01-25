package CorrecaoExercicios;

public class Exercicio6 {

	public static void main(String[] args) {
		// Substituir impares por -1 e pares por +1

		int[] numeros = { 23, 45, 78, 90, 65, 44 };

		Exercicio6.substituiNumeros(numeros);

		int[] s = Exercicio6.substituiNumeros(numeros);

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < s.length; i++) {
			if (s[i] > 0) {
				System.out.print("+" + s[i] + " ");
			} else {
				System.out.print(s[i] + " ");
			}
		}

	}

	public static int[] substituiNumeros(int[] numeros) {

		int[] substituicao = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				substituicao[i] = +1;
			} else if (numeros[1] % 2 != 0) {
				substituicao[i] = -1;
			}
		}

		return substituicao;
	}

}
