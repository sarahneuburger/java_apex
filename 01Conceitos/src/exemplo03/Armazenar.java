package exemplo03;

import java.util.Scanner;

public class Armazenar {

	public static void main(String[] args) {
		
		// Objeto da classe Scanner - guarda informação via console
		Scanner armazenar = new Scanner(System.in); // captura de dados, system.in
		// todo objeto é com letra minuscula
		// chamando um construtor, é que vai chamar a ação
		// é similar a função, porém, é instanciada a um objeto
		// void é nulo
		// construtor faz uma ação depois de criar um objeto
		
		
		// Obter um nome
		System.out.println("Qual é o seu nome?");
		String nome = armazenar.next();
		
		// Exibir o nome
		System.out.println("O nome informado é " +nome);
		
		
		// Remover o objeto
		armazenar.close();
		
		
	}

}
