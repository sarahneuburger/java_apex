package br.com.apex.aula01;

public class Exemplo01 {
	
	// Métodos - com ou sem parâmetros
	public static void main(String[] args) {
		
		int total = Exemplo01.soma(15, 21);
		System.out.println(total);
		
		
	}
	
	public static int soma(int numero1, int numero2) {
	int total = numero1 + numero2;
	return total;
		
	}
	
	// Podem utilizar as mesmnas variáveis pois estão limitadas ao método
	public static double soma(double numero1, int numero2) {
	double total = numero1 + numero2;
	return total;
	}
	

}
