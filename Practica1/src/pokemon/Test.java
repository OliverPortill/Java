package pokemon;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el tipo de Pokémon 1:");
        String tipo1 = scanner.nextLine();
        System.out.println("Ingrese el nombre de Pokémon 1:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el nivel de vida de Pokémon 1:");
        int vida1 = scanner.nextInt();
        System.out.println("Ingrese el poder de daño de Pokémon 1:");
        int daño1 = scanner.nextInt();
        System.out.println("Ingrese el poder de defensa de Pokémon 1:");
        int defensa1 = scanner.nextInt();
        System.out.println("Ingrese la velocidad de Pokémon 1:");
        int velocidad1 = scanner.nextInt();
        scanner.nextLine(); 

        Tipo tipoP1 = new Tipo(tipo1);
        Pokemon pokemon1 = new Pokemon(tipoP1, nombre1, vida1, daño1, defensa1, velocidad1);

        System.out.println("Ingrese el tipo de Pokémon 2:");
        String tipo2 = scanner.nextLine();
        System.out.println("Ingrese el nombre de Pokémon 2:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el nivel de vida de Pokémon 2:");
        int vida2 = scanner.nextInt();
        System.out.println("Ingrese el poder de daño de Pokémon 2:");
        int daño2 = scanner.nextInt();
        System.out.println("Ingrese el poder de defensa de Pokémon 2:");
        int defensa2 = scanner.nextInt();
        System.out.println("Ingrese la velocidad de Pokémon 2:");
        int velocidad2 = scanner.nextInt();
        
        Tipo tipoP2 = new Tipo(tipo2);
        Pokemon pokemon2 = new Pokemon(tipoP2, nombre2, vida2, daño2, defensa2, velocidad2);

        Combate mortalcombat = new Combate(pokemon1, pokemon2);
        mortalcombat.iniciar();

        scanner.close();
    }
}
