// Programa de ejemplo y repaso que muestra cómo crear, modificar, consultar y
// recorrer cuatro estructuras de datos en Java: HashMap, HashSet, Arrays estáticos y ArrayList.

import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
            final int FILAS = 8; // Número de filas del tablero de ajedrez
            final int COLUMNAS = 8; // Número de columnas del tablero de ajedrez
            final char CUADROBLANCO = '\u25A1'; // Caracter para representar un cuadro blanco
            final char CUADRONEGRO = '\u25A0'; // Caracter para representar un cuadro negro
            final char DAMA = '۩'; // Caracter para representar la dama

            // Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Representación del tablero
            char[][] tablero = new char[FILAS][COLUMNAS];
            String posicion; // Variable para almacenar la posición de la dama ingresada por el usuario
            int filaDama; // Fila donde se colocará la dama
            int columnaDama; // Columna donde se colocará la dama

            // Inicializamos el tablero y representación visual
            for (int fila = FILAS - 1; fila >= 0; fila--) {
                for (int columna = 0; columna < COLUMNAS; columna++) {
                    // Alternamos entre cuadros blancos y negros
                    if (((fila + columna) % 2) != 0)
                        tablero[fila][columna] = CUADROBLANCO;
                    else
                        tablero[fila][columna] = CUADRONEGRO;
                }
            }

            // Leemos la posición de la dama
            System.out.println("Dame la posición de la dama (por ejemplo, a1, b2, c3): ");
            posicion = scanner.nextLine();
            // Convertimos la posición a índices de la matriz
            columnaDama = (int) (posicion.charAt(0) - 'a');
            filaDama = (int) (posicion.charAt(1) - '1');

            // Colocamos la dama en el tablero
            tablero[filaDama][columnaDama] = DAMA;

            // Representación final del tablero con la dama
            System.out.println("\nTablero con la dama:");
            // Mostramos el encabezado de columnas (letras)
            System.out.print("  ");
            for (char letra = 'a'; letra <= 'h'; letra++) {
                System.out.print(letra + " ");
            }
            System.out.println();
            // Mostramos el tablero con los números de fila y los caracteres de los cuadros
            for (int fila = FILAS - 1; fila >= 0; fila--) {
                System.out.print((fila + 1) + " "); // Número de fila
                for (int columna = 0; columna < COLUMNAS; columna++) {
                    System.out.print(tablero[fila][columna] + " "); // Caracter del cuadro
                }
                System.out.println(); // Nueva línea para la siguiente fila
            }
    }
}