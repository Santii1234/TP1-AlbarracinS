package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar() {

        System.out.println("Ingresaste al ejercicio 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Hola " + nombreUsuario + "!");

        scanner.close();
    }

}