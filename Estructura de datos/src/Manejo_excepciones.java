// Programa de ejemplo para practicar try-catch, throw, throws y excepciones personalizadas.
import java.io.IOException;

public class Manejo_excepciones {

    // Definición de la excepción personalizada para que el código compile
    static class NoSePuedeDividirEntreDos extends Exception {
        public NoSePuedeDividirEntreDos(String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hola!");
        int x = 12;
        int y = 2;

        intenta(x, y);

        try {
            System.out.println(cero(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int x, int y) throws Exception {
        if (y == 2) {
            throw new NoSePuedeDividirEntreDos("NO SE PUEDE DIVIDIR ENTRE 2");
        } else {
            // Convertimos 'x' a double para conservar los decimales en la división
            return (double) x / y;
        }
    }

    public static void intenta(int x, int y) {
        double resultado;
        System.out.println("Vamos a intentar la ejecución del método 'divide'");
        try {
            resultado = divide(x, y);
            System.out.println("El resultado obtenido es: " + resultado);
        } catch (Exception ex) {
            System.out.println("Se ha producido un error: " + ex.getMessage());
        }
        System.out.println("Fin del intento");
    }

    public static int cero(int numero) throws Exception {
        if (numero == 0) {
            return numero;
        } else {
            throw new IOException("El parámetro no es cero");
        }
    }
}
