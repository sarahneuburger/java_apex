package exemplo02;

public class Variaveis {
	
	@SuppressWarnings("unused") // annotaion - declaro que não quero utilizar as variáveis - sinalizar que estou ciente do erro e que está ok
	public static void main(String[] args) { // esse item é importante para que o projeto seja executado
		
		// Números inteiros
		byte tipo1 = 7; // menor tipo inteiro a disposição - máximo 127 e mínimo -128
		short tipo2 = 1000; // cada um tem limite de nºs
		int tipo3 = 500;
		long tipo4 = 200;
		
		// Números reais
		float tipo5 = 6.3f; // f ao final do número para especificar float - até sete casas decimais
		double tipo6 = 4.7; // até 15 casas decimais
		
		// Textos
		char tipo7 = 'a';
		char[] tipo8 = {'J','a','v','a'}; // é um conjunto de char, vetor - por debaixo dos panos é como uma string é compilada
		String tipo9 = "Java"; // é um vetor de chars
		
		// boolean
		boolean tipo10 = true;
		
		// usando as variáveis como Class, declarar com letra maiscula e possui mais ações
		
	}

}
