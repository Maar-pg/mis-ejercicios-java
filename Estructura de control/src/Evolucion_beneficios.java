// Dado un saldo inicial y una lista de movimientos bancarios con fecha, calcula
// e imprime el saldo de los 12 meses del año.
import java.util.*; // Importa Scanner, Map y HashMap

public class Evolucion_beneficios {
        public static void main(String[] args) {
            // Creamos el lector para recibir los datos desde la consola
            Scanner scanner = new Scanner(System.in);

            // Estructura de control (Bucle while): se repite mientras queden datos por leer en la entrada
            while (scanner.hasNext()) {
                // Leemos el dinero inicial y cuántos movimientos bancarios vamos a procesar
                int saldoInicial = scanner.nextInt();
                int movimientos = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el salto de línea pendiente tras leer los números

                // Creamos un mapa donde la clave es el mes (1..12) y el valor es el dinero de ese mes
                Map<Integer, Integer> saldos = new HashMap<>();

                // Bucle for: recorre del 1 al 12 para guardar el saldo inicial en todos los meses
                for (int i = 1; i <= 12; i++) {
                    saldos.put(i, saldoInicial);
                }

                // Bucle for: se repite una vez por cada movimiento bancario registrado
                for (int i = 0; i < movimientos; i++) {
                    // Leemos la línea completa y la dividimos por espacios (ej. "15-03 -50 Compra")
                    String[] datosMovimiento = scanner.nextLine().split(" ");
                    String fecha = datosMovimiento[0];                  // Extraemos la fecha ("15-03")
                    int cantidad = Integer.parseInt(datosMovimiento[1]); // Convertimos el importe a entero (-50)
                    String concepto = datosMovimiento[2];               // Guardamos el concepto ("Compra")

                    // Cortamos los caracteres de la posición 3 a la 5 de "DD-MM" para obtener el mes ("03" -> 3)
                    int mes = Integer.parseInt(fecha.substring(3, 5));

                    // Sumamos o restamos la cantidad al saldo que tenía guardado ese mes concreto
                    saldos.put(mes, saldos.get(mes) + cantidad);
                }

                // Bucle for: recorre los 12 meses en orden para mostrar su saldo por pantalla
                for (int i = 1; i <= 12; i++) {
                    System.out.print(saldos.get(i) + " ");
                }
                System.out.println(); // Salto de línea para separar el siguiente caso de prueba
            }

            // Cerramos el lector de datos
            scanner.close();
        }
    }


