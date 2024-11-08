package figuras;

public class Triangulo extends figuras {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Constructor
    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }


    public double getArea() {
        return (base * altura) / 2;
    }
    public double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
