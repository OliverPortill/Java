package figuras;

class TrianguloRectangulo extends Triangulo {
    // Constructor
    public TrianguloRectangulo(double base, double altura) {
        super(base, altura, base, altura, Math.sqrt((base * base) + (altura * altura))); 
    }
}