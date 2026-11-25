/*
Entrada:Cada caso de prueba comienza con un número n indicando cuántas
páginas pide el profesor Keating a sus alumnos que arranquen. Después
aparecen n números, entre 1 y 1.000, con los números de las páginas que deben arrancar.
Se garantiza que no hay números repetidos. El libro del Dr. Pritchard está impreso a doble cara.
La entrada termina con un 0 que no debe procesarse.

Salida: Por cada caso de prueba el programa escribirá el número de hojas que son realmente eliminadas.
 */

import java.util.Scanner;

public class KeatingvsPritchard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("        CALCULADORA DE BOLAS DE NAVIDAD         ");
        System.out.println("================================================");

        //pedimos el numero de bolas (1 a 2.000.000)
        System.out.println("Introduce cuantas bolas quiere comprar (1 al 2.000.000 ");
        long bolas = scan.nextLong();

        while (bolas < 1 || bolas > 2000000) {
            System.out.println("El numero debe de estar entre 1 y 2000000");
            System.out.println("Vuelve a introducir la cantidad de bolas: ");
            bolas = scan.nextLong();
        }

        //Calculamos el maximo numero de tipos distintos
        long tipos = 0;
        long sumaBolas = 0;

        while (sumaBolas + (tipos + 1) <= bolas) {
            tipos ++;
            sumaBolas += tipos;
        }

        // 3. Mostramos el resumen bonito por consola
        System.out.println("\n------------------------------------------------");
        System.out.println("              RESUMEN DE LA COMPRA              ");
        System.out.println("------------------------------------------------");
        System.out.println(" * Bolas totales a comprar      : " + bolas);
        System.out.println(" -> MAXIMO DE TIPOS DISTINTOS   : " + tipos);
        System.out.println("------------------------------------------------");

        scan.close();

    }
}
