package Exercicio14_Horas;

import java.util.Scanner;

public class Horas {
    public static final int HORA = 3600;
    public static final int MIN = 60;

    public static int lerSegundos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe os segundos: ");
        int seg = teclado.nextInt();
        return seg;
    }

    public static int converterParaHoras(int segundosTeclado) {
        return segundosTeclado / HORA;
    }

    public static int converterParaMinutos(int segundosTeclado) {
        int horas = converterParaHoras(segundosTeclado);
        int minutos = (segundosTeclado - (horas * HORA)) / MIN;
        return minutos;
    }

    public static int converterParaSegundos(int segundosTeclado) {
        int segundos = (segundosTeclado % MIN);
        return segundos;
    }

    public static void imprimirSegundos(int segundosTeclado) {
        int horas = converterParaHoras(segundosTeclado);
        int min = converterParaMinutos(segundosTeclado);
        int seg = converterParaSegundos(segundosTeclado);
        System.out.printf("%d : %d : %d", horas, min, seg);
    }

    public static void main(String[] args) {
        int segundosTeclado = lerSegundos();
        imprimirSegundos(segundosTeclado);
    }
}

//Resolução com atributo segundosTeclado ou variável da classe:
//public class x {
//    public static final int HORA = 3600;
//    public static final int MIN = 60;
//    public static int segundosTeclado;

//    public static void lerSegundos() {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Informe os segundos: ");
//        segundosTeclado = teclado.nextInt();
//    }
//    public static int converterParaHoras() {
//        return segundosTeclado / HORA;
//    }
//    public static int converterParaMinutos() {
//        int horas = converterParaHoras();
//        int minutos = (segundosTeclado - (horas * HORA)) / MIN;
//        return minutos;
//    }
//    public static int converterParaSegundos() {
//        int segundos = (segundosTeclado % MIN);
//        return segundos;
//    }
//    public static void imprimirSegundos() {
//        int horas = converterParaHoras();
//        int min = converterParaMinutos();
//        int seg = converterParaSegundos();
//        System.out.printf("%d : %d : %d", horas, min, seg);
//    }
//    public static void main(String[] args) {
//        lerSegundos();
//        imprimirSegundos();
//    }
//}


