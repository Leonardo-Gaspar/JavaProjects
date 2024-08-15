package APICP5.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import APICP5.CRUD.Credenciais;
import APICP5.controller.ControllerTranslate;
import APICP5.model.vo.Translate;

public class translateDAOImpl {
	
	private Connection getConnection() {

		try {
			return DriverManager.getConnection(ControllerTranslate.url, Credenciais.user, Credenciais.pwd);
	}catch (SQLException ex) {
		throw new RuntimeException(ex);
	 }
	}
	public void salvar(Translate translate) {
		Connection conn = getConnection();
		try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO T_TRANSLATE_PHRASES (id_translate, texto_translate, traducao_translate, lingua_translate) VALUES (?, ?, ?, ?)")) {
			stmt.setInt(1, translate.getId_translate());
			stmt.setString(2, translate.getTexto_translate());
			stmt.setString(3, translate.getTraducao_translate());
			stmt.setString(4, translate.getLingua_translate());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao inserir compraCurso", e);
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Translate buscarPorId(int id_translate) {
	    Translate translate = null;
	    Connection conn = getConnection();
	    try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM T_TRANSLATE_PHRASES WHERE id_translate = ?")) {
	        stmt.setInt(1, id_translate);
	        try (ResultSet rs = stmt.executeQuery()) {
	            if (rs.next()) {
	                int idTranslate = rs.getInt("id_translate");
	                String textoTranslate = rs.getString("texto_translate");
	                String traducaoTranslate = rs.getString("traducao_translate");
	                String linguaTranslate = rs.getString("lingua_translate");
	                
	                translate = new Translate(idTranslate, textoTranslate, traducaoTranslate, linguaTranslate);
	            }
	        }
	    } catch (SQLException e) {
	        throw new RuntimeException("Erro ao buscar translate por ID", e);
	    }
	    try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return translate;
	}
	public List<Translate> listarTranslate(){
		List<Translate> translate = new ArrayList<>();
		Connection conn = getConnection();
		try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM T_TRANSLATE_PHRASES");
			 ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				int idTranslate = rs.getInt("id_translate");
				String textoTranslate = rs.getString("texto_translate");
				String traducaoTranslate = rs.getString("traducao_translate");
				String linguaTranslate = rs.getString("lingua_translate");
			}
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao listar T_COMPRA_CURSO", e);
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return translate;
	}
}
