/*
Entrada: La entrada comenzará con un entero para especificar el número
de casos de prueba que vendrá a continuación. Para cada caso de prueba
se mostrará una línea en la que aparecerán dos enteros, el primero de ellos
será correspondiente al día y el segundo correspondiente al mes de una fecha válida.

Salida: Para cada fecha de la entrada, se mostrarán el número de días completos que faltan
hasta el día de Nochevieja.
 */

import java.util.Scanner;
public class CuantosDiasFaltan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Cuantos dias faltan para nochevieja-----");
        System.out.println("dime un dia ");
        int dia = sc.nextInt();

        System.out.println("dime un mes ");
        int mes = sc.nextInt();


        // Días de cada mes en un año no bisiesto (índice 0 = enero, índice 11 = diciembre)
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Días que faltan para terminar el mes actual
        int faltan = diasMes[mes - 1] - dia;

        // Sumamos los días de todos los meses siguientes hasta diciembre
        for (int i = mes; i < 12; i++) {
            faltan += diasMes[i];
        }

        // Mostramos el resultado
        System.out.println("Faltan " + faltan + " dias para Nochevieja.");

        sc.close();
    }
}


