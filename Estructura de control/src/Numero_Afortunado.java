// Dado un número N (hasta leer 0), filtra los números del 1 al N eliminando
// posiciones en intervalos sucesivos y muestra los supervivientes de mayor a menor.

import java.util.*; // Importa Scanner, List y ArrayList
public class Numero_Afortunado {
        public static void main(String[] args) {
            // Creamos el lector de datos por teclado
            Scanner scanner = new Scanner(System.in);

            // Estructura de control (Bucle infinito): lee casos hasta recibir un 0
            while (true) {
                int N = scanner.nextInt(); // Leemos el número límite N

                // Condicional con salto (break): si N es 0, salimos del bucle y termina el programa
                if (N == 0) {
                    break;
                }

                // Llamamos al método que filtra la lista y nos devuelve los supervivientes
                List<Integer> afortunados = calcularNumerosAfortunados(N);

                // Imprimimos la cabecera del resultado (ej. "10: ")
                System.out.print(N + ": ");

                // Bucle for descendente: recorre la lista desde el último elemento hasta el primero
                for (int i = afortunados.size() - 1; i >= 0; i--) {
                    System.out.print(afortunados.get(i));

                    // Condicional: añade un espacio solo si no es el último número en imprimirse
                    if (i > 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Salto de línea al terminar cada caso
            }

            // Cerramos el lector
            scanner.close();
        }

        // Método que aplica la criba para obtener los números afortunados hasta N
        private static List<Integer> calcularNumerosAfortunados(int N) {
            // Creamos una lista y la rellenamos con los números del 1 al N
            List<Integer> numeros = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                numeros.add(i);
            }

            int indice = 1; // Empezamos mirando la posición 1 de la lista (donde está el 2)

            // Bucle while: continúa mientras el índice esté dentro del tamaño actual de la lista
            while (indice < numeros.size()) {
                // Obtenemos el valor k que marcará cada cuántas posiciones borramos
                int k = numeros.get(indice);

                // Condicional con salto: si k supera la cantidad de números que quedan, ya no se borra nada más
                if (k >= numeros.size()) {
                    break;
                }

                // Bucle for: recorre la lista eliminando elementos en intervalos de k
                for (int i = k - 1; i < numeros.size(); i += k - 1) {
                    numeros.remove(i); // Borra el elemento en la posición i
                    i--; // Retrocedemos el índice una posición porque la lista se encoge al borrar
                }

                indice++; // Avanzamos al siguiente número superviviente
            }

            // Devolvemos la lista con los números que sobrevivieron al proceso
            return numeros;
        }
}

