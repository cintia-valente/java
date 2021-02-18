import java.util.Scanner;

public class Matriz {
	public static final int LIN = 3;
	public static final int COL = 3;

	public static void main (String[] args)
	{
		int linha, coluna;
		int matriz[][] = new int[LIN][COL];
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for (linha = 0; linha < LIN; linha++) {
			for (coluna = 0; coluna < COL; coluna++){
				System.out.print("Informe os valores da matriz: "); 
				matriz[linha][coluna] = scan.nextInt();
				
				if (linha == coluna) {
					soma = soma + matriz[linha][coluna];
				} 
			}
		}
		
		for (linha = 0; linha < LIN; linha++) { 
			for (coluna = 0; coluna < COL; coluna++){
				System.out.print("["+matriz[linha][coluna]+"]"); 
			}
			System.out.print("\n");
		}
		
		System.out.printf("Soma da diagonal principal= %d", soma);
	}
}