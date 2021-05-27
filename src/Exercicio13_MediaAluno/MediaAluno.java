package Exercicio13_MediaAluno;

public class MediaAluno {

    public static float calcularMedia(float nota1, float nota2) {

        float media = (nota1 + nota2) / 2;
        return media;
    }

    public static void informarStatus(float nota1, float nota2) {
        float resultado = calcularMedia(nota1, nota2);

        if (resultado > 6) {
            System.out.println("Aprovado :)");
        }
        else if (resultado >= 4 && resultado <= 6) {
            System.out.println("Verificação Suplementar!");
        }
        else {
            System.out.println("Reprovado :(");
        }
    }

    public static void main(String[] args) {
        System.out.println("Media = " + calcularMedia(7.5f, 6.3f));
        informarStatus(7.5f, 6.3f);
    }
}
