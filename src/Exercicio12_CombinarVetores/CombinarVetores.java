package Exercicio12_CombinarVetores;

import java.util.Arrays;
import java.util.Random;

public class CombinarVetores {
    public static final int TAM = 50;

    public static void ordenar(int[] vetor) {

        int aux = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public static void gerarAleatorio(int[] vetor) {
        Random aleatorio = new Random();
        for (int count = 0; count < vetor.length; count++) {
            vetor[count] = aleatorio.nextInt(vetor.length) + 1;
            System.out.printf("%d ", vetor[count]);
        }
        System.out.println();
    }

    public static void mostrar(int[] vetor) {
        for (int count = 0; count < vetor.length; count++) {
            System.out.printf("%d ", vetor[count]);
        }
        System.out.println();
    }

    public static void combinar(int[] vetor1, int[] vetor2) {
        int[] vetor3 = new int[vetor1.length + vetor2.length];
        System.arraycopy(vetor1, 0, vetor3, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetor3, vetor1.length, vetor2.length);
        ordenar(vetor3);
        System.out.println(Arrays.toString(vetor3));
    }

//        Primeiro argumento é o array que quer concatenar
//        Quarto é em qual posição comecará a cópia.
//        Quinto é o tamanho do array passado.

    public static void main(String[] args) {
        int[] vetor1 = new int[TAM];
        int[] vetor2 = new int[TAM];

        System.out.println("Primeiro vetor: ");
        gerarAleatorio(vetor1);
        ordenar(vetor1);
        System.out.println("Vetor ordenado: ");
        mostrar(vetor1);

        System.out.println();

        System.out.println("Segundo vetor: ");
        gerarAleatorio(vetor2);
        ordenar(vetor2);
        System.out.println("Vetor ordenado: ");
        mostrar(vetor2);

        System.out.println();

        System.out.println("Vetores combinados: ");
        combinar(vetor1, vetor2);
    }
}
