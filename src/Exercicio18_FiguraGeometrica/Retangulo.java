package Exercicio18_FiguraGeometrica;

public class Retangulo extends Forma{

    private float base;

    public Retangulo(float base, float altura) {
        super((int) altura);
        this.base = base;
    }

    public void calcularAreaRetangulo() {
        float area = this.base * getAltura();
        System.out.println(area);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
