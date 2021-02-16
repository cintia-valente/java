import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String[] args)
	{
		int f0 = 0;
		int f1 = 1;
		int aux;
		int numero;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: "); 
		numero = scan.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			aux = f0;
			f0 = f0 + f1;
			f1 = aux;
			
			System.out.printf("%d ", f1); 
		}
	}
}