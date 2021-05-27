package Exercicio11_OrdenarVetor;

import java.util.Random;

public class OrdenaVetor {
    public static final int TAM = 100;

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
            vetor[count] = aleatorio.nextInt (vetor.length) + 1;
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

    public static void main(String[] args) {
        int[] vetor = new int [TAM];
        System.out.println("Vetor: ");
        gerarAleatorio(vetor);
        ordenar(vetor);
        System.out.println("Vetor ordenado: ");
        mostrar(vetor);
    }
}
