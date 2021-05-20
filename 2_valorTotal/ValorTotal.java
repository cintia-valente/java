import java.util.Scanner;
public class ValorTotal {

	public static void main (String[] args)
	{
		String nome;
		float preco;
		int quantidade;
		double valorTotal;
		double valorDesconto;
		double total;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o nome do produto: "); 
		nome = scan.nextLine();
		
		System.out.print("Informe o preco do produto: "); 
		preco = scan.nextFloat();
		
		System.out.print("Informe a quantidade de produto: "); 
		quantidade = scan.nextInt();
		
		if (quantidade <= 10) {
			valorTotal = (quantidade * preco);
			System.out.println("Produto= " + nome);
			System.out.println("Valor total=  " + valorTotal);
		}
		
		else if (quantidade <= 20) {
			valorTotal = (quantidade * preco);
			valorDesconto = valorTotal * 0.10;
			total = valorTotal - valorDesconto;
			System.out.println("Produto= " + nome);
			System.out.println("Valor total=  " + total);
		}
		
		else if (quantidade <= 50) {
			valorTotal = (quantidade * preco);
			valorDesconto = valorTotal * 0.20;
			total = valorTotal - valorDesconto;
			System.out.println("Produto= " + nome);
			System.out.println("Valor total=  " + total);
		}
		
		else {
			valorTotal = (quantidade * preco);
			valorDesconto = valorTotal * 0.25;
			total = valorTotal - valorDesconto;
			System.out.println("Produto= " + nome);
			System.out.println("Valor total=  " + total);
		}
	}
}
