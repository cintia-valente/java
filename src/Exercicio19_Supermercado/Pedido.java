package Exercicio19_Supermercado;

public class Pedido extends Item{

    Cliente cliente = new Cliente("Cíntia");

    public Pedido(double preco, int qtdEstoque, String nome, int quantidade) {
        super(preco, qtdEstoque, nome, quantidade);
    }

    public void calcularValorTotal() {
        int opcao = cliente.escolherFormaDePagamento();

        if (opcao == 1) {
            float total = getPreco() * getQuantidade();
            System.out.printf("Valor total: %.2f", total);
        }
        else if (opcao == 2) {
            float total = (float) ((getPreco() * getQuantidade()) * 1.10);
            System.out.printf("Valor total: %.2f", total);

        }
        else if (opcao == 3) {
            float total = (float) ((getPreco() * getQuantidade()) * 1.20);
            System.out.printf("Valor total: %.2f", total);
        }
        else {
            System.out.println("Opção inválida!");
        }
    }
}
