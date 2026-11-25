/*
Entrada: consta de una única línea que contiene un número n, 0 ≤ n ≤ 5, que indica cuántos mensajes hay que emitir.
Salida: Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo.".
 */

import java.util.Scanner;

public class HolaMundo {
    public static void main (String[] args){

        int numero;
        Scanner scan = new Scanner(System.in);

        System.out.println("---Escribe un numero y te dire hola mundo---");
        System.out.println("Escribe un numero");
        numero = scan.nextInt();

        for (int i = 0; i < numero; i++){
            System.out.println("hola mundo");
        }
    }
}
