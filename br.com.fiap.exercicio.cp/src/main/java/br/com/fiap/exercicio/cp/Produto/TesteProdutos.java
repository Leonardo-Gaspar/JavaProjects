package br.com.fiap.exercicio.cp.Produto;

public class TesteProdutos {

	public static void main(String[] args) {
		
	   CatalogoProdutos catalogo = new CatalogoProdutos();
	   Produto p1 = new Produto(1, "Pão na Chapa", (float) 2.5);
	   Produto p2 = new Produto(2, "Café", (float)3.0);
	   catalogo.cadastrarProduto(p1);
	   catalogo.cadastrarProduto(p2);

	   Comanda comanda = new Comanda(0, null, 0);
	   ItemComanda item1 = new ItemComanda(p1, 2);
	   ItemComanda item2 = new ItemComanda(p2, 1);
	   comanda.registrarItem(item1);
	   comanda.registrarItem(item2);

	   comanda.imprimirDados();
	   }

}


