package ExercEmpresa;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa{
	
	// Novos atributos
	private String tipoComida;
	private double precoMedio;
	
	// get e set
	public String getTipoComida() {
		return tipoComida;
	}
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	public double getPrecoMedio() {
		return precoMedio;
	}
	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}
	

	// Construtores
	public Restaurante() {
		
	}
	
	public Restaurante(String nome, String endereco, String cidade, String cep, String fone, String tipoComida, double precoMedio) {
		super(nome, endereco, cidade, cep, fone);
		this.tipoComida = tipoComida;
		this.precoMedio = precoMedio;	
	}
	
	public void incluriDadosRestaurante() {
		super.solicitaDados();
		setTipoComida(JOptionPane.showInputDialog("Informe o tipo de comida:"));
		setPrecoMedio(Double.parseDouble((JOptionPane.showInputDialog("Informe o preço médio do restaurante:"))));
	}
	
	public void exibirRestaurante() {
		super.exibeDados();
		JOptionPane.showMessageDialog(null, "Dados do Restautante \nTipo de Comidade: " + tipoComida + "\nPreço Médio: " + precoMedio);
		
	}
	
}
