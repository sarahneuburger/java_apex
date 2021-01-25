package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	// método main pra chamar o método conectar
	public static void main(String[] args) {
		
		// Criar objeto da classe
		Conexao c = new Conexao();
		
		// Objeto chamando o método
		c.conectar();
	}

	
	// Método de conexão - retorna uma connection
	public Connection conectar() {

		// Varíavel com tipo de retorno da classe
		Connection retornoConexao = null;

		// try/catch - tentar conexão
		try {

			// Caminho e dados do banco para posterior validação
			String url = "jdbc:mysql://localhost:3306/crud";
			String usuario = "root";
			String senha = "apex";

			// getConnection tenta a conexão e traz os dados, passamos as variáveis que
			// criamos como parâmetro
			retornoConexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectado com sucesso!");

		} catch (Exception erro) {
			// Exception lança o erro e grava na variável "erro"
			System.out.println("Falha ao conectar:");
			System.out.println(erro.getMessage());
			
			// Imprime o caminho do erro
			erro.printStackTrace();

		}

		// Retorno
		return retornoConexao;
		
	}
	
	

}
