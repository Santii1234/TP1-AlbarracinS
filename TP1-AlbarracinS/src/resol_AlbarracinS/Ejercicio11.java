package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio11 {
     public static int fibonacci(int n) {

        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 11\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int numero = scanner.nextInt();

        int resultado = fibonacci(numero);

        System.out.println("El numero de Fibonacci en la posicion " + numero + " es " + resultado);

        scanner.close();

    }
}
