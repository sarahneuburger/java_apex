package exemplo08;

public class Vetor {

	public static void main(String[] args) {

		// Vetor de nomes
		String[] nomes = {"Lucas","Jeferson","Maria","Joana"};
		
		// La�o For
		for (int indice=0; indice<nomes.length; indice++) {
			System.out.println(nomes[indice]);
		}
		
		// La�o forEach - lista tudo sem quebra - crio vari�vel do tipo do vetor e digo qual vari�vel quero manipular
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}					
}
