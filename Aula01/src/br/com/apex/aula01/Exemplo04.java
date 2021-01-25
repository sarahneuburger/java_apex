package br.com.apex.aula01;

public class Exemplo04 {
	
	public static void main(String[] args) {
		
		// Principais métodos da classe String
		// Traz o caracter na posição informada
		
			String frase = "Java no sábado!";
			
			System.out.println(frase.charAt(3));
		
		// Quantidade de caracteres
		System.out.println(frase.length());
		
		// Digo uma letra e diz em qual posição está
		// Se não encontrar a letra, retorna -1
		System.out.println(frase.indexOf('a'));
		
		// Concat - concata textos
		System.out.println(frase.concat(" à tarde!"));
		
		// replace - substitui caracteres - Exemplo para eliminar caracteres especiais
		// com e seu o all executam a mesma coisa
		System.out.println(frase.replace('a', 'e'));
		System.out.println(frase.replaceAll("Java", "C#"));
		
		// starWith - se inicia com determinado texto, retorna boolean
		System.out.println(frase.startsWith("Java"));
		
		// endsWith - se termina com determinada palavra ou letra
		System.out.println(frase.endsWith("."));
		
		// contains - a frase contém determinada letra ou frase, em qualquer posição
		System.out.println(frase.contains("X"));
		
		// equals - igualdade
		System.out.println(frase.equals("Java no sábado!")); //true
		System.out.println(frase.equals("Java no sabado!")); // false
		System.out.println(frase.equals("JAVA NO SÁBADO!")); // false
		
		// equalsIgnoreCase - ignora maiúscula e minúscula
		System.out.println(frase.equalsIgnoreCase("JAVA NO SÁBADO!"));
		
		// substring - o texto da string a partir do caracter definido 
		// somente parâmetro de início
		System.out.println(frase.substring(8));
		
		// substring - o texto da string a partir do caracter definido 
		// parâmetros de início e fim
		System.out.println(frase.substring(6, 11));
		
		// trim - nova string removendo espaços em branco do início e do final
		String nome = "    Sarah    ";
		System.out.println(nome.trim());
		
		// split - array de strings 
		String dados = "Sarah;Brito;25;Blumenau;SC";
		String[] info = dados.split(";");
		System.out.println(info[0]);
		System.out.println(info[1]);
		System.out.println(info[2]);
		System.out.println(info[3]);
		System.out.println(info[4]);
		
		// transformar tudo em maiusculo ou minusculo
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());
		
				
	}

}
