package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");

        } else {
            System.out.println("El numero " + numero + " es impar");
        }

        scanner.close();

    }
}
    

