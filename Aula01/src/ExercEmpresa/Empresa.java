package ExercEmpresa;

import javax.swing.JOptionPane;

public class Empresa {
	
	// Atributos
	private String nome;
	private String endereco;
	private String cidade;
	private String cep;
	private String fone;
	
	// Construtor padrão
	public Empresa() {
	}
	
	// Construtor com todos os atributos
	public Empresa(String nome, String endereco, String cidade, String cep, String fone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.fone = fone;		
	}
	
	
	// Get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	
	// Métodos
	public void solicitaDados() {
		setNome(JOptionPane.showInputDialog("Informe o nome da empresa:"));
		setEndereco(JOptionPane.showInputDialog("Informe o endereço da empresa:"));
		setCidade(JOptionPane.showInputDialog("Informe a cidade da empresa:"));
		setCep(JOptionPane.showInputDialog("Informe o CEP da empresa:"));
		setFone(JOptionPane.showInputDialog("Informe o telefone da empresa:"));
	}

	
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Dados da Empresa \nNome da Empresa: " + getNome() + "\nEdereço: " + 
				getEndereco() + "\nCidade: " + getCidade() + "\nCEP: " + getCep() + "\nTelefone: " + getFone());
	}
	
	
}
