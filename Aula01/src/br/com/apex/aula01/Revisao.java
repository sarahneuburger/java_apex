package br.com.apex.aula01;

public class Revisao {

	// Ponto de partida
	// Só uma classe tem o método main, que vai chamando as demais
	public static void main(String[] args) {
		
		System.out.println("Olá Java");
		
		/* Tipos primitivos
		 Números inteiros
		 byte
		 short
		 char
		 int
		 long
		  
		 Números quebrados
		 double
		 float
		 
		 Verdadeiro ou falso
		 boolean
		 */
		
		byte idade = 20;
		
		char letra = 'A';
		
		// String é objeto, não tipo primitivo		
		String nome = "Sarah"; // Por padrão assume nulo, todos os objetos
		
		/*Operadores Compostos
		+=
		++
		--
		*/
		
		// Incremento tem que cuidar quando será pré incrementado
		System.out.println(++idade);

		// Cuidar da ordem de precedência dos cálculos
		int soma = 5 + 9 * 2; // 23
		
		
		byte numero = 20;
		int numero2 = numero;
		
		// Casting - Converte o tipo de dado
		int idade1 = 25;
		byte numero3 = (byte)idade1;
		
		
		System.out.println(numero3);
		
		// Conversão texto para inteiro
		int valor = Integer.parseInt("10");
		int valor2 = Integer.parseInt("20");
		
		System.out.println(valor+valor2);
		
		
		// Conversão texto para inteiro
		String valor3 = Integer.toString(10);
		String valor4 = Integer.toString(20);
				
		System.out.println(valor3+valor4); 
		
		
		public static int soma(int numero5, int numero6) {
			int total = numero5 + numero6;
			return total;
			
		}
		
	}

}
