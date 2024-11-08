package pokemon;

public class Combate {
    
    Pokemon p1;
    Pokemon p2;

    public Combate(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciar() {
        System.out.println("\n¡El combate entre " + p1.nombre + " y " + p2.nombre + " ha comenzado!\n");

        int turno = 1; // 1 p1, 2 p2
        while (true) {
            if (p1.nivel_vida <= 0 || p2.nivel_vida <= 0) {
                if (p1.nivel_vida > p2.nivel_vida) {
                    System.out.println("Ganó el combate: " + p1.nombre);
                } else if (p1.nivel_vida < p2.nivel_vida) {
                    System.out.println("Ganó el combate: " + p2.nombre);
                } else {
                    System.out.println("Ambos Pokémon están derrotados. ¡Empate!");
                }
                break;
            }

            if (turno == 1) {
                System.out.println("Ataca " + p1.nombre);
                if (p2.esquivar()) {
                    System.out.println(p2.nombre + " esquivó el ataque!");
                } else {
                    p2.nivel_vida -= p1.atacar();
                    System.out.println(p2.nombre + " recibió daño. Vida restante: " + p2.nivel_vida);
                }
                turno = 2;
            } else {
                System.out.println("Ataca " + p2.nombre);
                if (p1.esquivar()) {
                    System.out.println(p1.nombre + " esquivó el ataque!");
                } else {
                    p1.nivel_vida -= p2.atacar();
                    System.out.println(p1.nombre + " recibió daño. Vida restante: " + p1.nivel_vida);
                }
                turno = 1;
            }
            //Thread.sleep(1000); 
        }
    }
}
