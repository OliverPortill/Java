package figuras;

public class Elipse extends figuras {
    private double semiMayor;
    private double semiMenor;

    public Elipse(double semiMayor, double semiMenor) {
        this.semiMayor = semiMayor;
        this.semiMenor = semiMenor;
    }

    public double getArea() {
        return Math.PI * semiMayor * semiMenor;
    }

    public double getPerimetro() {
 
        return Math.PI * (3 * (semiMayor + semiMenor) - Math.sqrt((3 * semiMayor + semiMenor) * (semiMayor + 3 * semiMenor)));
    }
}
