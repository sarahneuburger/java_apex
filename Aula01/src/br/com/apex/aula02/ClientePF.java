package br.com.apex.aula02;

public class ClientePF extends Cliente {
	
	// Classe "neta" de pessoa, pois veio a partir de cliente que é filho de pessoa
	
	private String cpf;
	
	public ClientePF(String nome) {
		super(nome);
	}
	
	// set e get
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCPF () {
		return this.cpf;
	}


}
