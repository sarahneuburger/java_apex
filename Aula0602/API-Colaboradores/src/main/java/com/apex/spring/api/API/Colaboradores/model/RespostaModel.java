package com.apex.spring.api.API.Colaboradores.model;

public class RespostaModel {
	
	// atributo
	private String mensagem;
	
	// construtor padrão
	public RespostaModel() {
		
	}

	// construtor personalizado
	public RespostaModel(String mensagem) {
		this.mensagem = mensagem;
	}


	// get e set
	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
