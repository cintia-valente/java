package Exercicio19_Supermercado;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(5.75, 100, "Arroz", 5);
        Item item = new Item(5.75, 100, "Arroz", 5);
        Produto produto = new Produto(5.75, 100, "Arroz");
        Cliente cliente = new Cliente("Cíntia");

        item.especificarProdutoEQuantidade();
        pedido.calcularValorTotal();
    }
}
