package Exercicio16_Emprestimo;

public class Emprestimo {

    String nomeUsuario;
    boolean reservado;

    public Emprestimo(String nomeUsuario, boolean reservado) {
        this.nomeUsuario = nomeUsuario;
        this.reservado = reservado;
    }

    public void verificaStatus() {

       if (!this.reservado){
           System.out.println("Empréstimo ralizado com sucesso!");
       }
       else {
           System.out.println("Este livro já está reservado, empréstimo não pode ser realizado!");
       }
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean status) {
        this.reservado = status;
    }
}
