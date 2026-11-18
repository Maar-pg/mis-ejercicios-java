import java.util.Scanner;

//Imagina que tienes un reloj analógico de agujas delante de un espejo y quieres
// saber qué hora parecería marcar si lo miraras a través del reflejo.
public class Reloj_analojico {
    public static void main(String[] args) {

            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Declaración de variables
            long numRegalo, numEnvoltorios, numChicles, numComidos, numEnvoltoriosRestantes;

            while (true) { // Bucle infinito para permitir múltiples ejecuciones
                // Inicialización de contadores
                numComidos = 0;
                numEnvoltoriosRestantes = 0;

                // Solicitar el número de envoltorios necesarios para un regalo
                System.out.print("Ingrese el número de envoltorios: ");
                numEnvoltorios = scanner.nextLong();

                // Si el número de envoltorios es 0, termina el bucle (lógica por implementar)
                if (numEnvoltorios == 0) {
                    break; // Termina el bucle si numEnvoltorios es 0
                }

                // Solicitar el número de regalos obtenidos por los envoltorios
                System.out.print("Ingrese el número de regalos: ");
                numRegalo = scanner.nextLong();

                // Solicitar el número inicial de chicles
                System.out.print("Ingrese el número de chicles: ");
                numChicles = scanner.nextLong();

                // Verificar condiciones específicas
                if (numRegalo >= numEnvoltorios && numChicles >= numEnvoltorios) {
                    // Si se cumplen ambas condiciones, el resultado es "RUINA"
                    System.out.println("RUINA");
                } else if (numRegalo == 0) {
                    // Si no se obtienen regalos (numRegalo es 0), solo se pueden comer los chicles iniciales
                    numComidos = numChicles;
                    System.out.printf("%d %d\n", numComidos, numChicles);
                } else {
                    // Calcular la cantidad de chicles que se pueden comer y los envoltorios restantes
                    while (numChicles > 0) {
                        numComidos += numChicles; // Acumular el número de chicles comidos
                        numEnvoltoriosRestantes += numChicles; // Acumular los envoltorios obtenidos
                        numChicles = 0; // Restablecer el número de chicles

                        // Calcular el número de nuevos chicles obtenidos con los envoltorios restantes
                        numChicles = numEnvoltoriosRestantes / numEnvoltorios * numRegalo;
                        // Calcular los envoltorios restantes después de canjear por regalos
                        numEnvoltoriosRestantes -= numEnvoltoriosRestantes / numEnvoltorios * numEnvoltorios;
                    }
                    // Imprimir el total de chicles comidos y los envoltorios restantes
                    System.out.printf("%d %d\n", numComidos, numEnvoltoriosRestantes);
                }
            }
    }
}

