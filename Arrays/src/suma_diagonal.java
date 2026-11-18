import java.util.Scanner;
// Pide al usuario el tamaño N de una matriz cuadrada (N x N), lee
// sus elementos por teclado y calcula la suma de los números situados
// en su diagonal principal.

public class suma_diagonal {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedimos el tamaño para crear una matriz cuadrada (mismo número de filas y columnas)
            System.out.print("Ingrese el tamaño de la matriz (n x n): ");
            int n = scanner.nextInt();
            int[][] matriz = new int[n][n];

            // 1. Bucle anidado para rellenar la matriz con los valores introducidos por teclado
            System.out.println("Introduce los elementos de la matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // 2. Variables acumuladoras para las diagonales
            int sumaDiagonalPrincipal = 0;
            int sumaDiagonalSecundaria = 0; // Declarada, aunque actualmente no se utiliza en el código

            // 3. Bucle simple: recorre los elementos de la diagonal principal ([0][0], [1][1], [2][2]...)
            for (int i = 0; i < matriz.length; i++) {
                sumaDiagonalPrincipal = sumaDiagonalPrincipal + matriz[i][i];
            }

            // 4. Mostramos el resultado por pantalla
            System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);

            scanner.close(); // Cerramos el lector de teclado
    }
}
