package br.com.apex.aula02;

public class Aluno extends Pessoa {
	
	// Herança
	
	// é possível criar atributos específicos tbm para as classes filho
	private double[] notas;
	private int numeroMatricula;
	
	// não precisa declarar atributos, pois vem herdado da classe pai
	
	// método herdado
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
