package Exercicio9_LimiteFibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void limiteFibonacci(int num) {

        int f0 = 0;
        int f1 = 1;
        int aux;

        do {
            aux = f0;
            f0 = f0 + f1;
            f1 = aux;

            System.out.printf("%d ", f1);
        } while (f0 <= num);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = teclado.nextInt();
        limiteFibonacci(num);
    }
}
