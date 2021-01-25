package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import conexao.Conexao;

public class Principal {
	
	                            // throws SQLException, controla a exceção, mas não é possível personalizar o texto
	public static void main(String[] args) throws SQLException {
		
		// Statement
		// objeto conexão
		Conexao conexao = new Conexao();
		
		// string com o comando sql
		String sql1 = "select * from clientes";
		String sql2 = "select count(*) from clientes";
		String sql3 = "select sum(idade) from clientes";
		String sql4 = "select max(idade) from clientes";
		String sql5 = "select avg(idade) from clientes";
		String sql12 = "truncate table clientes";
		String sql13 = "drop table clientes";
		
		// statement - comandos sem parâmetros (where)
		Statement stmt = conexao.conectar().createStatement();
		
		// execute para o truncate, não retorna dados
		stmt.execute(sql13);
		
//		// Apresentar dados do count/sum/max/avg, não precisa de result
//		ResultSet rs = stmt.executeQuery(sql5);
//		
//		while (rs.next()) {
//			System.out.println(rs.getInt(1));
//		}
//		
		
		// trazer os resultados do select total
//		ResultSet rs = stmt.executeQuery(sql1);
		
		// laço para apresentar os dados / .next, enquanto existir um próximo, vai impri
//		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getInt(4));
//		}

		//---------------------------------------------------------------------------
		
		// PreparedStatement - com parâmetros
		String sql6 = "select * from clientes where nome = ?";		
		String sql7 = "select * from clientes where nome = ? and idade >= ?";
		String sql8 = "select codigo, nome, sobrenome from clientes where idade > ? and idade < ?";	
		String sql9 = "insert into clientes (codigo, nome, sobrenome, idade) values (?, ?, ?, ?)";	
		String sql10 = "update clientes set nome = ? where codigo = ?";	
		String sql11 = "delete from clientes where codigo = ?";
		
//		
//		PreparedStatement pstmt = conexao.conectar().prepareStatement(sql11);
//		
//		// dados para inserir
//		pstmt.setInt(1, 2);
//		
//		// para o insert somente execute, não tem resultado
//		pstmt.execute();
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("codigo") + " - " + rs.getNString("nome") + " " + rs.getString("sobrenome"));
//		}
		
		
		
		
	}
	

}
