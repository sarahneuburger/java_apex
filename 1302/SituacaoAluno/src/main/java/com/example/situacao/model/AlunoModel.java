package com.example.situacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos") 
public class AlunoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAluno")
	private Integer codigoAluno;
	
	@Column(name = "nomeAluno")
	private String nomeAluno;
	
	@Column(name = "idadeAluno")
	private Integer idadeAluno;
	
	@Column(name = "mediaAluno")
	private Integer mediaAluno;
	
	@Column(name = "situacaoAluno")
	private String situacaoAluno;
	
	
	public Integer getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(Integer codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public Integer getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(Integer idadeAluno) {
		this.idadeAluno = idadeAluno;
	}
	public Integer getMediaAluno() {
		return mediaAluno;
	}
	public void setMediaAluno(Integer mediaAluno) {
		this.mediaAluno = mediaAluno;
	}
	public String getSituacaoAluno() {
		return situacaoAluno;
	}
	public void setSituacaoAluno(String situacaoAluno) {
		this.situacaoAluno = situacaoAluno;
	}

	
}
