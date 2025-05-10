package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio10 {
     public static boolean validarContraseña(String contraseña) {

        if (contraseña.length() < 8) {

            return false;

        }

        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (Character.isUpperCase(c)) {
                mayusculas++;

            } else if (Character.isLowerCase(c)) {
                minusculas++;

            } else if (Character.isDigit(c)) {
                digitos++;

            }
        }
        return mayusculas >= 2 && minusculas >= 3 && digitos >= 2;
    }

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 10\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña");

        String contraseñaUsuario = scanner.nextLine();

        if (validarContraseña(contraseñaUsuario)) {
            System.out.println("La contraseña es segura");

        } else {
            System.out.println("La contraseña es insegura");
        }

        scanner.close();

    }
}
