import java.util.Scanner;
public class MaiorDeIdade {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe sua idade: "); 
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.print("Voce eh maior de idade!"); 
		} else {
			System.out.print("Voce eh menor de idade!"); 
		}
	}
}