// Juego del Ahorcado por consola: elige una palabra al azar, oculta sus letras
// con guiones bajos y da 7 intentos al usuario para adivinarla letra a letra antes
// de preguntar si desea volver a jugar.

import java.util.Scanner;
import java.util.Random;

public class Ahorcado {

    public static void main(String[] args) {
        final int INTENTOS_TOTALES = 7; // Número máximo de intentos permitidos
        int intentos; // Contador de intentos realizados
        int aciertos; // Contador de letras acertadas
        Scanner teclado = new Scanner(System.in); // Scanner para leer la entrada del usuario
        Random rnd = new Random(); // Objeto Random para seleccionar palabras aleatoriamente
        String[] arrayPalabras = {"hola", "adios", "cojonudo"}; // Array de palabras disponibles para el juego

        char resp; // Variable para almacenar la respuesta del usuario
        do {
            // Selecciona una palabra aleatoriamente del array
            int alea = rnd.nextInt(arrayPalabras.length);
            // Convierte la palabra seleccionada en un array de caracteres
            char[] desguazada = arrayPalabras[alea].toCharArray();
            // Crea una copia de la palabra para mostrarla al final si el jugador pierde
            char[] copia = arrayPalabras[alea].toCharArray();
            // Array para almacenar las respuestas del usuario
            char[] tusRespuestas = new char[desguazada.length];
            // Inicializa el array de respuestas con guiones bajos
            for (int i = 0; i < tusRespuestas.length; i++) {
                tusRespuestas[i] = '_';
            }

            System.out.println("¡Adivina la palabra!");

            // Reinicia los contadores de intentos y aciertos
            intentos = 0;
            aciertos = 0;

            // Mientras haya intentos disponibles y no se hayan adivinado todas las letras
            while (intentos < INTENTOS_TOTALES && aciertos != tusRespuestas.length) {
                imprimeOculta(tusRespuestas); // Imprime las letras adivinadas hasta el momento
                System.out.println("\nIntroduce una letra: ");
                // Lee una letra del usuario y la convierte a minúsculas
                resp = teclado.next().toLowerCase().charAt(0);
                // Recorre la palabra buscando la letra ingresada por el usuario
                for (int i = 0; i < desguazada.length; i++) {
                    if (desguazada[i] == resp) { // Si la letra coincide
                        tusRespuestas[i] = desguazada[i]; // La muestra en su posición correspondiente
                        desguazada[i] = ' '; // Borra la letra para evitar contarla dos veces
                        aciertos++; // Incrementa el contador de aciertos
                    }
                }
                intentos++; // Incrementa el contador de intentos
            }

            // Muestra el resultado del juego
            if (aciertos == tusRespuestas.length) {
                System.out.print("\n¡Felicidades! Has acertado la palabra: ");
                imprimeOculta(tusRespuestas); // Imprime la palabra completa adivinada
            } else {
                System.out.print("\n¡Has perdido! La palabra era: ");
                // Muestra la palabra completa en caso de pérdida
                for (int i = 0; i < copia.length; i++) {
                    System.out.print(copia[i] + " ");
                }
            }

            // Pregunta si el usuario quiere volver a jugar
            resp = pregunta("\n\n¿Quieres volver a jugar?", teclado);
        } while (resp != 'n'); // El bucle continúa si el usuario responde 's'

    }

    // Función que imprime las letras adivinadas y los guiones bajos para las letras no adivinadas
    private static void imprimeOculta(char[] tusRespuestas) {
        for (int i = 0; i < tusRespuestas.length; i++) {
            System.out.print(tusRespuestas[i] + " ");
        }
    }

    // Función que pregunta al usuario si quiere volver a jugar y valida la respuesta
    public static char pregunta(String men, Scanner teclado) {
        char resp;
        System.out.println(men + " (s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') { // Valida que la respuesta sea 's' o 'n'
            System.out.println("¡Error! Solo se admite S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp; // Retorna la respuesta validada
    }
}

