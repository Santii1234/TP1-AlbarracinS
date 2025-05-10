package resol_AlbarracinS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio12 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 12\n");

        Scanner scanner = new Scanner(System.in);

        Integer[] numeros = new Integer[5];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Los numeros ingresado de mayor a menor son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + " : " + numeros[i]);
        }

        scanner.close();

    }

}
