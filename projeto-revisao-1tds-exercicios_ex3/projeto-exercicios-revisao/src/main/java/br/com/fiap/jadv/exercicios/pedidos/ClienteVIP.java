package br.com.fiap.jadv.exercicios.pedidos;

public class ClienteVIP extends Cliente {
	private NivelClienteVIP nivel;
	
	public ClienteVIP(String nome, String email, String cpf) {
		super(nome, email, cpf);
	}
	
	public NivelClienteVIP getNivel() {
		return nivel;
	}
	
	public void setNivel(NivelClienteVIP nivel) {
		this.nivel = nivel;
	}
}
