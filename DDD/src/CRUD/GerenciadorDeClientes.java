package CRUD;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

//   Driver JDBC - Java DataBase Connectivity
// - Execução de instruções SQL (Qualquer banco de dados relacional)
//-  Pacote java.sql (biblioteca java)
//-  Classe DriverManager
//-  Interfaces - Driver, Connection, Statement, PreparedStatement, ResultSet

public class GerenciadorDeClientes {
	private String url = "jdbc:oracle:thin:@.fiap.com.br:1521:orcl";
	private Connection conn;
	
	public GerenciadorDeClientes() throws SQLException{
		
		OracleDataSource ods = new OracleDataSource();
		//Configurando a url
		ods.setURL(url);
		// Configurando o usuario
		ods.setUser(Credenciais.user);
		//Configurando a senha
		ods.setPassword(Credenciais.pwd);
		
		//Obtendo uma conexão
		conn = ods.getConnection();
		
	}
	
	
	

}
