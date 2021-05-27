package Exercicio19_Supermercado;

import java.util.Scanner;

public class Item extends Produto{

    private int quantidade;

    public Item(double preco, int qtdEstoque, String nome, int quantidade) {
        super(preco, qtdEstoque, nome);
        this.quantidade = quantidade;
    }

    public void especificarProdutoEQuantidade() {
        System.out.println("Produto: " + " " + getNome() + " " + getPreco());
        System.out.println("Estoque: " + " " + getQtdEstoque());
        System.out.println("Quantidade pedida pelo(a) cliente: " + getQuantidade());
        System.out.println();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
