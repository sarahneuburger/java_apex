package ExercicioAluno;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(1, "Sarah", "sarah@gmail.com", "Matematica", "33459800", "998057765", "Rua Bahia");
		
		Aluno aluno2 = new Aluno(2, "Henrique", "henrique@gmail.com", "Ingles", "33456789", "998355355", "Av dos Estados");
		
		
		aluno1.exibeDados();
		
		aluno2.exibeDados();
		
	}

}
