
//Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
// Se utilizarán los tramos
// de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.


import java.util.Scanner;

public class HoradeReloj {
    public static void main(String[] args) {

      //declaramos la variable hora e introducimos el scaner
      int hora;
       Scanner entrada = new Scanner(System.in);

       do {
       System.out.println("Dime la hora");
       hora = entrada.nextInt();
       if (hora >= 24 || hora < 0) { //si el usuario mete mal los datos en consola le sale este error
           System.out.println("El valor introducido no es valido");
       }
       } while (hora >= 24 || hora < 0);
        //empezamos con la condicion de los buenos dias, noches y tardes
       if (hora >= 6 && hora <= 12) {
           System.out.println("Buenos dias");
       } else if (hora>=21 && hora<= 23 || hora >=0 && hora<=5) {
           System.out.println("Buenas noches");
       }else{
           System.out.println("Buenas tardes");
       }
    }
}




