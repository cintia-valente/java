package Exercicio16_Emprestimo;

import java.util.Scanner;

public class Pessoa {

    public String nome;
    public String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void selecionarLivro() {

        System.out.println("1- Terror");
        System.out.println("2- Romance");
        System.out.println("3- Ficção Científica");

        System.out.print("Informe uma opção: ");
        Scanner teclado = new Scanner(System.in);
        teclado.nextInt();

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
