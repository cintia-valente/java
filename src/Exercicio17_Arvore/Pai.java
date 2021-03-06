package Exercicio17_Arvore;

public class Pai extends Pessoa{

    Pai pai;
    Mae mae;

    public Pai(String nome, int idade) {
        super(nome, idade);
    }

    public Pai(String nome, int idade, Pai pai, Mae mae){
        super(nome, idade);
        this.pai = pai;
        this.mae = mae;
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
        return this.getNome() + " " + this.getIdade() + " " + this.pai.getNome() + " " + this.pai.getIdade()
                + " " + this.mae.getNome() + " " + this.mae.getIdade();
    }
}
