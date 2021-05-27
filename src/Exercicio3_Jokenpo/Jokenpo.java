package Exercicio3_Jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static final int PEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TESOURA = 3;

    public static void jogarJokenpo(int jogador) {
        int maquina;
        Random aleatorio = new Random();
        maquina = aleatorio.nextInt(TESOURA) + 1; //Gera um número entre 1 e 3.

        if (maquina == PEDRA) {
            if (jogador == PEDRA){
                System.out.println("Empate!!!\n");
            }
            else if (jogador == PAPEL) {
                System.out.println("Jogador venceu!!!\n");
            }
            else if (jogador == TESOURA) {
                System.out.println("Máquina venceu!!!\n");
            }
            else {
                System.out.println("Opção inválida!\n");
            }
        }

        if (maquina == PAPEL) {
            if (jogador == PAPEL){
                System.out.println("Empate!!!\n");
            }
            else if (jogador == PEDRA) {
                System.out.println("Máquina venceu!!!\n");
            }
            else if (jogador == TESOURA) {
                System.out.println("Jogador venceu!!!\n");
            }
            else {
                System.out.println("Opção inválida!\n");
            }
        }

        if (maquina == TESOURA) {
            if (jogador == TESOURA){
                System.out.println("Empate!!!\n");
            }
            else if (jogador == PEDRA) {
                System.out.println("Jogador venceu!!!\n");
            }
            else if (jogador == PAPEL) {
                System.out.println("Máquina venceu!!!\n");
            }
            else {
                System.out.println("Opção inválida!\n");
            }
        }

        System.out.print("******************\n");
        System.out.printf("Jogador jogou %d! \n", jogador);
        System.out.printf("Maquina jogou %d!\n", maquina);
        System.out.print("******************\n");
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("****Jokenpo****");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");

        System.out.print("Digite uma opção: ");
        int jogador = teclado.nextInt();

        jogarJokenpo(jogador);
    }
}
