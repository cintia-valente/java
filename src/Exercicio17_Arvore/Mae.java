package Exercicio17_Arvore;

public class Mae extends Pessoa{

    Pai pai;
    Mae mae;

    public Mae(String nome, int idade) {
        super(nome, idade);
    }

    public Mae(String nome, int idade, Pai pai, Mae mae){
        super(nome, idade);
        this.pai = pai;
        this.mae = mae;
    }

    public void mostrarDados() {
        System.out.println(" " + nome + " " + idade + " " + pai.toString() + " " + mae.toString() + " ");
    }

    public Pai getPai() {

        return pai;
    }

    public void setPai(Pai pai) {

        this.pai = pai;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }

    public String toString() {
        return this.getNome() + " " + this.getIdade();
    }
}
