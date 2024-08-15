package CRUD;

import java.sql.SQLException;

public class TestCrud {

	public static void main(String[] args) throws SQLException {

		// Criando um gerenciador
		GerenciadorDeClientes gc = new GerenciadorDeClientes();

		// Criando um cliente
		Cliente c1 = new Cliente(1, "Givanildo", "Antunes");
//			System.out.println(gc.inserir(new Cliente(1, "Givanildo", "Antunes")));

		System.out.println(gc.inserir(c1) ? "Cliente adicionado" : "Cliente Não adicionado");

	}

}
