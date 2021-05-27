package Exercicio16_Emprestimo;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Cíntia", "735783832");
        Pessoa pessoa2 = new Pessoa("Gabriel", "5464t3346");

        Emprestimo emprestimo1 = new Emprestimo("Cíntia", false);
        Emprestimo emprestimo2 = new Emprestimo("Gabriel", true);

        Livro livro1 = new Livro("It - A Coisa - ",  "Stephen King");
        Livro livro2 = new Livro("A culpa é das estrelas - ", "John Green");
        Livro livro3 = new Livro("A máquina do tempo - ", "H. G. Wells");

        System.out.println("              ***Livros***");
        System.out.println("Terror: ");
        livro1.listarLivros();
        System.out.println("Romance: ");
        livro2.listarLivros();
        System.out.println("Ficção científica: ");
        livro3.listarLivros();

        System.out.println();

        pessoa1.selecionarLivro();
        pessoa2.selecionarLivro();

        System.out.println();

        emprestimo1.verificaStatus();
        emprestimo2.verificaStatus();
    }
}
