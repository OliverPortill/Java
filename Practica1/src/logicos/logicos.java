package logicos;

import java.util.Scanner;

	public class logicos{
		public static void main(String[] args) {
		//variables
			int edad;
			String nombre;
			
			//objeto Scanner ()
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ingrese los datos en los siguiente items.");
			System.out.println("--------------------------------------\n");
			
			System.out.println("Ingrese su nombre: ");
			nombre = sc.nextLine();
			
			System.out.println("Ingrese su edad: ");
			edad = sc.nextInt();
			
			System.out.println("\nResultado.");
			System.out.println("--------------------------------------\n");
			
			if (edad >= 18 && edad <=90) {
				System.out.println("- " + nombre + " eres mayor de edad.");
			}else if (edad < 18 && edad > 0) {
				System.out.println("- " + nombre + " eres menor de edad.");
			}else{
				System.out.println("Los datos ingresados son erroneos");
		}
	}
}