// determinar si un número entero dado cumple las condiciones para ser un número vampiro

import java.util.Scanner; // Importa la herramienta para leer datos por teclado
import java.util.Arrays;  // Importa utilidades para ordenar y comparar arreglos

public class Numeros_Vampiros {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leemos cuántos números vamos a evaluar en total
        int casosDePrueba = scanner.nextInt();

        // Estructura de control (Bucle): se repite una vez por cada caso de prueba
        for (int i = 0; i < casosDePrueba; i++) {
            // Leemos el número largo (long) que queremos comprobar
            long numero = scanner.nextLong();

            // Estructura de control (Condicional): llamamos a la función y mostramos el resultado
            if (esVampiroVerdadero(numero)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        // Cerramos el Scanner para liberar memoria
        scanner.close();
    }

    // Método auxiliar que devuelve true si es vampiro y false si no lo es
    private static boolean esVampiroVerdadero(long numero) {
        // Convertimos el número a texto para poder contar sus dígitos fácilmente
        String numeroStr = Long.toString(numero);

        // Condicional: si la cantidad de dígitos es impar (resto != 0), no puede ser vampiro
        if (numeroStr.length() % 2 != 0) {
            return false;
        }

        // Bucle: probamos posibles primeros colmillos (factor1) desde el 10 hasta la raíz cuadrada del número
        for (long factor1 = 10; factor1 <= Math.sqrt(numero); factor1++) {

            // Condicional: si el número no es divisible exacto entre factor1, saltamos a la siguiente vuelta
            if (numero % factor1 != 0) {
                continue;
            }

            // Calculamos el segundo colmillo (factor2) dividiendo el número entre el primer colmillo
            long factor2 = numero / factor1;

            // Condicional: comprobamos que ambos colmillos tengan exactamente la mitad de dígitos que el original
            if (Long.toString(factor1).length() != numeroStr.length() / 2 ||
                    Long.toString(factor2).length() != numeroStr.length() / 2) {
                continue; // Si no tienen la longitud adecuada, probamos el siguiente número
            }

            // Unimos los dos colmillos en un solo texto (ej. "21" + "60" = "2160")
            String concatenacion = Long.toString(factor1) + Long.toString(factor2);

            // Convertimos tanto el número original como los colmillos unidos en listas de caracteres (dígitos)
            char[] caracteresNumero = numeroStr.toCharArray();
            char[] caracteresConcatenacion = concatenacion.toCharArray();

            // Ordenamos los dígitos de menor a mayor para poder compararlos
            Arrays.sort(caracteresNumero);
            Arrays.sort(caracteresConcatenacion);

            // Condicional: si ambas listas ordenadas son idénticas, hemos encontrado los colmillos
            if (Arrays.equals(caracteresNumero, caracteresConcatenacion)) {
                return true; // Es un número vampiro
            }
        }

        // Si termina todo el bucle sin encontrar una pareja válida, devolvemos falso
        return false;
    }
}