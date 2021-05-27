package Exercicio17_Arvore;

public class Main {

    public static void main(String[] args) {

        Mae mae1 = new Mae("Maria", 50, new Pai("Joao", 75), new Mae("Teresa", 70));
        Mae mae2 = new Mae("Marina", 55, new Pai("Joaquim", 80), new Mae("Eva", 78));

        Pai pai1 = new Pai("José", 45, new Pai("Jonas", 65), new Mae("Ana", 80));
        Pai pai2 = new Pai("Paulo", 52, new Pai("Jorge", 68), new Mae("Solange", 85));

        mae1.mostrarDados();
        mae2.mostrarDados();
        System.out.println();
        pai1.mostrarDados();
        pai2.mostrarDados();
    }
}
