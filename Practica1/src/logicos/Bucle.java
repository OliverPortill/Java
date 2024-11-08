package logicos;

public class Bucle {
	public static void main(String[] args) {
		int inicio, limite;
		limite = 10;
		
		System.out.println("Bucle de números hasta el 10.");
		System.out.println("---------------------\n");
		
		for(inicio = 0 ; inicio < limite ; inicio++) {
			System.out.println("Imprimo un " + inicio);
		}
		
		int cat1, cat2, hip;
		System.out.println("\n Pitagoras -> c² = a² + b² ");
		System.out.println("\nBucle de números hasta el 1000.");
		System.out.println("---------------------\n");
		for (hip = 1 ; hip <= 1000 ; hip++){
			for (cat1= 1 ; cat1 < 1000 ; cat1 ++) {
				for (cat2 = 1; cat2 < 1000 ; cat2++) {
					if (hip == Math.sqrt(cat1 * cat1 + cat2 * cat2)){
						System.out.println("- " + hip + "²" + "= " + cat1 +"²"+ " + " + cat2 + "².");
					}
				}
			}
		}
	}
}