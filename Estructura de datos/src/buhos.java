//Enunciado:¿Acaso hubo búhos acá?
import java.util.Scanner;
public class buhos {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            // Leer la primera línea de entrada
            String frase = entrada.nextLine();

            // Mientras la frase no sea "XXX", seguimos procesando
            while (!frase.equals("XXX")) {
                // Verificar si la frase es un palíndromo e imprimir el resultado
                if (esPalindroma(frase)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
                // Leer la siguiente línea de entrada
                frase = entrada.nextLine();
            }
            // Cerrar el entrada para liberar recursos
            entrada.close();
        }

        // Método para verificar si una frase es un palíndromo
        public static boolean esPalindroma(String frase) {
            // Convertir la frase en un array de caracteres
            char[] caracteres = frase.toCharArray();


            // Inicializar los índices para recorrer el array
            int i = 0;
            int j = caracteres.length - 1;


            // Recorrer el array y verificar si la frase es un palíndromo
            while (i < j) {
                // Ignorar los espacios en blanco
                if (Character.isWhitespace(caracteres[i])) {
                    i++;
                    continue;
                }
                if (Character.isWhitespace(caracteres[j])) {
                    j--;
                    continue;
                }


                // Convertir los caracteres a minúsculas antes de compararlos
                if (Character.toLowerCase(caracteres[i]) != Character.toLowerCase(caracteres[j])) {
                    return false; // Si los caracteres no son iguales, no es un palíndromo
                }


                // Avanzar los índices hacia el centro del array
                i++;
                j--;
            }
            // Si el bucle termina, la frase es un palíndromo
            return true;
    }
}
