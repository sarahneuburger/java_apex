package br.com.apex.aula02;

public class Aluno extends Pessoa {
	
	// Heran�a
	
	// � poss�vel criar atributos espec�ficos tbm para as classes filho
	private double[] notas;
	private int numeroMatricula;
	
	// n�o precisa declarar atributos, pois vem herdado da classe pai
	
	// m�todo herdado
	public Aluno(String nome) {
		super(nome);
		// obrigatoriamente temos que ter um construtor igual a classe pai

	}
	

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double[] getNotas() {
		return this.notas;
	}
	
	public void setNumeroMatricula (int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}

	
}
