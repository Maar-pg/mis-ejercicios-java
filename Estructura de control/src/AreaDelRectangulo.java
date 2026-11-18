//Escribe un programa que calcule el área de un rectángulo.

import java.util.Scanner;

public class AreaDelRectangulo {
    public static void main (String[] args){

        //El area de un rectangulo es multiplicar largo * ancho = area
        //declaramos las variables e introducimos el scanner
        float largo;
        float ancho;
        float area;
        Scanner scan = new Scanner (System.in);

        System.out.println("Dime el largo del rectangulo "); //pedimos que nos diga el rectangulo y lo seguimos con un float
        largo = scan.nextFloat();

        System.out.println("Dime el ancho del rectangulo ");
        ancho = scan.nextFloat();

        //multiplicamos ancho * largo y mostramos en pantalla el area
        area = ancho * largo;

        System.out.println("El area de un rectangulo es: " + area );

    }
}
