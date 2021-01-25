package ExercicioAluno;

public class Aluno {
	
	// Atributos
	private int matricula;
	private String nome;
	private String email;
	private String curso;
	private String telefone;
	private String celular;
	private String endereco;
	
	// Construtor padrão
	public Aluno() {
	}
	
	// Construtor com os atributos
	public Aluno(int matricula, String nome, String email, String curso, String telefone, String celular, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		this.telefone = telefone;
		this.celular = celular;
		this.endereco = endereco;
	}
	
	
	// set e get
	public int getMatricula () {
		return this.matricula;
	}
	
	public void setMatricula (int matricula) {
		this.matricula = matricula;
	}
	

	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getEmail () {
		return this.nome;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getCurso () {
		return this.curso;
	}
	
	public void setCurso (String curso) {
		this.curso = curso;
	}
	
	
	public String getTelefone () {
		return this.telefone;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	
	public String getCelular () {
		return this.celular;
	}
	
	public void setCelular (String celular) {
		this.celular = celular;
	}
	
	public String getEndereco () {
		return this.endereco;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	
	// Exibir dados
	public void exibeDados() {
		System.out.println(getMatricula());
		System.out.println(getNome());
		System.out.println(getEmail());
		System.out.println(getCurso());
		System.out.println(getTelefone());
		System.out.println(getCelular());
		System.out.println(getEndereco());
			
		}
	
	
		
		

	

}
