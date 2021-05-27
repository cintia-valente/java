package Exercicio7_Fibonacci;

import java.util.Scanner;

public class FibonacciNumInteiroNaoNegativo {

    public static void calcularFibonacci(int num) {

        int f0 = 0;
        int f1 = 1;
        int aux;

        for (int count = 0; count <= num; count++) {
            aux = f0;
            f0 = f0 + f1;
            f1 = aux;

            System.out.printf("%d ", f1);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = teclado.nextInt();

        calcularFibonacci(valor);
    }
}
