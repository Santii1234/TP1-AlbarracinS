package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio3 {
     public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();

    }
}
    

