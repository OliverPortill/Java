package operaciones;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta(50.00); 
        Cuenta cuenta2 = new Cuenta(0.0); 
        
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());
        
        Scanner entrada = new Scanner(System.in);
        
        double montoDeposito; 
        
     
        System.out.print("Escriba el monto a depositar para cuenta1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nsumando %.2f al saldo de cuenta1\n\n", montoDeposito);
        cuenta1.abonar(montoDeposito); 
        
        
        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble();  
        System.out.printf("\nsumando %.2f al saldo de cuenta2\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito);
        
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());
    }
}
