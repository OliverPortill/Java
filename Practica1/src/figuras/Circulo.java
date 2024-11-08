package figuras;

public class Circulo extends figuras {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getArea() {
        return Math.PI * radio * radio;
    }


    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}
