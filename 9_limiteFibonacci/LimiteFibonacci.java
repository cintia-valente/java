import java.util.Scanner;

public class LimiteFibonacci {
	public static void main (String[] args)
	{
		int f0 = 0;
		int f1 = 1;
		int aux;
		int valor;
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor maximo: "); 
		valor = scan.nextInt();
		
		do {
			aux = f0;
			f0 = f0 + f1;
			f1 = aux;
			
			System.out.printf("%d ", f1); 
		} while (f0 <= valor);
	}
}