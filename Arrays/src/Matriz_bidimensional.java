// Define una matriz (array bidimensional) de 3 filas y 6 columnas
// con números enteros ya asignados e imprímela por consola en formato de tabla.

public class Matriz_bidimensional {
    public static void main(String[] args) {
            // Declaramos e inicializamos una matriz (array de 2 dimensiones) de 3 filas x 6 columnas
            int[][] num = {
                    {47, 11, 32, 60, 92, 56}, // Fila 0
                    {22, 13, 45, 78, 34, 7},  // Fila 1
                    {19, 38, 67, 49, 92, 28}  // Fila 2
            };

            System.out.println("Tabla de números:");

            // Bucle exterior: recorre cada una de las filas (num.length = 3)
            for (int i = 0; i < num.length; i++) {
                // Bucle interior: recorre cada columna dentro de la fila 'i' (num[i].length = 6)
                for (int j = 0; j < num[i].length; j++) {
                    // Imprime el número de la fila 'i' y columna 'j' seguido de un espacio (sin saltar de línea)
                    System.out.print(num[i][j] + " ");
                }
                // Hace un salto de línea al terminar de imprimir toda la fila actual
                System.out.println();
            }
    }
}
