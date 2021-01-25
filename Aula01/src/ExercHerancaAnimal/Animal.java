package ExercHerancaAnimal;

public class Animal {
	
	// Criando os atributos
	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	// Construtor para os atributos
	public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;		
	}
	
	// Get e Set
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setComprimento (float Comprimento) {
		this.comprimento = comprimento;
	}
	
	public float getComprimento () {
		return this.comprimento;
	}
	
	public void setNumeroPatas (int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	public int getNumeroPatas () {
		return this.numeroPatas;
	}
	
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	
	public void setAmbiente (String ambiente) {
		this.ambiente = ambiente;
	}
	
	public String getAmbiente() {
		return this.ambiente;
	}
	
	public void setVelocidadeMedia (float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public float getVelocidadeMedia() {
		return this.velocidadeMedia;
	}
	
	// Exibir dados
	public void exibeDados() {
		System.out.println(nome);
		System.out.println(comprimento);
		System.out.println(numeroPatas);
		System.out.println(cor);
		System.out.println(ambiente);
		System.out.println(velocidadeMedia);
		
	}
	
	
	
	
	
	
	
	
}
