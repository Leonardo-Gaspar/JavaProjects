package APICP5.controller;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ControllerTranslate {
	public static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	public Connection conn;
	
	public ControllerTranslate() throws SQLException{
		
		OracleDataSource ods = new OracleDataSource();

		ods.setURL(url);
		// Configurando o usuario
		ods.setUser(APICP5.CRUD.Credenciais.user);
		//Configurando a senha
		ods.setPassword(APICP5.CRUD.Credenciais.pwd);		
		//Obtendo uma conexão
		conn = ods.getConnection();
	}
}
