package operaciones;

import java.util.Scanner;

public class Comparacion {
	public static void main( String[] args) {
	
		Scanner sc = new Scanner( System.in );
	
		int numero1;
		int numero2; 
		
		System.out.println("Comparación de dos números");
		System.out.println("-----------------------");
		
	
		System.out.print( "Escriba el primer entero: " ); 
		numero1 = sc.nextInt(); 
	
		System.out.print("Escriba el segundo entero: ");
		numero2 = sc.nextInt();
	
		if ( numero1 == numero2 )
		System.out.printf( "Esto números son iguales: %d == %d\n", numero1, numero2 );
	
		if ( numero1 != numero2 )
		System.out.printf( "Esto números son distintos: %d != %d\n", numero1, numero2 );
	
		if ( numero1 < numero2 )
		System.out.printf( "El primer entero es menor al segundo entero: %d < %d\n", numero1, numero2 );
	
		if ( numero1 > numero2 )
		System.out.printf( "El primer entero es mayor al segundo entero:%d > %d\n", numero1, numero2 );
	
		if ( numero1 <= numero2 )
		System.out.printf( "El primer entero es menor o igual al segundo entero:%d <= %d\n", numero1, numero2 );
		if ( numero1 >= numero2 )
		System.out.printf( "El primer entero es mayor o igual al segundo entero:%d >= %d\n", numero1, numero2 );
	
	}
}