package Exercicio18_FiguraGeometrica;

public class Triangulo extends Forma{

    private float base;

    public Triangulo(float base, float altura) {
        super((int) altura);
        this.base = base;
    }

    public void calcularAreaTriangulo() {
        float area = (base * getAltura()) /2;
        System.out.println(area);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
