package Exercicio18_FiguraGeometrica;

public class Circulo {
    public static final float PI = 3.14f;

    private float raio;

    public Circulo(int raio, float altura) {
        super((int) altura);
        this.raio = raio;
    }

    public void calcularAreaCirculo() {
        float area = this.PI * (this.raio * this.raio);
        System.out.println(area);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
