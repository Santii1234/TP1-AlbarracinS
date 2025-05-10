package resol_AlbarracinS;

import java.util.Scanner;

public class Ejercicio13 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 13\n");
        Scanner scanner = new Scanner(System.in);

        String[] alumnos = new String[3];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del " + (i + 1) + "° alumno");
            alumnos[i] = scanner.nextLine();
        }

        double[][] notas = new double[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Notas del " + (i + 1) + "° estudiante:");

            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese nota de la " + (j + 1) + "° materia:");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Promedio de notas de los estudiantes:");

        for (int i = 0; i < 3; i++) {
            double suma = 0;

            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 3;
            System.out.println("El promedio del alumno " + alumnos[i] + " es: " + promedio);
        }
        scanner.close();
    }
}
