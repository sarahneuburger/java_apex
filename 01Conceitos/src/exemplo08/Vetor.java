package exemplo08;

public class Vetor {

	public static void main(String[] args) {

		// Vetor de nomes
		String[] nomes = {"Lucas","Jeferson","Maria","Joana"};
		
		// Laço For
		for (int indice=0; indice<nomes.length; indice++) {
			System.out.println(nomes[indice]);
		}
		
		// Laço forEach - lista tudo sem quebra - crio variável do tipo do vetor e digo qual variável quero manipular
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}					
}
