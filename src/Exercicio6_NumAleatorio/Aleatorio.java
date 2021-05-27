package Exercicio6_NumAleatorio;

import java.util.Random;

public class Aleatorio {
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int TAM = 10;

    public static void gerarNumerosAleatorios() {

        int vetor[] = new int[TAM];
        int maior = vetor[0];
        Random aleatorio = new Random();

        for (int count = MIN; count < TAM; count++) {
            vetor[count] = aleatorio.nextInt(MAX) + 1;
            System.out.printf("%d ", vetor[count]);
        }

        int menor = vetor[0];
        for (int count = MIN; count < TAM; count++)  {
            if (vetor[count] < menor) {
                menor = vetor[count];
            }

            if (vetor[count] > maior) {
                maior = vetor[count];
            }
        }

        System.out.print("\nO menor valor é " + menor);
        System.out.print("\nO maior valor é " + maior);
        }

    public static void main(String[] args) {
        gerarNumerosAleatorios();
    }
}
