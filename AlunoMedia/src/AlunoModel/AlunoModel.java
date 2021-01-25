package AlunoModel;

public class AlunoModel {
	
	private int media;
	private String situacao;
	
	public void media(int nota1, int nota2, int nota3, int nota4) {
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
	}
	
	
	public int retornaMedia() {
		return media;
	}

	
	public void situacao(int media) {
		
		if (media >= 7) {
			
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}	
	}
	
	
	public String retornaSituacao() {
		return situacao;
	}
	
}
