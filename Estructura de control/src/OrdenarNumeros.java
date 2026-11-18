//Escribe un programa que ordene tres números enteros introducidos por teclado

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main (String[] args){

    int numero1, numero2, numero3;
    Scanner scan = new Scanner(System.in);

    //pedimos los numeros al usuario
        System.out.println("-----Introduce 3 numeros y te los ordenare-----");
        System.out.println("Escribe el primer numero: ");
        numero1 = scan.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = scan.nextInt();
        System.out.println("Escribe el tercer numero: ");
        numero3 = scan.nextInt();

    //Con if hacemos todas las combinaciones posibles
        System.out.println("Los numeros ordenados son");
        if(numero1<numero2 && numero1<numero3 && numero2<numero3){
            System.out.println( numero1+", "+numero2+", "+numero3);
        }else if (numero2<numero1 && numero2<numero3 && numero1<numero3){
            System.out.println(numero2+ "," +numero1+ ","+numero3);
        }else if (numero1<numero3 && numero1<numero2 && numero3<numero2){
            System.out.println(numero1+ "," +numero3+ "," +numero2);
        } else if (numero2<numero3 && numero3<numero1 && numero2<numero1){
            System.out.println(numero2+ "," +numero3+ "," +numero1);
        } else if (numero3<numero1 && numero1<numero2 && numero3<numero2) {
            System.out.println(numero3+ "," +numero1+ "," +numero2);
        } else if (numero3<numero2 && numero3<numero1 && numero2<numero1) {
            System.out.println(numero3+ "," +numero2+ "," +numero1);
        }
    }
}
