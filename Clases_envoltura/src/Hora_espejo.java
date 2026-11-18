// Dada una hora en formato HH:MM (de 0 a 12 horas), valida que el formato sea correcto
// y calcula su hora reflejada en un espejo, mostrándola siempre con dos dígitos.
import java.util.Scanner; // Importa Scanner para leer texto por consola (se limpiaron los imports repetidos/sin usar)

public class Hora_espejo {
    public static void main(String[] args) {
        // Bloque try-catch: protege el programa si el usuario mete letras, falta ":" o la hora no es válida
        try {
            int minutos, horas, cMinuto, cHora;
            String tiempo = "";
            Scanner entrada = new Scanner(System.in);

            String[] horasTiempo;
            System.out.println("Dime la hora: ");
            tiempo = entrada.nextLine(); // Leemos la hora completa como texto (ej. "03:45")

            // Dividimos el texto en dos partes usando ":" como separador
            horasTiempo = tiempo.split(":");

            // CLASE DE ENVOLTURA: convertimos las cadenas de texto a números enteros (int)
            horas = Integer.parseInt(horasTiempo[0]);
            minutos = Integer.parseInt(horasTiempo[1]);

            // Validamos que las horas estén en el rango de un reloj de 12 horas (0 a 12)
            if (horas > 12 || horas < 0) {
                throw new Exception(); // Fuerza el salto inmediato al bloque catch
            }
            // Validamos que los minutos estén en el rango válido (0 a 59)
            if (minutos > 59 || minutos < 0) {
                throw new Exception(""); // Fuerza el salto inmediato al bloque catch
            }

            // Calculamos el reflejo de los minutos retrocediendo el doble de su valor en ciclo de 60 (0..59)
            cMinuto = minutos * 2;
            while (cMinuto > 0) {
                if (minutos < 0) {
                    minutos = 59; // Si baja de 0, da la vuelta al 59
                }
                minutos = minutos - 1;
                cMinuto = cMinuto - 1;
            }
            // Ajuste final por si el último paso dejó los minutos en -1
            if (minutos < 0) {
                minutos = 59;
            }

            // Calculamos el reflejo de las horas retrocediendo el doble de su valor en ciclo de 12 (1..12)
            cHora = horas * 2;
            while (cHora > 0) {
                if (horas <= 0) {
                    horas = 12; // Si llega a 0, da la vuelta a las 12
                }
                horas = horas - 1;
                cHora = cHora - 1;
            }
            // Ajuste final por si el último paso dejó las horas en 0
            if (horas <= 0) {
                horas = 12;
            }

            // Convertimos los números enteros de vuelta a texto (String) para darles formato
            String hora, minuto;
            hora = String.valueOf(horas);
            minuto = String.valueOf(minutos);

            // Si la hora o el minuto tienen un solo dígito (ej. "8"), añadimos un "0" delante ("08")
            if (hora.length() == 1) {
                hora = "0" + hora;
            }
            if (minuto.length() == 1) {
                minuto = "0" + minuto;
            }

            // Mostramos el resultado final formateado
            System.out.println("La hora espejo es: " + hora + ":" + minuto);

        } catch (Exception exception) {
            // Se ejecuta si ocurre cualquier fallo al convertir números, dividir el texto o validar rangos
            System.out.println("Hay que poner una hora válida");
        }
    }
}
