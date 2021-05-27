package Exercicio18_FiguraGeometrica;

public class Quadrado extends Forma{

    private int base;

    public Quadrado(int base, float altura) {
        super((int) altura);
        this.base = base;
    }

    public void calcularAreaQuadrado() {
        float area = this.base * getAltura();
        System.out.println(area);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
