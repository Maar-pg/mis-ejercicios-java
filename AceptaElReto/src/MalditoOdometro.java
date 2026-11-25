/*
Entrada: Cada caso aparece en una línea independiente con los valores que muestra
el odómetro en la pantalla en relación con la salida en bici concreta. El primer
valor es la duración de la excursión (nunca más de 5 horas). El segundo es siempre
un 0 y es donde debería venir indicada la distancia recorrida. Por último aparece
la velocidad media expresada en kilómetros por hora que siempre será un número entero no mayor de 60.

Salida:Por cada caso de prueba se escribirá el número de kilómetros recorrido en esa salida. Se
garantiza que el valor siempre será entero.
 */
import java.util.Scanner;

public class MalditoOdometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     CALCULADORA DE SALIDAS EN BICI       ");
        System.out.println("==========================================");

        // 1. Pedimos la duración de la excursión
        System.out.print("1. Introduce la duracion (formato H:MM, ej. 1:50): ");
        String duracion = sc.next();

        // Separamos las horas y los minutos
        String[] partes = duracion.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        // 2. Pedimos el valor del odómetro (que en el problema siempre es 0)
        System.out.print("2. Distancia marcada en el odometro (pon 0): ");
        int odometro = sc.nextInt();

        // 3. Pedimos la velocidad media
        System.out.print("3. Introduce la velocidad media (en km/h): ");
        int velocidad = sc.nextInt();

        // 4. Calculamos los kilómetros reales recorridos
        int totalMinutos = horas * 60 + minutos;
        int kilometrosReales = (totalMinutos * velocidad) / 60;

        // 5. Mostramos una salida bonita con todos los detalles
        System.out.println("\n------------------------------------------");
        System.out.println("           RESUMEN DE LA RUTA             ");
        System.out.println("------------------------------------------");
        System.out.println(" - Duracion de la excursion : " + horas + " h y " + minutos + " min (" + duracion + ")");
        System.out.println(" - Odometro inicial         : " + odometro + " km (roto)");
        System.out.println(" - Velocidad media          : " + velocidad + " km/h");
        System.out.println(" -> DISTANCIA REAL RECORRIDA: " + kilometrosReales + " km");
        System.out.println("------------------------------------------");

        sc.close();
    }
}
