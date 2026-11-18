// Genera 20 números aleatorios entre 100 y 999 en una matriz de 4 filas
// por 5 columnas y muestra sus sumas parciales de filas, columnas y total
// aplicando un retardo de 1 segundo antes de mostrar cada suma.
import java.util.Random;
public class numeros_aleatorios {
        // 'throws InterruptedException' es obligatorio para poder usar Thread.sleep() sin try-catch
        public static void main(String[] args) throws InterruptedException {
            Random aleatorio = new Random(); // Generador de números aleatorios
            int[][] numeros = new int[4][5]; // Matriz de 4 filas y 5 columnas
            int sumaTotal = 0;               // Acumulador para la suma global de los 20 números

            // 1. Bucle para rellenar la matriz con números aleatorios entre 100 y 999
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    numeros[i][j] = aleatorio.nextInt(100, 1000); // Número >= 100 y < 1000
                    sumaTotal += numeros[i][j];                   // Suma al total general
                }
            }

            // 2. Bucle para imprimir cada fila y su suma parcial con pausa
            for (int i = 0; i < 4; i++) {
                int sumaFila = 0; // Reiniciamos la suma de la fila actual
                for (int j = 0; j < 5; j++) {
                    System.out.print(numeros[i][j] + "\t"); // Imprime el número tabulado
                    sumaFila = sumaFila + numeros[i][j];    // Acumula el valor de la fila
                }
                Thread.sleep(1000); // Pausa el programa 1 segundo (1000 ms) antes de mostrar el subtotal
                System.out.println("| " + sumaFila);
            }

            // Dibuja la línea divisoria debajo de las 5 columnas
            System.out.print("---\t---\t---\t---\t---");
            System.out.println();

            // 3. Bucle invertido (columnas fuera, filas dentro) para sumar cada columna con pausa
            for (int j = 0; j < 5; j++) {
                int sumaColumna = 0; // Reiniciamos el acumulador al pasar a la siguiente columna
                for (int i = 0; i < 4; i++) {
                    sumaColumna = sumaColumna + numeros[i][j]; // Suma en vertical los 4 valores
                }
                Thread.sleep(1000); // Pausa 1 segundo antes de imprimir el subtotal de la columna
                System.out.print(sumaColumna + "\t");
            }

            Thread.sleep(1000); // Pausa final de 1 segundo antes de revelar el total global
            System.out.println("| " + sumaTotal);
        }
}
