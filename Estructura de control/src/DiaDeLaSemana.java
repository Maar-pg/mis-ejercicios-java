//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.


import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {

        int numero;
        Scanner scan = new Scanner(System.in);
        //queremos que10 dentro de do, que si el usuario introduce algo fuera del 1 al 7 el numero es incorrecto

        do {
            System.out.println("Dime un numero del 1 al 7 ");
            numero = scan.nextInt();
            if (numero > 7 || numero < 0) {
                System.out.println("El numero es incorrecto ");
            }


        //ponemos los dias de la semana con un switch
        }while (numero > 7 || numero < 0);

        System.out.println("el dia de la semana es ");
        switch (numero){
        case 1: System.out.println("Lunes");
        break;
        case 2: System.out.println("Martes");
        break;
        case 3: System.out.println("Miercoles");
        break;
        case 4: System.out.println("Jueves");
        break;
        case 5: System.out.println("Viernes");
        break;
        case 6: System.out.println("Sabado");
        break;
        case 7: System.out.println("Domingo");
        break;
        }
    }
}
