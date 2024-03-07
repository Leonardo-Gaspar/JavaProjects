package br.com.fiap.exercicio.cp.Produto;


public class ItemComanda extends Produto {
	private Produto produto;
	private int qtdProdutos;
	
	public ItemComanda(Produto produto, int qtdProdutos) {
		super(produto.getCodigo(), produto.getDescricao(), produto.getPrecoUnitario());
		this.produto = produto;
		this.qtdProdutos= qtdProdutos;
	}
	

	public float calcularPreco() {
		return produto.getPrecoUnitario() * qtdProdutos;
	}
	
	public void ImprimirDados() {
		produto.ImprimirDados();
		
		System.out.println("Valor final: " + calcularPreco());
	}
}

