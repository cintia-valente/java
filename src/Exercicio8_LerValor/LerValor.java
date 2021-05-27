package Exercicio8_LerValor;

import java.util.Scanner;

public class LerValor {

    public static void main(String[] args) {

        int num = 1;

        while (num !=  10){
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            num = teclado.nextInt();
        }
    }
}
