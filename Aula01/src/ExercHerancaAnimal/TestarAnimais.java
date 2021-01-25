package ExercHerancaAnimal;

public class TestarAnimais {
	
	public static void main(String[] args) {
		
	
	
	Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", (float) 2.0, "Frutas");
	
	Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", (float) 1.5, "Barbatanas e cauda");
	
	Mamifero ursoCanada = new Mamifero("Urso-do-Canada", 180, 4, "Vermelho", "Terra", (float) 0.5, "Mel");
	
	
	camelo.dadosMamifero();
	
	tubarao.dadosPeixe();
	
	ursoCanada.dadosMamifero();
	
	
	
	}
}
