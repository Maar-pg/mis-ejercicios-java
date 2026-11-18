// Rellena una matriz de 6 filas por 10 columnas con números aleatorios entre 0
// y 1000 y muestra cuál es el número máximo y cuál es el mínimo junto con su
// posición (fila y columna).
import java.util.Random;

public class matriz6_filas {
    public static void main(String[] args) {
            // Creamos una matriz de 6 filas y 10 columnas (60 posiciones en total)
            int[][] nums = new int[6][10];
            Random rand = new Random(); // Generador de números aleatorios

            // 1. Bucle anidado para rellenar toda la tabla con números entre 0 y 1000
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    nums[i][j] = rand.nextInt(1001); // Genera un entero >= 0 y <= 1000
                }
            }

            // 2. Inicializamos el máximo, el mínimo y sus coordenadas con la primera celda [0][0]
            int max = nums[0][0];
            int min = nums[0][0];
            int maxFila = 0;
            int maxColumna = 0;
            int minFila = 0;
            int minColumna = 0;

            // 3. Bucle anidado para recorrer toda la matriz y comparar cada celda
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    // Si encontramos un número mayor que el máximo actual, actualizamos valor y posición
                    if (nums[i][j] > max) {
                        max = nums[i][j];
                        maxFila = i;
                        maxColumna = j;
                    }
                    // Si encontramos un número menor que el mínimo actual, actualizamos valor y posición
                    if (nums[i][j] < min) {
                        min = nums[i][j];
                        minFila = i;
                        minColumna = j;
                    }
                }
            }
            // 4. Mostramos por consola los valores encontrados y sus coordenadas (índices 0..5 y 0..9)
            System.out.println("Max: " + max + " con fila " + maxFila + " columna " + maxColumna);
            System.out.println("Min: " + min + " con fila " + minFila + " columna " + minColumna);
    }
}
