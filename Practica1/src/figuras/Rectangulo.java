package figuras;

public class Rectangulo extends figuras{
	private float lado,ancho;
	
	public Rectangulo(float l, float a) {
		this.lado = l;
		this.ancho = a;
	}
	
	public double getArea() {
		return this.lado * this.ancho;
	}
}