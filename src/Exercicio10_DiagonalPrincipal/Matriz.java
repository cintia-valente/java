package Exercicio10_DiagonalPrincipal;

public class Matriz {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 5}, {2, 6, 1}, {1, 6, 1}};
        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
                if (linha == coluna)
                    soma += matriz[linha][coluna];
            }
            System.out.println();
        }
        System.out.println("Soma = " + soma);
    }
}
