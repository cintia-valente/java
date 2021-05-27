package Exercicio18_FiguraGeometrica;

public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4, 2);
        Circulo circulo = new Circulo(3, 6);
        Retangulo retangulo = new Retangulo(5, 3);
        Triangulo triangulo = new Triangulo(4, 6);

        quadrado.calcularAreaQuadrado();
        circulo.calcularAreaCirculo();
        retangulo.calcularAreaRetangulo();
        triangulo.calcularAreaTriangulo();
    }
}
