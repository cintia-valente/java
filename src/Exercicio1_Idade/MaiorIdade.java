package Exercicio1_Idade;

import java.util.Scanner;

public class MaiorIdade {

    public static void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é a sua idade? ");
        int idade = teclado.nextInt();

        verificarIdade(idade);
    }

}
