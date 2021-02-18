import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
	public static final int MIN = 0;
	public static final int MAX = 100;
	public static final int TAM= 10;

	public static void main (String[] args)
	{
		int i;
		int vetor[] = new int[TAM];;
		int menor = vetor[0];
		int maior = vetor[0];
		Random aleatorio = new Random();
		
		for (i = MIN; i < TAM; i++) {
			vetor[i] = aleatorio.nextInt(MAX) + 1;
			System.out.printf("%d ", vetor[i]);
		}
		
		for (i = MIN; i < TAM; i++) {
			menor = vetor[0];
			if (vetor[i] < menor){
				menor = vetor[i];
			}
			
			if (vetor[i] > maior){
				maior = vetor[i];
				
			}
		}
		System.out.printf("\nMenor = %d\n", menor);
		System.out.printf("Maior = %d", maior);
	}
}