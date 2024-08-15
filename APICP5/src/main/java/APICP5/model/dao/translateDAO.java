package APICP5.model.dao;

import java.sql.SQLException;
import java.util.List;

import APICP5.model.vo.Translate;


public interface translateDAO {
	
	public abstract void salvar(Translate translate) throws SQLException;	
	public List<Translate> listarTranslate() throws SQLException;	
	public Translate buscarPorId(int id_translate) throws SQLException;	
	
}
