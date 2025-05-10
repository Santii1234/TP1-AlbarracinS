package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio9 {
     public static int contador(String cadena) {

        cadena = cadena.replaceAll("[.,;:!?¡¿()\\[\\]{}\"']", " ");

        String[] palabras = cadena.trim().split(" +");
        return palabras.length;

    }

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 9\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");

        String cadenaUsuario = scanner.nextLine();

        System.out.println("La cadena tiene " + contador(cadenaUsuario) + " palabras");

        scanner.close();
    }
}

