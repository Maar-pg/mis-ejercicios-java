// Dados los envoltorios necesarios para un canje, los chicles de regalo por canje y los chicles
// iniciales, calcula el total de chicles comidos y los envoltorios sobrantes (o imprime "RUINA" si
// el canje es infinito).
import java.util.Scanner; // Importa la herramienta para leer datos desde el teclado
public class Cuantos_chicles_como {
    public static void main(String[] args) {

            // Creamos el lector para recibir los números por consola
            Scanner scanner = new Scanner(System.in);

            // Declaramos todas las variables como tipos primitivos 'long' (no son clases de envoltura)
            long numRegalo, numEnvoltorios, numChicles, numComidos, numEnvoltoriosRestantes;

            // Estructura de control (Bucle infinito): repite casos de prueba hasta que se corte con break
            while (true) {
                // Reiniciamos los contadores al empezar cada nuevo caso
                numComidos = 0;
                numEnvoltoriosRestantes = 0;

                System.out.print("Ingrese el número de envoltorios: ");
                numEnvoltorios = scanner.nextLong(); // Cuántos envoltorios pide la tienda para un canje

                // Condicional de salida (OJO: falta escribir 'break;' dentro de las llaves para que salga)
                if (numEnvoltorios == 0) {
                    // break; <-- Debería ir aquí para terminar el programa al introducir 0
                }

                System.out.print("Ingrese el número de regalos: ");
                numRegalo = scanner.nextLong(); // Cuántos chicles te regalan por cada canje

                System.out.print("Ingrese el número de chicles: ");
                numChicles = scanner.nextLong(); // Cuántos chicles tienes al principio

                // Condicional múltiple (if / else if / else): evalúa los tres escenarios posibles
                if (numRegalo >= numEnvoltorios && numChicles >= numEnvoltorios) {
                    // Escenario 1: te dan tantos o más chicles de los que entregas, el canje es infinito
                    System.out.println("RUINA");

                } else if (numRegalo == 0) {
                    // Escenario 2: la promoción no da regalos, así que solo comes los chicles iniciales
                    numComidos = numChicles;
                    System.out.printf("%d %d\n", numComidos, numChicles);

                } else {
                    // Escenario 3: vamos comiendo y canjeando en rondas mientras nos queden chicles
                    while (numChicles > 0) {
                        numComidos += numChicles;             // Sumamos los chicles comidos en esta ronda
                        numEnvoltoriosRestantes += numChicles; // Cada chicle comido genera 1 envoltorio

                        // Calculamos cuántos chicles nuevos conseguimos canjeando los envoltorios acumulados
                        numChicles = (numEnvoltoriosRestantes / numEnvoltorios) * numRegalo;

                        // Restamos únicamente los envoltorios que hemos gastado en esos canjes
                        numEnvoltoriosRestantes -= (numEnvoltoriosRestantes / numEnvoltorios) * numEnvoltorios;
                    }
                    // Imprimimos el total de chicles comidos y los envoltorios que sobraron sin poder canjear
                    System.out.printf("%d %d\n", numComidos, numEnvoltoriosRestantes);
                }
            }
    }
}

