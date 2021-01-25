package ExercicioProduto;

import javax.swing.JOptionPane;

public class Produto {
	
	// Atributos
	private int codigo;
	private String descricao;
	private String marca;
	private double peso;
	private double valor;
	
	// Construtor padrão
	public Produto() {
	}
	
	
	// Construtor com os atributos
	public Produto (int codigo, String descricao, String marca, double peso, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
		this.peso = peso;
		this.valor = valor;
	}
	
	
	// set e get
		public int getCodigo () {
			return this.codigo;
		}
		
		public void setCodigo (int codigo) {
			this.codigo = codigo;
		}
		

		public String getDescricao () {
			return this.descricao;
		}
		
		public void setDescricao (String descricao) {
			this.descricao = descricao;
		}
		
		public String getMarca () {
			return this.marca;
		}
		
		public void setMarca (String marca) {
			this.marca = marca;
		}

		
		public double getPeso () {
			return this.peso;
		}
		
		public void setPeso (double peso) {
			this.peso = peso;
		}

		public double getValor () {
			return this.valor;
		}
		
		public void setValor (double valor) {
			this.valor = valor;
		}
	
		
		// Exibir dados
		public void exibeDados() {
			JOptionPane.showMessageDialog(null, "Código: " + getCodigo() + "\n" + "Descrição: " + getDescricao() + "\n"
					+ "Marca: " + getMarca() + "\n" + "Peso: " + getPeso() + "\n" + "Valor: " + getValor());
		}
	
	
}
