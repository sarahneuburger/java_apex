package Polimorfismo;

public class Teste {

	public void fazerAnimalComer(Animal animal) {
		animal.comer();
		
	}
			
	public static void main(String[] args) {
		
		
		Teste t = new Teste();
		t.fazerAnimalComer(new Animal());
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Gato());
		
		Animal x = new Gato();
		t.fazerAnimalComer(x);
		
		Cachorro c = new Cachorro();
		Animal y = c;
		t.fazerAnimalComer(c);
		
		// Polimorfismo
		// crio o objeto como gato, mas traz os métodos somente do animal
		Animal v = new Gato();
		v.comer();
		
		// Instance of
		// mostra se determinado item é instancia de outro
		if(v instanceof Gato) {
			System.out.println("Sim");
		}
		
		
		}

	}

