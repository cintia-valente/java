import java.util.Scanner;

public class Digite10 {
	public static final int MAX = 10;

	public static void main (String[] args)
	{
		int numero;
		
		numero = 0;
		while (numero != MAX) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Digite um numero: "); 
			numero = scan.nextInt();
		}
	}
}