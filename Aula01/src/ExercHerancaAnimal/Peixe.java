package ExercHerancaAnimal;

//Peixe referencia a classe Animal
public class Peixe extends Animal{
	
	private String caracteristica;
	
	// Atributo novo "característica"
	public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
		this.caracteristica = caracteristica;
		
	}
	
	// Get e Set
		public void setCaracterisca (String caracteristica) {
			this.caracteristica = caracteristica;
		}
		
		public String getCaracteristica() {
			return this.caracteristica;
		}
	
	
	// Exibir dados
	public void dadosPeixe() {
		super.exibeDados();
		System.out.println(caracteristica);
		
	}

}
