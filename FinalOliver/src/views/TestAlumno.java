package views;

import models.Alumno;
import models.Asignatura;
import java.util.Scanner;

public class TestAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del alumno: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingrese la cédula del alumno: ");
        int cedula = scanner.nextInt();
        System.out.println("\n------------------------");
        scanner.nextLine(); 

        int[] codigos = {101, 102, 103, 104, 105};
        String[] nombresMaterias = {"Matemáticas", "Literatura", "Historia", "Guarani", "Inglés"};

        Asignatura[] Materias = new Asignatura[5];

        for (int i = 0; i < 5; i++) {
            Materias[i] = new Asignatura(codigos[i], nombresMaterias[i]);
        }

        Alumno Prueba = new Alumno(nombre, Materias);
        Prueba.setCedula(cedula);
        Prueba.setNombre(nombre);
        Prueba.setApellido(apellido);
        
  
        System.out.println("\n------------------------");
        System.out.println("\n Resultados del Alumno ");
        System.out.println("\n------------------------");
        System.out.println("Nombre: " + Prueba.getNombre());
        System.out.println("Apellido: " + Prueba.getApellido());
        System.out.println("Cédula: " + Prueba.getCedula());
        System.out.println("Materias:");
        for (Asignatura materia : Materias) {
            System.out.println(" - Código: " + materia.getCodigo() + ", Nombre: " + materia.getNombre());
        }
      
        scanner.close();
    }
}

