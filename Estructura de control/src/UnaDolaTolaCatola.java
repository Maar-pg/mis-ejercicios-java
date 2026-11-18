import java.util.*; // Importa todas las utilidades de Java (Scanner, List, ArrayList)

public class UnaDolaTolaCatola {
    public static void main(String[] args) {
        // Creamos el lector para recibir los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Leemos el número total de casos de prueba a resolver
        int casosDePrueba = scanner.nextInt();
        scanner.nextLine(); // Limpiamos el salto de línea pendiente en el búfer

        // Estructura de control (Bucle for): se repite una vez por cada caso de prueba
        for (int i = 0; i < casosDePrueba; i++) {
            // Creamos una lista dinámica vacía para guardar los nombres de este grupo
            List<String> peregrinos = new ArrayList<>();
            String nombre;

            // Estructura de control (Bucle while): lee palabras una a una hasta encontrar una "F"
            while (!(nombre = scanner.next()).equals("F")) {
                peregrinos.add(nombre); // Añade cada nombre válido a la lista
            }

            // Leemos la cantidad de camas libres en el albergue
            int camasDisponibles = scanner.nextInt();

            // Leemos la longitud de la canción (nota: en este código no se llega a utilizar)
            int palabrasCancion = scanner.nextInt();

            // Llamamos al método que recorta la lista según las camas disponibles
            asignarCamas(peregrinos, camasDisponibles);

            // Llamamos al método que muestra el mensaje final por pantalla
            imprimirResultado(peregrinos, camasDisponibles);
        }

        // Cerramos el lector de datos
        scanner.close();
    }

    // Método que ajusta la lista de peregrinos que finalmente consiguen cama
    private static void asignarCamas(List<String> peregrinos, int camasDisponibles) {
        // Condicional: si hay camas iguales o de sobra para todos, no eliminamos a nadie
        if (camasDisponibles >= peregrinos.size()) {
            return;
        }

        // Condicional: si no hay ninguna cama, vaciamos toda la lista
        if (camasDisponibles == 0) {
            peregrinos.clear();
            return;
        }

        // Bucle while: mientras haya más personas que camas, eliminamos al último de la lista
        while (peregrinos.size() > camasDisponibles) {
            // remove(tamaño - 1) borra el elemento situado en la última posición
            peregrinos.remove(peregrinos.size() - 1);
        }
    }

    // Método encargado de imprimir quiénes se quedan con cama
    private static void imprimirResultado(List<String> peregrinos, int camasDisponibles) {
        // Condicional múltiple para decidir qué mensaje mostrar
        if (peregrinos.isEmpty()) {
            // Si la lista quedó vacía
            System.out.println("NADIE TIENE CAMA");
        } else if (peregrinos.size() == camasDisponibles) {
            // Si la cantidad de personas en la lista coincide con el número de camas
            System.out.println("TODOS TIENEN CAMA");
        } else {
            // Bucle for-each: recorre la lista restante e imprime cada nombre separado por espacio
            for (String peregrino : peregrinos) {
                System.out.print(peregrino + " ");
            }
            System.out.println(); // Salto de línea al terminar de imprimir los nombres
        }
    }
}

