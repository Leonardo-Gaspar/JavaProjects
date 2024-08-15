package mvc_dao_db.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mvc_dao_db.model.vo.Produto;

public class ProdutoDAOimpl implements ProdutoDAO{
	
	private Connection connection;
	
	public ProdutoDAOimpl(Connection connection) {
		this.connection = connection;
		
	}

	@Override
	public void inserir(Produto produto) throws SQLException {
		String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, produto.getName());
		statement.setFloat(2, produto.getPreco());
		statement.execute();
		
	}

	@Override
	public List<Produto> listar() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM produto";
//		PreparedStatement statement = connection.prepareStatement(sql);	 "esta certo tbm "
		Statement statement = connection.createStatement(); 
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
//			int id = resultSet.getInt("id");
//			String nome = resultSet.getString("nome");
//			float preco = resultSet.getFloat("preco");
//			
//			Produto produto = new Produto (id, nome, preco);
//			
//			produtos.add(produto);
			
			//ou
			produtos.add(new Produto(
					resultSet.getInt("id"),
					resultSet.getString("nome"),
					resultSet.getFloat("preco")
			));
			
		}
		resultSet.close();
		statement.close();
		
		
		return produtos;
	}

	@Override
	public Produto buscarPorId(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Produto produto) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
