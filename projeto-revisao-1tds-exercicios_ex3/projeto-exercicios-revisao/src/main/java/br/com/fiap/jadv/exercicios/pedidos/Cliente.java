package br.com.fiap.jadv.exercicios.pedidos;

public class Cliente {

	private String nome;
	private String email;
	private String cpf;
	
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
