/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá estar almacenada en una variable.*/

import java.util.Scanner;

public class ConversorPesetas {
    public static void main (String[] args){

        //declaramos las variables
        float euros;
        float pesetas;

    System.out.println("Introduzca una cantidad de dinero: "); //preguntamos primero la cantidad de dinero
        Scanner scan = new Scanner(System.in);
        euros= scan.nextFloat();
        pesetas=euros * 166.386f;

    System.out.println("El dinero introducido es " + pesetas);
    }
}