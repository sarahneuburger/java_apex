package exemplo03;

import java.util.Scanner;

public class Armazenar {

	public static void main(String[] args) {
		
		// Objeto da classe Scanner - guarda informa��o via console
		Scanner armazenar = new Scanner(System.in); // captura de dados, system.in
		// todo objeto � com letra minuscula
		// chamando um construtor, � que vai chamar a a��o
		// � similar a fun��o, por�m, � instanciada a um objeto
		// void � nulo
		// construtor faz uma a��o depois de criar um objeto
		
		
		// Obter um nome
		System.out.println("Qual � o seu nome?");
		String nome = armazenar.next();
		
		// Exibir o nome
		System.out.println("O nome informado � " +nome);
		
		
		// Remover o objeto
		armazenar.close();
		
		
	}

}
