package mvc_dao_db.model.dao;

import java.sql.SQLException;
import java.util.List;

import mvc_dao_db.model.vo.Produto;

public interface ProdutoDAO {
	
	public void inserir(Produto produto) throws SQLException;
	public List<Produto> listar() throws SQLException;
	public Produto buscarPorId(int id) throws SQLException;
	public void atualizar(Produto produto) throws SQLException;
	public void deletar(int id) throws SQLException;
	
	

} 
