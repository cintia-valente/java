import java.util.Scanner;

public class Calculadora {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int operacao;
		double valor_1;
		double valor_2;
		
		System.out.print("****Calculadora****\n");
		System.out.print("1. soma\n");
		System.out.print("2. subtracao\n");
		System.out.print("3. multiplicacao\n");
		System.out.print("4. divisao\n");
		
		System.out.print("\nDigite uma opcao: ");
	    operacao = scan.nextInt();
		
		System.out.print("\nDigite o primeiro valor: ");
		valor_1 = scan.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		valor_2 = scan.nextDouble();
		
		switch (operacao) {
			case 1:  
				System.out.printf("Resultado= %.2f\n", valor_1 + valor_2);
				break;
			
			case 2:  
				System.out.printf("Resultado= %.2f\n", valor_1 - valor_2);
				break;
			
			case 3:  
				System.out.printf("Resultado= %.2f\n", valor_1 * valor_2);
				break;
			
			case 4:  
				System.out.printf("Resultado= %.2f\n", valor_1 / valor_2);
				break;
			
			default: 
				System.out.printf("Operacao invalida!");
		}
	}	
}