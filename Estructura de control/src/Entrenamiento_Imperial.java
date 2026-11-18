import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Dados los límites diarios de distancia (D) y desnivel (S) y una serie de tramos (hasta 0 0),
// calcula cuántas jornadas hacen falta para completar la ruta o si el soldado es DESTITUIDO.

public class Entrenamiento_Imperial {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder output = new StringBuilder();

            // Leer cada caso de prueba
            while (scanner.hasNextInt()) {
                int D = scanner.nextInt(); // Máxima distancia permitida por jornada
                int S = scanner.nextInt(); // Máximo desnivel permitido por jornada

                int jornadas = 0; // Contador de jornadas
                int jornadaActualDistancia = 0; // Distancia acumulada en la jornada actual
                int jornadaActualDesnivel = 0; // Desnivel acumulado en la jornada actual
                boolean destituido = false; // Flag para indicar si el soldado es destituido

                // Procesar cada tramo del entrenamiento
                while (true) {
                    int longitud = scanner.nextInt(); // Longitud del tramo
                    int desnivel = scanner.nextInt(); // Desnivel del tramo

                    // Verificar si es el final del caso de prueba
                    if (longitud == 0 && desnivel == 0) {
                        break; // Salir del bucle si es el final
                    }

                    // Verificar si el tramo excede los límites permitidos
                    if (longitud > D || Math.abs(desnivel) > S) {
                        destituido = true; // Marcar como destituido
                        break; // Salir del bucle
                    }

                    // Verificar si el tramo puede ser añadido a la jornada actual
                    if ((jornadaActualDistancia + longitud > D) || (Math.abs(jornadaActualDesnivel + desnivel) > S)) {
                        jornadas++; // Incrementar el contador de jornadas
                        jornadaActualDistancia = longitud; // Reiniciar la distancia acumulada
                        jornadaActualDesnivel = desnivel; // Reiniciar el desnivel acumulado
                    } else {
                        jornadaActualDistancia += longitud; // Acumular la distancia del tramo
                        jornadaActualDesnivel += desnivel; // Acumular el desnivel del tramo
                    }
                }

                // Verificar el resultado del caso de prueba
                if (!destituido) {
                    jornadas++; // Incrementar el contador de jornadas por la última jornada si no fue contada
                    output.append(jornadas).append("\n"); // Agregar el resultado a la salida
                } else {
                    output.append("DESTITUIDO\n"); // Agregar "DESTITUIDO" como resultado
                }
            }

            scanner.close(); // Cerrar el Scanner

            System.out.println(output.toString()); // Imprimir la salida final
    }
}
