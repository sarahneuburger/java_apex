package br.com.apex.aula02;

import java.util.Scanner;

public class OrientacaoObjetos {

	public static void main(String[] args) {
		// Orientação a Objetos
		
		// Scanner teclado = new Scanner(System.in);
		
		// Exemplo Scanner é uma classe do próprio Java, teclado é o nome e new instancia (inicia)
		
		// Toda classe que criamos é filha da classe Object
		
		// Chamando a classe em outra
		Pessoa p1 = new Pessoa("Joao");
		
		// Utilizando os atributos criados na classe Pessoa na p1 declara acima
//		p1.nome = "Maria";
//		p1.sobrenome = "Souza";
//		p1.idade = 35;
//		p1.peso = 68.9;
//		p1.altura = 1.63;
//		p1.cpf = "123.456.789-10";
//		p1.andar(); // chamando um método
//		
		// Atributos de segunda Pessoa
		Pessoa p2 = new Pessoa("Jose");
//		p2.nome = "Jose";
//		p2.sobrenome = "Silva";
//		p2.idade = 48;
//		p2.peso = 78.9;
//		p2.altura = 1.76;
//		p2.cpf = "909.434.232-10";
		
		// Imprimindo dados de uma Pessoa
//		System.out.println("Nome: " + p1.nome);
//		System.out.println("Sobrenome: " + p1.sobrenome);
//		System.out.println("Idade: "+ p1.idade);
//		
		// Criando um array com a classe Pessoa
		Pessoa[] clientes = new Pessoa[2];
		clientes[0] = p1;
		clientes[1] = p2;
		
		// Imprimindo dados do array
		for(int i = 0; i < clientes.length; i++) {
			
//			System.out.println(clientes[0].nome);
//			System.out.println(clientes[0].sobrenome);
//			System.out.println(clientes[0].idade);
		}
		
		// Comparação dos conteúdos entre os objetos
		System.out.println("Comparando p1 e p2: " + p1.equals(p2));
		
		// Operador instanceof
		if(p1 instanceof Pessoa) {
			System.out.println("Sim, p1 é uma instância de Pessoa.");
		}
		

	}

}
