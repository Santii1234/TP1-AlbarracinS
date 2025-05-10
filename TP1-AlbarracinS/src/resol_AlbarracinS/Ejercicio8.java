package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio8 {

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 8\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertir a Celsius o Fahrenheit");

        String formula = scanner.nextLine();

        System.out.println("Ingrese la temperatura");
        double temperatura = scanner.nextDouble();

        switch (formula.toLowerCase()) {
            case "celsius":
                double temperaturaC = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + " °C en Celsius es " + temperaturaC);

                break;
            case "fahrenheit":
                double temperaturaF = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + " °C en Fahrenheit es " + temperaturaF);

            default:
                break;
        }

        scanner.close();
    }

    
}
