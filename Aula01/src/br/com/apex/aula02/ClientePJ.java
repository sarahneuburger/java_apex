package br.com.apex.aula02;

public class ClientePJ extends Cliente {
	
	// Classe "neta" de pessoa, pois veio a partir de cliente que é filho de pessoa
	
	private String cnpj;

	public ClientePJ(String nome) {
		super(nome);
		
	}
	
	// get e set
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCNPJ () {
		return this.cnpj;
	}

}
