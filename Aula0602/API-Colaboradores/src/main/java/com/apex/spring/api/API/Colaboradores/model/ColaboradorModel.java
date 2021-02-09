package com.apex.spring.api.API.Colaboradores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // dizer que tbm é uma entidade, que usar como uma classe normal
// anotação para entender que esta classe será uma tabela
@Table(name = "colaboradores") 
public class ColaboradorModel {
	
	// recomendação é usar o tipo de dados Wrappers
	// não vai ; após as  annotations

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento
	@Column(name = "id")
	private Integer codigo;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@Column(name = "email")
	private String email;
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
