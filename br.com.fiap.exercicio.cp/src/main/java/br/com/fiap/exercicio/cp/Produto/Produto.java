package br.com.fiap.exercicio.cp.Produto;

public class Produto {
	
	public static final String comanda = null;
	private int codigo;
	private String descricao;
	private float precoUnitario;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public Produto(int codigo, String descricao, float precoUnitario) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;	

	}
	public void ImprimirDados() {
		System.out.println("Codigo: " + codigo);
		System.out.println("descricao: " + descricao);
		System.out.println("precoUnitario: " + precoUnitario);
	}

}
