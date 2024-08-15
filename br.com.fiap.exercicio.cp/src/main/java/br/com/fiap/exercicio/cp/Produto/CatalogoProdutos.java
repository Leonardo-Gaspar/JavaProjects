package br.com.fiap.exercicio.cp.Produto;

import java.util.ArrayList;

public class CatalogoProdutos {
	
	private ArrayList<Produto> listaProdutos;

    public CatalogoProdutos() {
        listaProdutos = new ArrayList<Produto>();
    }

    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : listaProdutos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void imprimirDados() {
        for (Produto produto : listaProdutos) {
            produto.ImprimirDados();
        }
    }

}
