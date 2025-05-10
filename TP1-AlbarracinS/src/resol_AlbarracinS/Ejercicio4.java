package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 4\n");

        Scanner scanner = new Scanner(System.in);

        int contar = 0;

        char letra;

        System.out.println("Ingrese una palabra");

        String palabra = scanner.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            letra = Character.toLowerCase(palabra.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contar++;

            }
        }

        System.out.println("La palabra contiene " + contar + " vocales");

        scanner.close();
    }
}
    
