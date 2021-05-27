package Exercicio5_Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void tabuada(int num) {

        int resultado;
        for (int count = MIN; count <= MAX; count ++) {
            resultado = num * count;

            System.out.printf("%d * %d = %d\n", num, count, resultado);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = teclado.nextInt();

        tabuada(valor);
    }
}
