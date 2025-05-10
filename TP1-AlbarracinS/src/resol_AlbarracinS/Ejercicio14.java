package resol_AlbarracinS;

public class Ejercicio14 {
     public static void mostrar(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 14\n");

        int[][] original = {
                { 1, 2, 0, 3, 0, 7 },
                { 0, 0, 0, 0 },
                { 0, 6, 9, 8, 0, 9, 6 },
                { 0, 0, 0, 0, 7, 9, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 8, 7, 0, 8, 9, 0, 8 }
        };

        System.out.println("Matriz original:");
        mostrar(original);

        int filasValidas = 0;
        for (int i = 0; i < original.length; i++) {
            int noCeros = 0;
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] != 0) {
                    noCeros++;
                }
            }
            if (noCeros > 0) {
                filasValidas++;
            }
        }

        int[][] resultado = new int[filasValidas][];
        int filaDestino = 0;

        for (int i = 0; i < original.length; i++) {
            int noCeros = 0;

            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] != 0) {
                    noCeros++;
                }
            }

            if (noCeros > 0) {
                int[] nuevaFila = new int[noCeros];
                int k = 0;
                for (int j = 0; j < original[i].length; j++) {
                    if (original[i][j] != 0) {
                        nuevaFila[k++] = original[i][j];
                    }
                }
                resultado[filaDestino++] = nuevaFila;
            }
        }

        System.out.println("\nMatriz sin ceros y sin filas vacías:");
        mostrar(resultado);
    }

}
