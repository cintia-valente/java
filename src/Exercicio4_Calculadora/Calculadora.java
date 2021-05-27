package Exercicio4_Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void calcular(int operacao, float n1, float n2) {

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma = " + (n1 + n2));
                break;

            case 2:
                System.out.println("Resultado da subtração = " + (n1 - n2));
                break;

            case 3:
                System.out.println("Resultado da multiplicação = " + (n1 * n2));
                break;

            case 4:
                if (n1 == 1 && n2 == 0) {
                    System.out.println("Não existe divisão por zero");
                }
                System.out.println("Resultado da divisão = " + (n1 / n2));
                break;

            default:
                System.out.printf("Opção invalida!");
        }
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
        float n1 = teclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        float n2 = teclado.nextInt();

        calcular(opcao, n1, n2);
    }
}
