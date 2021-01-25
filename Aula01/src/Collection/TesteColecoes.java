package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class TesteColecoes {
	
	// Collections - armazenar dados dinamicamente
	// cadastrar, alterar e excluir
	
	// List - interface - tem m�todos
	
	// Array List - "vetor melhorado"
	
	public static void main(String[] args) {
		
		// entre os simbolos fica o tipo de dados
		// n�o precisa declarar tamanho
		// pode ser somente List, que implementa
		// se for numero primitivo, utiliza a classe wrapper
		// tbm come�a em zero
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Sarah");
		nomes.add("Henrique");
		nomes.add("Thiago");
		nomes.add("Dulce");
		
		// para verificar o tamanho do ArrayList
		System.out.println(nomes.size());
		
		// Imprimir dado de determinada posi��o
		System.out.println(nomes.get(2));
		
		// alterar dados
		nomes.set(1, "Gabriela");
		
		// remover dados
		nomes.remove(2);
		
		// limpar a lista
		nomes.clear();
		
		// Leitura de todo array list
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
			
		}
		
		// Array normal
		String[] n = new String[5];
		n[0] = "Maria";
		
		
		// HashMap
		// tbm armaneza dados temporariamente
		// a base � uma chave - n�o preciso saber a posi��o para buscar o dado
		// chama sinalizando dois valores, um � a chave e o outro � o valor
		// k - key   v - value
		HashMap<String, String> estados = new HashMap<String, String>();
		
		// Adionando itens
		estados.put("SC", "Florian�polis");
		estados.put("PR", "Curitiba");
		estados.put("MG", "Belo Horizonte");
		
		
		// Imprimindo dados
		System.out.println(estados);
		
		// Remover dados
		estados.remove("PR");
		
		// Imprimindo dados
		System.out.println(estados);
		
		// Imprimir dado especifico
		System.out.println(estados.get("SC"));
		

		// Generics
		// reutilizar dados, m�todos
		// m�todos para v�rios tipos de dados
		// E - elemento   V - valor   N - numero   T - tipo   K - chave
		Integer[] x = {18, 22, 31, 27, 17};
		Double[] z = {1.50, 1.77, 1.64, 1.80};
		String[] y = {"Vanessa", "Rubens", "Larissa", "Gabriel", "Paloma"};
		
		// Chamando o m�todo
		exibir(x);
		exibir(z);
		exibir(y);
		
	}
	
	// Declara��o com tipo "elements"
	// for each, tipo de for que apresenta os dados sem precisar de um indice, ele j� v� o que tem dentro do item
		public static <E> void exibir (E[] vetores) {
			for (E elemento : vetores) {
			System.out.println(elemento);
			}
		}

}
