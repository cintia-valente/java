import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
	public static final int MIN = 1;
	public static final int MAX = 10;
	public static final int NUM= 100;

	public static void main (String[] args)
	{
		int numero;
		Random aleatorio = new Random();
		
		for (numero = MIN; numero <= MAX; numero++) {
			System.out.printf("%d ", aleatorio.nextInt(NUM) + 1); 
		} 
	}
}