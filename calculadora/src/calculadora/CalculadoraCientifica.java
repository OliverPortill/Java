package calculadora;

public class CalculadoraCientifica extends Calculadora {
	//atributos
	String historial;
	
	//constructor
	public CalculadoraCientifica(){
		super(); //llamar al constructor de la Calculadora
		this.historial = "";
		
	}
	
	//metodos 
	
	public double getPotencia() {
		float base = super.num1;
		float exponente = super.num2;
		super.resultado = Math.pow(base, exponente);
		this.historial += "\nLa potencia es: " + base + " E " + exponente + " = " + super.resultado;
		return 	super.resultado;
	}
	
	public double getRaiz() {
		float base = super.num1;
		float raiz = super.num2;
		super.resultado = Math.pow(base, 1.0/raiz);
		this.historial += "\nLa raiz es: " + base + " E " + raiz + " = " + super.resultado;
		return 	super.resultado;
	}
}
