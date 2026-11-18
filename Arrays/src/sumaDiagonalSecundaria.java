// Pide al usuario el tamaño N de una matriz cuadrada (N x N),
// lee sus elementos por teclado y calcula la suma de los números
// situados en su diagonal secundaria.
import java.util.Scanner;
public class sumaDiagonalSecundaria {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedimos la dimensión para crear una matriz cuadrada (N filas x N columnas)
            System.out.print("Ingrese el tamaño de la matriz (n x n): ");
            int n = scanner.nextInt();
            int[][] matriz = new int[n][n];

            // 1. Bucle anidado para leer y guardar cada número de la matriz
            System.out.println("Introduce los elementos de la matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // 2. Acumulador para la diagonal secundaria (se quitó sumaDiagonalPrincipal porque no se usaba)
            int sumaDiagonalSecundaria = 0;

            // 3. Bucle simple: mientras 'i' sube (0, 1, 2...), 'matriz.length - 1 - i' baja desde la última columna hacia 0
            for (int i = 0; i < matriz.length; i++) {
                sumaDiagonalSecundaria = sumaDiagonalSecundaria + matriz[i][matriz.length - 1 - i];
            }

            // 4. Mostramos el resultado final por pantalla
            System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);

            scanner.close(); // Cerramos el lector de teclado
    }
}
