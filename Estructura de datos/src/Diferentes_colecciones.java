//Proposito: aprender las diferentes colecciones
import java.util.*;

public class Diferentes_colecciones {

    //Esta funcion comprueba si existe value en mapa, si existe devuelve la clave, si no devuelve 0
    public static Integer getKeyInteger (HashMap<Integer, String> clasificacionCoches, String value) {
        Integer ret = 0;
        if (clasificacionCoches.containsValue(value)) {
            for (Integer k: clasificacionCoches.keySet()){
                if (clasificacionCoches.get(k).equals(value)) {
                    ret = k;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        ArrayList<String> baraja = new ArrayList<String>();
        //Añadimos un nuevo elemento de baraja
        baraja.add("Uno");
        baraja.add("Dos");
        baraja.add("Tres");
        baraja.add("Cuatro");
        //Vamos a imprimir baraja
        System.out.println(baraja.toString());
        System.out.println("-----------------------------------Acceder carta numero 2 con get-----------------------------------------------------------");
        //Vamos a acceder a la carta numero 2, accedemos a la posicion con get
        System.out.println(baraja.get(1));
        System.out.println("-----------------------------------Acceder al tamaño----------------------------------------------------------");
        //Accedemos a ver cual es el tamaño que tenemos
        System.out.println(baraja.size());

        //Añadimos elementos al indice
        baraja.add("Seis");

        //En el indice 4 ponme la carta 5
        System.out.println("-----------------------------------En el espacio 4 pon la carta 5-----------------------------------------------------------");
        baraja.add(4,"Cinco");

        //Vamos a ver los cambios que hemos hecho
        System.out.println(baraja);

        baraja.addAll(List.of("Siete", "Ocho", "Nueve"));
        System.out.println(baraja);

        baraja.set(6, "Sota");
        System.out.println(baraja);

        baraja.remove(3);
        baraja.remove("Dos");
        System.out.println(baraja);

        System.out.println(baraja.subList(2, 5));

        //Añadir más de un elemento a la vez al ArrayList
        baraja.addAll(List.of("Sota", "", "Sota", "", ""));
        System.out.println(baraja);

        //Eliminar elemento si cumple una condicion
        baraja.removeIf(e -> e.isEmpty() || e.equals("Sota"));
        System.out.println(baraja);

        //Convertir ArrayList a Array
        System.out.println(Arrays.toString(baraja.toArray()));

        HashSet<String> baraja2 = new HashSet<String>(List.of("Uno", "Dos", "Tres"));
        System.out.println(baraja2);

        HashSet<String> baraja3 = new HashSet<String>(List.of("Uno", "Dos", "Tres", "dos"));
        System.out.println(baraja3);

        //Única forma de recorrer HashSet
        for (String e: baraja3) {
            System.out.println(e);
        }

        //Trabajando con Diccionarios

        HashMap<Integer, String> clasificacionCoches = new HashMap<>();

        clasificacionCoches.put(1, "Fernando Alonso");
        clasificacionCoches.put(2, "Carlos Sainz");
        clasificacionCoches.put(3, "Lewis Hamilton");

        //Imprimir el hashMap
        System.out.println(clasificacionCoches);

        //Devolver valor de la clave 2
        System.out.println(clasificacionCoches.get(2));

        //Devolver todas las claves
        System.out.println(clasificacionCoches.keySet());

        for (Integer key: clasificacionCoches.keySet()) {
            System.out.println("Entro en la clave "+ key + " con el valor "+clasificacionCoches.get(key));
        }

        //Quiero obtener la clave de Hamilton
        /*
                Integer claveHamilton = 0;
        for (Integer k: clasificacionCoches.keySet()){
            if (clasificacionCoches.get(k) == "Lewis Hamilton") {
                claveHamilton = k;
            }
        }
         */
        System.out.println("Para el caso de Lewis Hamilton, está en la clave: "+getKeyInteger(clasificacionCoches, "Lewis Hamilton"));

        //Comprobar que clasificacionCoches contiene la clave 4, devuelve true / false
        System.out.println(clasificacionCoches.containsKey(4));

        System.out.println(getKeyInteger(clasificacionCoches, "George Russell"));

        System.out.println(clasificacionCoches.entrySet());

        System.out.println(clasificacionCoches.values());

        //ArrayList<String> conductores = new ArrayList<String>(List.of(clasificacionCoches.values()))
    }
}


