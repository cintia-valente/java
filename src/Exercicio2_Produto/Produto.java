package Exercicio2_Produto;

import java.util.Scanner;

public class Produto {

    public static void calcularValor(String nome, float preco, int quantidade) {
        double valorTotal;
        double valorDesconto;
        double total;

        if (quantidade <= 10) {
            valorTotal = (preco * quantidade);
            System.out.println("Produto= " + nome);
            System.out.printf("Valor total=  %.2f", valorTotal);
        } else if (quantidade <= 20) {
            valorTotal = (preco * quantidade);
            valorDesconto = valorTotal * 0.10;
            total = valorTotal - valorDesconto;
            System.out.println("Produto= " + nome);
            System.out.printf("Valor total=  %.2f", total);
        } else if (quantidade <= 50) {
            valorTotal = (preco * quantidade);
            valorDesconto = valorTotal * 0.20;
            total = valorTotal - valorDesconto;
            System.out.println("Produto= " + nome);
            System.out.printf("Valor total=  %.2f", total);
        } else {
            valorTotal = (preco * quantidade);
            valorDesconto = valorTotal * 0.25;
            total = valorTotal - valorDesconto;
            System.out.println("Produto= " + nome);
            System.out.printf("Valor total=  %.2f", total);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = teclado.nextLine();

        System.out.print("Informe o valor do produto: ");
        double valor = teclado.nextFloat();

        System.out.print("Informe a quantidade: ");
        int qtd = teclado.nextInt();

        calcularValor(nome, (float) valor, qtd);
    }
}
