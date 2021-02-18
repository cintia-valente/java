import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	public static final int TAM = 100;

	public static void main (String[] args)
	{
		int i, j;
		int aux;
		boolean controle;
		int vetor[] = new int[TAM];
		Scanner scan = new Scanner(System.in);
		Random aleatorio = new Random();
		
		for (i = 0; i < TAM; i++) {
			System.out.printf("%d ", aleatorio.nextInt(TAM) + 1); 
		}
		
		for (i = 0; i < TAM; i++) {
			for (j = 0; j < TAM-1; j++){
				if (vetor[i] > vetor[j+1]) {
					aux = vetor[i];
					vetor[i] = vetor[j+1];
					vetor[j+1] = aux;
				System.out.printf("Vetor ordenado: ");
				System.out.printf("%d ", vetor[i]);
				}
			}
		}
	}
}