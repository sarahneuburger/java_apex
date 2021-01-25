package br.com.apex.fundamentos;

public class Carro {
	
	// Atributos
	private String nome;
	private String marca;
	private String categoria;
	private int ano;
	private String cor;
	private int qtdPortas;
	private boolean opcionais;
	private String tipoCombustivel;
	
	// Outras classes criadas
	// Composição - atributos que são atributos de outra classe
	private Motor motor;
	private Pneu pneu;
	
	// Construtor - é possível construir pelo eclipse - botão direito - source - generate constructor using fields
//	public Carro(String marca, int ano) {
//		this.marca = marca;
//		this.ano = ano;
//	}
	
	
	// Get e Set - botão direito - source - generate getters and setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public boolean isOpcionais() {
		return opcionais;
	}
	public void setOpcionais(boolean opcionais) {
		this.opcionais = opcionais;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Pneu getPneu() {
		return pneu;
	}
	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	
	

}
