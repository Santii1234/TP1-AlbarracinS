package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio5 {
    public static boolean esPalindromo(String palabra) {

        palabra = palabra.replace(" ", "");
        palabra = palabra.replace('á', 'a');
        palabra = palabra.replace('é', 'e');
        palabra = palabra.replace('í', 'i');
        palabra = palabra.replace('ó', 'o');
        palabra = palabra.replace('ú', 'u');

        palabra = palabra.toLowerCase();

        int a = 0;
        int b = palabra.length() - 1;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(a) == palabra.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }
        }

        return true;

    }

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 5\n");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra");

        String palabra = leer.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es palíndromo");
        } else {
            System.out.println("La palabra no es palíndroma");
        }

        leer.close();
    }
}

