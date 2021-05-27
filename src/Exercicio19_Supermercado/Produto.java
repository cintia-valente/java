package Exercicio19_Supermercado;

public class Produto {

    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto(double preco, int qtdEstoque, String nome) {
        this.preco = (float) preco;
        this.qtdEstoque = qtdEstoque;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
