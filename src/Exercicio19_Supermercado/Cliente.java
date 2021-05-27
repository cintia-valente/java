package Exercicio19_Supermercado;

import java.util.Scanner;

public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int escolherFormaDePagamento() {
        System.out.println("***Formas de Pagamento***");
        System.out.println("1- Dinheiro");
        System.out.println("2- Cheque");
        System.out.println("3- Cartão");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a forma de pagamento: ");
        int formaPagamento = teclado.nextInt();
        return formaPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
