package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	// m�todo main pra chamar o m�todo conectar
	public static void main(String[] args) {
		
		// Criar objeto da classe
		Conexao c = new Conexao();
		
		// Objeto chamando o m�todo
		c.conectar();
	}

	
	// M�todo de conex�o - retorna uma connection
	public Connection conectar() {

		// Var�avel com tipo de retorno da classe
		Connection retornoConexao = null;

		// try/catch - tentar conex�o
		try {

			// Caminho e dados do banco para posterior valida��o
			String url = "jdbc:mysql://localhost:3306/crud";
			String usuario = "root";
			String senha = "apex";

			// getConnection tenta a conex�o e traz os dados, passamos as vari�veis que
			// criamos como par�metro
			retornoConexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectado com sucesso!");

		} catch (Exception erro) {
			// Exception lan�a o erro e grava na vari�vel "erro"
			System.out.println("Falha ao conectar:");
			System.out.println(erro.getMessage());
			
			// Imprime o caminho do erro
			erro.printStackTrace();

		}

		// Retorno
		return retornoConexao;
		
	}
	
	

}
