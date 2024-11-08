package operaciones;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		int numero1; 
		int numero2; 
		int suma; 
		
		System.out.println("Suma de dos números");
		System.out.println("---------------------");
		
		
		System.out.print( "Escriba el primer entero: " );
		numero1 = sc.nextInt(); 
		
		System.out.print( "Escriba el segundo entero: " ); 
		numero2 = sc.nextInt(); 
		
		suma = numero1 + numero2; 
		
		System.out.printf( "La suma es: " + suma ); 
	} 
} 