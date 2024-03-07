package br.com.fiap.exercicio.cp.Produto;

import java.util.ArrayList;

public class Comanda extends ItemComanda{

	private ArrayList <ItemComanda>listaItens;


	public Comanda(int codigo, String descricao, float precoUnitario) {
		super(new Produto(codigo, descricao, precoUnitario), codigo);
		listaItens = new ArrayList<ItemComanda>();
	}
	
	public void registrarItem(ItemComanda item) {
		listaItens.add(item);
	}
	
	public float calcularValorTotal() {
        float total = 0;
        for (ItemComanda item : listaItens) {
            total += item.calcularPreco();
        }
        return total;
    }

    public void imprimirDados() {
        for (ItemComanda item : listaItens) {
            item.ImprimirDados();
        }
        System.out.println("Valor Total da Compra: " + calcularValorTotal());
    }

	
}
