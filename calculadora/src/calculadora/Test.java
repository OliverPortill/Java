package calculadora;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//declarar la calculadora normal
		
		Calculadora CasioSimple;  //declarar 
		CalculadoraCientifica CasioCientifica;
		
		CasioSimple = new Calculadora(); 		//iniciar
		CasioCientifica = new CalculadoraCientifica();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("   Calculadora");
		System.out.println("-----------------");
		System.out.println("Escriba un número: ");
		float valor1 = sc.nextFloat();
		System.out.println("Escriba otro número: ");
		float valor2 = sc.nextFloat();
		
		CasioSimple.setNumeros(valor1, valor2);   //el metodo setNumeros recibe dos numeros 
		CasioCientifica.setNumeros(valor1, valor2);
		//imprimir la suma 
		System.out.println("   Resultados");
		System.out.println("-----------------");
		System.out.println("La suma es: " + CasioSimple.getSuma());
		System.out.println("La resta es: " + CasioSimple.getResta());
		System.out.println("El producto es: " + CasioSimple.getProducto());
		System.out.println("La división es: " + CasioSimple.getDivision());
		
		System.out.println("La potencia es: " + CasioCientifica.getPotencia());
		System.out.println("La raiz es: " + CasioCientifica.getRaiz());
		
		System.out.println("\n----------------");
		System.out.println("  Historial");
		System.out.println("----------------");
		System.out.println(CasioCientifica.historial);
		
	}

}
