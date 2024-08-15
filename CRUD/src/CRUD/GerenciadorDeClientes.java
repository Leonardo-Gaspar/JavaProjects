package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

//   Driver JDBC - Java DataBase Connectivity
// - Execução de instruções SQL (Qualquer banco de dados relacional)
//-  Pacote java.sql (biblioteca java)
//-  Classe DriverManager
//-  Interfaces - Driver, Connection, Statement, PreparedStatement, ResultSet

public class GerenciadorDeClientes {
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
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
	
	
//Método de inserir(Cliente)
	
	public boolean inserir(Cliente c) {
		String sql = "INSERT INTO clientes VALUES(?, ?, ?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getNome());
			ps.setString(3, c.getSobrenome());
			ps.execute();
		
		} catch(SQLException e){
			if(conn == null) {
				System.err.println("Conexão Nula!");
			}
			e.printStackTrace();
			return false;
		}finally {
			try {
				System.out.println("Fechando a conexão com o banco de dados");
				conn.close();
			} catch (SQLException e) {
				System.err.println("Erro ao fechar a conexão!");
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public boolean excluir(int id) {
		String sql = "DELETE FROM clientes WHERE id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			System.err.println("Erro ao remover o cliente - excluir()");
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	 //método atualizar()
    public void atualizar(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, sobrenome = ? WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setInt(3, cliente.getId());
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar o Cliente - atualizar()");
            e.printStackTrace();
        }
    }

    //método listar()
    public List<Cliente> listar(){
        List<Cliente> cliente = new ArrayList<Cliente>();
        String sql = "SELECT * FROM cliente";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt(0); //acesso pelo index
                String nome = rs.getString(1); //acesso pelo index
                String sobrenome = rs.getString("sobrenome"); //acesso pelo  label
                // é uma melhor pratica fazer pelo index

                cliente.add(new Cliente(id, nome, sobrenome));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar Cliente - listar()");
            e.printStackTrace();

        }
        return cliente;
    }
}
