package Exercicio15_CalculadoraComMetodos;

import java.util.Scanner;

public class Calculadora2 {

    public static void somar(float n1, float n2) {

        System.out.printf("Resultado da soma = %.2f", (n1 + n2));
    }

    public static void subtrair(float n1, float n2) {

        System.out.printf("Resultado da subtração = %.2f", (n1 - n2));
    }

    public static void multiplicar(float n1, float n2) {

        System.out.printf("Resultado da multiplicação= %.2f", (n1 * n2));
    }

    public static void dividir(float n1, float n2) {

        System.out.printf("Resultado da divisão = = %.2f", (n1 / n2));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("***Operações***");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Informe uma opção: ");
        int opcao = teclado.nextInt();

        System.out.print("Digite o primeiro valor: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float n2 = teclado.nextFloat();

        if (opcao == 1) {
            somar(n1, n2);
        }
        else if (opcao == 2) {
            subtrair(n1, n2);
        }
        else if (opcao == 3) {
            multiplicar(n1, n2);
        }
        else if (opcao == 4) {
            dividir(n1, n2);
        }
        else
            System.out.println("Opção inválida!");
    }
}
