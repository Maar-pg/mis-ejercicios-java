// Dadas dos filas de macarons y lo que come cada niño (hasta leer cuatro ceros),
// determina si es posible repartir los dulces entre ambos.

import java.util.Scanner;
public class Comer_macarons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            while (true) {
            // Leer los números de macarons y los que cogen los niños
                int fila1 = scanner.nextInt();
                int fila2 = scanner.nextInt();
                int nino1 = scanner.nextInt();
                int nino2 = scanner.nextInt();

                // Verificar si se alcanza un caso de terminación
                if (fila1 == 0 && fila2 == 0 && nino1 == 0 && nino2 == 0) break;

                // Calcular el total de macarons en ambas filas
                int totalMacarons = fila1 + fila2;

                // Verificar si es posible repartir todos los macarons
                if (repartirMacarons(fila1, fila2, nino1, nino2, totalMacarons)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }

            scanner.close();
        }

        // Método para verificar si es posible repartir todos los macarons
        private static boolean repartirMacarons(int fila1, int fila2, int nino1, int nino2, int totalMacarons) {
            // Si el total de macarons es menor que la suma de los macarons que toman los niños,
            // entonces no es posible repartirlos
            if (totalMacarons < nino1 + nino2) {
                return false;
            }

            // Si hay suficientes macarons en una fila para que cada niño tome los que desea,
            // entonces es posible repartirlos
            if (fila1 >= nino1 && fila2 >= nino2) {
                return true;
            }

            // Si no, necesitamos comprobar si hay suficientes macarons en ambas filas para
            // que cada niño tome al menos lo que desea de una de las filas
            return (fila1 + fila2 >= nino1 + nino2) && (Math.min(fila1, fila2) >= Math.min(nino1, nino2));
    }
}


