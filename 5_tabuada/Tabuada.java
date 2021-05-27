import java.util.Scanner;

public class Tabuada {
	public static final int MIN = 0;
	public static final int MAX = 10;

	public static void main (String[] args)
	{
		
		int numero;
		int fator;
		int resultado;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: "); 
		numero = scan.nextInt();
		
		for(fator = MIN; fator <= MAX; fator++) {
			resultado = numero * fator;
			
		System.out.printf("%d * %d = %d\n", numero, fator, resultado); 
		}
	}
}