// Dadas varias sesiones de visualización con minutos y nombre de serie (hasta leer 0),
// muestra las 3 series más vistas que acumulen al menos 30 minutos ordenadas de mayor a
// menor tiempo y alfabéticamente en caso de empate.
import java.util.*; // Importa Scanner, Map, HashMap, List, ArrayList y Collections

public class Las_series_mas_vistas {
    public static void main(String[] args) {
            // Creamos el lector para recibir los datos desde la consola
            Scanner scanner = new Scanner(System.in);

            // Estructura de control (Bucle infinito): lee casos de prueba hasta encontrar un 0
            while (true) {
                int n = scanner.nextInt(); // Leemos cuántas sesiones de visionado hay en este caso

                // Condicional con salto (break): si el número de sesiones es 0, termina el programa
                if (n == 0) break;

                // Mapa que guarda el nombre de cada serie (clave) y sus minutos totales acumulados (valor)
                Map<String, Integer> series = new HashMap<>();

                // Bucle for: se repite una vez por cada sesión registrada
                for (int i = 0; i < n; i++) {
                    int duracion = scanner.nextInt();          // Leemos los minutos vistos en esta sesión
                    String nombre = scanner.nextLine().trim(); // Leemos el resto de la línea (el título) sin espacios extra

                    // Sumamos la duración actual al total que ya tenía esa serie (o a 0 si es la primera vez)
                    series.put(nombre, series.getOrDefault(nombre, 0) + duracion);
                }

                // Pasamos las parejas (serie, minutos) del mapa a una lista para poder ordenarlas
                List<Map.Entry<String, Integer>> list = new ArrayList<>(series.entrySet());

                // Ordenamos la lista usando una regla personalizada (expresión lambda)
                Collections.sort(list, (a, b) -> {
                    // Comparamos los minutos de 'b' frente a 'a' para ordenar de mayor a menor
                    int compareDuracion = Integer.compare(b.getValue(), a.getValue());

                    // Condicional (if-else): si tienen distinta duración, gana la que tenga más minutos
                    if (compareDuracion != 0) {
                        return compareDuracion;
                    } else {
                        // Si empatan en minutos, ordenamos alfabéticamente de la A a la Z
                        return a.getKey().compareTo(b.getKey());
                    }
                });

                // Contador para asegurarnos de imprimir como máximo 3 series
                int count = 0;

                // Bucle for-each: recorre las series ya ordenadas
                for (Map.Entry<String, Integer> entry : list) {
                    // Condicional: solo mostramos la serie si llega a 30 minutos y aún no hemos impreso 3
                    if (entry.getValue() >= 30 && count < 3) {
                        System.out.println(entry.getKey());
                        count++; // Aumentamos el contador de series impresas
                    }
                }

                // Imprimimos la línea separadora obligatoria al final de cada caso de prueba
                System.out.println("---");
            }

            // Cerramos el lector de datos
            scanner.close();
    }
}


