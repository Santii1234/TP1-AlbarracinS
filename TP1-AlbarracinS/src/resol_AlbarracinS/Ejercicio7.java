package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio7 {
     public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 7\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int primerNum = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int segundoNum = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Elija la opcion (sumar, restar, multiplicar, dividir)");
        String opcion = scanner.nextLine();

        switch (opcion.toLowerCase()) {
            case "sumar":
                System.out.println("El resultado es: " + (primerNum + segundoNum));

                break;
            case "restar":
                System.out.println("El resultado es: " + (primerNum - segundoNum));

                break;

            case "multiplicar":
                System.out.println("El resultado es: " + (primerNum * segundoNum));

                break;

            case "dividir":
                if (segundoNum != 0) {
                    System.out.println("El resultado es " + ((double) primerNum / segundoNum));

                } else {
                    System.out.println("El numero no es divisible por cero");
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();

    }
    
}
