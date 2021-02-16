import java.util.Scanner;
public class ValorTotal {

	public static void main (String[] args)
	{
		String nome;
		float preco;
		int quantidade;
		double valor_total;
		double valor_desconto;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o nome do produto: "); 
		nome = scan.nextLine();
		
		System.out.print("Informe o preco do produto: "); 
		preco = scan.nextFloat();
		
		System.out.print("Informe a quantidade de produto: "); 
		quantidade = scan.nextInt();
		
		if (quantidade <= 10) {
			valor_total = quantidade * preco;
			System.out.println("Produto= " + nome);
			System.out.printf("Valor total=  %.2f ", valor_total);
		}
		
		else if (quantidade <= 20) {
			valor_desconto = (quantidade * preco) * 0.10;
			System.out.println("Produto= " + nome);
			System.out.printf("Valor total=  %.2f ", valor_desconto);
		}
		
		else if (quantidade <= 50) {
			valor_desconto = (quantidade * preco) * 0.20;
			System.out.println("Produto= " + nome);
			System.out.printf("Valor total=  %.2f ", valor_desconto);
		}
		
		else {
			valor_desconto = (quantidade * preco) * 0.25;
			System.out.println("Produto= " + nome);
			System.out.printf("Valor total=  %.2f ", valor_desconto);
		}
	}
}