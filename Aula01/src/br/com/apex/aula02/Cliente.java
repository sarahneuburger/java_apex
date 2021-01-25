package br.com.apex.aula02;

public class Cliente extends Pessoa {
	
	// filho de Pessoa
	
	private int numeroInscricao;

	public Cliente(String nome) {
		super(nome);
		
	}

	// set e get
		public void setNumeroInscricao(int numeroInscricao) {
			this.numeroInscricao = numeroInscricao;
		}
		
		public int gerNumeroInscricao () {
			return this.numeroInscricao;
		}

	
}
