/*
Entrada: La entrada comienza con un número indicando cuántos casos de prueba tendrán que procesarse.
Cada caso de prueba comienza con un número indicando el número de equipos E (entre 1 y 128)
que participan en el Mundial. A continuación aparece el número de plazas reservadas para cada
una de las 6 confederaciones continentales. Se garantiza que la suma de esos 6 números no es mayor que E.

Salida:Por cada caso de prueba el programa deberá escribir el número de plazas que se utilizan en la repesca
intercontinental.
 */

import java.util.Scanner;

public class PlazasDisponiblesEnElMundial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] confederaciones = {
                "UEFA (Europa)",
                "CONMEBOL (Sudamerica)",
                "CONCACAF (Norte/Centroamerica)",
                "CAF (Africa)",
                "AFC (Asia)",
                "OFC (Oceania)"
        };

        System.out.println("================================================");
        System.out.println("      CALCULADORA DE PLAZAS DE REPESCA          ");
        System.out.println("================================================");

        // 1. Pedimos el número total de equipos
        System.out.print("Introduce el numero total de equipos (maximo 6): ");
        int totalEquipos = sc.nextInt();

        // 2. Comprobamos si introduce más de 6 equipos
        if (totalEquipos > 6) {
            System.out.println("\nError: solo hay 6 equipos que puedes elegir.");
        } else {
            // Si es 6 o menos, continuamos con normalidad
            System.out.println("\nIntroduce las plazas directas de cada confederacion:");
            int plazasAsignadas = 0;

            for (int i = 0; i < 6; i++) {
                System.out.print(" - " + confederaciones[i] + ": ");
                int plazas = sc.nextInt();
                plazasAsignadas += plazas;
            }

            int repesca = totalEquipos - plazasAsignadas;

            System.out.println("\n------------------------------------------------");
            System.out.println("             RESUMEN DE CLASIFICACION           ");
            System.out.println("------------------------------------------------");
            System.out.println(" * Total de equipos               : " + totalEquipos);
            System.out.println(" * Plazas directas asignadas      : " + plazasAsignadas);
            System.out.println(" -> PLAZAS PARA LA REPESCA        : " + repesca);
            System.out.println("------------------------------------------------");
        }

        sc.close();
    }
}
