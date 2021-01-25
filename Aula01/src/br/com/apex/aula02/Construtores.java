package br.com.apex.aula02;

import java.util.Scanner;

public class Construtores {
	
	public static void main(String[] args) {
		
	
		// Construtores
		// Especificar itens
		
			Pessoa p3 = new Pessoa("Sarah"); // contrutor "Pessoa()"
			
			// Utilizando os atributos criados na classe Pessoa na p1 declara acima
//			p3.nome = "Maria";
//			p3.sobrenome = "Souza";
//			p3.idade = 35;
//			p3.peso = 68.9;
//			p3.altura = 1.63;
//			p3.cpf = "123.456.789-10";
//			p3.andar(); // chamando um método
//			
			// Forçar alguém que vai usar a classe a inicializar o objeto com algum parâmetro

			
			// objeto herdado = Pessoa para Aluno
			Aluno a = new Aluno("Bruna");
			
			
			// objeto herdado = Pessoa para Cliente
			Cliente c = new Cliente("Tomas");
			
			// objeto herdado = Pessoa para ClientePJ
			ClientePJ pj = new ClientePJ ("Marcos");
			pj.getCNPJ();
			
			// objeto herdado = Pessoa para ClientePF
			ClientePF pf = new ClientePF ("Maria");
			pf.getCPF();
			
			
			
}
	
}
