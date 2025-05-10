package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio6 {
     public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 6\n");

        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100);
        int numeroUsuario;

        System.out.println("Adivina el numero aleatorio");

        do {
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Más alto");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Más bajo");
            } else {
                System.out.println("¡Correcto! El número era " + numeroAleatorio);
            }

        } while (numeroUsuario != numeroAleatorio);

        scanner.close();
    }
}

