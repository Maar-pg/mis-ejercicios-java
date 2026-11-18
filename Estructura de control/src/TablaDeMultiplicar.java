import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado.
public class TablaDeMultiplicar {
    public static void main(String[] args) {

        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número : ");
        n = entrada.nextInt();

        System.out.println("Tabla del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);

        }
    }
}
