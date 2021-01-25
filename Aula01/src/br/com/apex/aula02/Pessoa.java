package br.com.apex.aula02;

public class Pessoa {
	
	// Dados que se referem ao objeto da classe, atributos da classe
	// é boa prática deixar as variáveis como private, para que o usuário não insira qualquer dado. Para passar pelo método de verificação antes
	
	private String nome;
	private String sobrenome;
	private int idade;
	private double peso;
	private double altura;
	private String cpf;
	private boolean casado;
	
	//Construtor - é diferente do outro, pois tem parâmetro
	// Criar um objeto já inicianilizando com parâmetro
	// Construir objetos
	// Mesmo nome da classe
	public Pessoa(String nome) {
		this.nome = nome; // this é para referenciar a variável da classe
	}
	
	// Encapsulamento
	// Métodos get e set
	// cria um método para realizar verificações na variável
	// controle e verificação de dados que posso ser inseridos errados
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
	
	// Métodos, o que a "pessoa", objeto pode fazer
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
	
	
	

