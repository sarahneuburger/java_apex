package exemplo02;

public class Variaveis {
	
	@SuppressWarnings("unused") // annotaion - declaro que n�o quero utilizar as vari�veis - sinalizar que estou ciente do erro e que est� ok
	public static void main(String[] args) { // esse item � importante para que o projeto seja executado
		
		// N�meros inteiros
		byte tipo1 = 7; // menor tipo inteiro a disposi��o - m�ximo 127 e m�nimo -128
		short tipo2 = 1000; // cada um tem limite de n�s
		int tipo3 = 500;
		long tipo4 = 200;
		
		// N�meros reais
		float tipo5 = 6.3f; // f ao final do n�mero para especificar float - at� sete casas decimais
		double tipo6 = 4.7; // at� 15 casas decimais
		
		// Textos
		char tipo7 = 'a';
		char[] tipo8 = {'J','a','v','a'}; // � um conjunto de char, vetor - por debaixo dos panos � como uma string � compilada
		String tipo9 = "Java"; // � um vetor de chars
		
		// boolean
		boolean tipo10 = true;
		
		// usando as vari�veis como Class, declarar com letra maiscula e possui mais a��es
		
	}

}
