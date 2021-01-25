package br.com.apex.aula02;

public class Pessoa {
	
	// Dados que se referem ao objeto da classe, atributos da classe
	// � boa pr�tica deixar as vari�veis como private, para que o usu�rio n�o insira qualquer dado. Para passar pelo m�todo de verifica��o antes
	
	private String nome;
	private String sobrenome;
	private int idade;
	private double peso;
	private double altura;
	private String cpf;
	private boolean casado;
	
	//Construtor - � diferente do outro, pois tem par�metro
	// Criar um objeto j� inicianilizando com par�metro
	// Construir objetos
	// Mesmo nome da classe
	public Pessoa(String nome) {
		this.nome = nome; // this � para referenciar a vari�vel da classe
	}
	
	// Encapsulamento
	// M�todos get e set
	// cria um m�todo para realizar verifica��es na vari�vel
	// controle e verifica��o de dados que posso ser inseridos errados
	public void setNome(String nome) {
		nome = nome.trim();
		this.nome = nome;		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	// no boolean se utiliza o is
	public boolean  isCasado() {
		return this.casado;
	}
	
	// M�todos, o que a "pessoa", objeto pode fazer
	public void andar() {
		System.out.println("Estou andando.");
	}
	
	public void dormir() {
		System.out.println("Estou dormindo.");
	}
	
	public void correr() {
		System.out.println("Estou correndo.");
		
	}
	
	
	
	
	
}
	
	
	

