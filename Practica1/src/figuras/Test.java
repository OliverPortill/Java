package figuras;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo: ");
        float baseRect = sc.nextFloat();
        System.out.println("Ingrese la altura del rectángulo: ");
        float alturaRect = sc.nextFloat();
        Rectangulo r = new Rectangulo(baseRect, alturaRect);

        System.out.println("Ingrese el lado del cuadrado: ");
        float ladoCuadrado = sc.nextFloat();
        Cuadrado c = new Cuadrado(ladoCuadrado);

        System.out.println("Ingrese la base del triángulo: ");
        double baseTriangulo = sc.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        double alturaTriangulo = sc.nextDouble();
        System.out.println("Ingrese el lado A del triángulo: ");
        double ladoA = sc.nextDouble();
        System.out.println("Ingrese el lado B del triángulo: ");
        double ladoB = sc.nextDouble();
        System.out.println("Ingrese el lado C del triángulo: ");
        double ladoC = sc.nextDouble();
        Triangulo t = new Triangulo(baseTriangulo, alturaTriangulo, ladoA, ladoB, ladoC);

        System.out.println("Ingrese el radio del círculo: ");
        double radioCirculo = sc.nextDouble();
        Circulo cir = new Circulo(radioCirculo);

        System.out.println("Ingrese el semieje mayor de la elipse: ");
        double semiMayorElipse = sc.nextDouble();
        System.out.println("Ingrese el semieje menor de la elipse: ");
        double semiMenorElipse = sc.nextDouble();
        Elipse elip = new Elipse(semiMayorElipse, semiMenorElipse);

        System.out.println("\n---------------------");
        System.out.println("Posibles resultados");
        System.out.println("---------------------");

        System.out.println("El área del rectángulo es: " + r.getArea());
        System.out.println("El área del cuadrado es: " + c.getArea());
        System.out.println("El área del triángulo es: " + t.getArea());
        System.out.println("El área del círculo es: " + cir.getArea());
        System.out.println("El área de la elipse es: " + elip.getArea());

        sc.close();
    }
}

