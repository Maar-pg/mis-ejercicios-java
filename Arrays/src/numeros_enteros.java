// Pide al usuario 20 números enteros para llenar una matriz de 4 filas
// por 5 columnas e imprime la tabla con las sumas parciales de cada fila
// a la derecha, las sumas de cada columna abajo y la suma total en la esquina inferior derecha.
import java.util.Scanner;

public class numeros_enteros {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Creamos una matriz de 4 filas y 5 columnas (20 huecos en total)
            int[][] numeros = new int[4][5];
            int sumaTotal = 0; // Acumulador para la suma de los 20 números

            // 1. Bucle para pedir e ingresar los números en la matriz
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Introduce el número de la fila " + (i + 1) + " y columna " + (j + 1) + ":");
                    numeros[i][j] = scanner.nextInt();     // Guarda el número en la posición [i][j]
                    sumaTotal = sumaTotal + numeros[i][j]; // Lo va sumando al total general
                }
            }

            // 2. Bucle para mostrar la matriz y calcular la suma de cada fila
            for (int i = 0; i < 4; i++) {
                int sumaFila = 0; // Reiniciamos el acumulador de fila al empezar una nueva
                for (int j = 0; j < 5; j++) {
                    System.out.print(numeros[i][j] + "\t"); // Imprime el número y un tabulador para alinear columnas
                    sumaFila = sumaFila + numeros[i][j];    // Suma el valor a la fila actual
                }
                // Al acabar la fila, imprime la barra separadora y su suma parcial
                System.out.println("| " + sumaFila);
            }

            // Imprime una línea divisoria debajo de las 5 columnas
            System.out.print("---\t---\t---\t---\t---");
            System.out.println();

            // 3. Bucle invertido (columnas por fuera, filas por dentro) para sumar verticalmente
            for (int j = 0; j < 5; j++) {
                int sumaColumna = 0; // Reiniciamos el acumulador al pasar a la siguiente columna
                for (int i = 0; i < 4; i++) {
                    sumaColumna = sumaColumna + numeros[i][j]; // Suma hacia abajo todos los elementos de la columna 'j'
                }
                System.out.print(sumaColumna + "\t"); // Imprime el total de la columna alineado con tabulador
            }

            // Imprime en la esquina inferior derecha la suma total de toda la matriz
            System.out.println("| " + sumaTotal);

            scanner.close(); // Cerramos el lector de teclado
    }
}

