package ExercHerancaAnimal;

public class Mamifero extends Animal{
	
	// Atributo alimento
	private String alimento;

	// Construtor
	public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
	}

	// Get e Set
	public void setAlimento (String alimento) {
		this.alimento = alimento;
	}
			
	public String getAlimento() {
		return this.alimento;
	}
	
	
	// Exibir dados
	public void dadosMamifero() {
		super.exibeDados();
		System.out.println(alimento);

	}
	
}
