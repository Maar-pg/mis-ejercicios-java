//Clase: ejemplos de estructuras: HashMap, HashSet, ArrayList

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Ejemplos_estructurados {

        public static void main (String[] args) {
            // Imprime separadores
            System.out.println("*****");
            System.out.println("*****");
            System.out.println();

            // Ejemplo de HashMap
            System.out.println("Ejemplo de HashMap:");
            // Crear HashMap
            HashMap<String, Integer> hash1 = new HashMap();
            // Añadir elementos
            hash1.put("yo", 37000);
            hash1.put("Paula", 40000);
            hash1.put("Pepe", 60000);
            hash1.put("Dani", 65000);
            System.out.println(hash1);
            // Obtener el salario de "yo"
            System.out.println(hash1.get("yo"));
            // Eliminar un valor del hashMap
            hash1.remove("yo");
            System.out.println(hash1);
            // Comprobar si el HashMap contiene a "Pepe"
            if (hash1.containsKey("Pepe")) {
                System.out.println("En el HashMap está el usuario Pepe y su valor es " + hash1.get("Pepe"));
            } else {
                System.out.println("El hashMap no contiene a Pepe");
            }
            System.out.println("--Recorriendo el HashMap--");
            // Recorrer el HashMap
            for (String indice : hash1.keySet()) {
                System.out.println(hash1.get(indice));
            }
            System.out.println("--Buscando valor en el HashMap--");
            // Comprobar si algún usuario tiene valor 65000
            boolean estaOno = hash1.containsValue(65000);

            if (estaOno == true) {
                System.out.println("El valor está");
            } else {
                System.out.println("El valor no está");
            }
            System.out.println("*****");
            System.out.println("*****");
            System.out.println();

            // Ejemplo de HashSet
            System.out.println("Ejemplo de HashSet:");
            // Crear HashSet
            HashSet<Integer> lista = new HashSet<>(List.of(4, 1, 9, 6));
            // Añadir el 3
            lista.add(3);
            System.out.println(lista);
            // Eliminar el 1
            lista.remove(1);
            System.out.println(lista);
            // Recorrer el HashSet
            System.out.println("--Vamos a recorrer el HashSet--: ");
            // Usando foreach
            for (Integer numero : lista) {
                System.out.println(numero);
            }
            // Comprobar si un valor está o no
            System.out.println("--Comprobar si un valor está o no--");
            boolean estaOno2 = lista.contains(5);
            if (estaOno2 == true) {
                System.out.println("El valor está");
            } else {
                System.out.println("El valor no está");
            }
            System.out.println("*****");
            System.out.println("*****");
            System.out.println();

            // Ejemplo de Arrays
            System.out.println("--Arrays--");

            int[] array = new int[5]; // Definir Array de tamaño 5(NO SE PUEDE MODIFICAR). Solo puede haber un tipo
            // Insertar valores en el array
            System.out.println("--Creo el array--: ");
            array[0]=1;
            array[1]=2;
            array[2]=0;
            array[3]=4;
            array[4]=5;
            // Recorrer el array
            // For normal
            System.out.println("--For normal--");
            for (int i = 0; i <array.length;i++){
                System.out.println(array[i]);
            }
            System.out.println("--Foreach--");
            // For each
            for(int i: array){
                System.out.println(i);
            }
            System.out.println("--ArrayList--");
            // Definir ArrayList. NO se tiene que indicar tamaño
            List<Integer> listaNumeros = new ArrayList<>();
            // Añadir números al ArrayList
            listaNumeros.add(2);
            listaNumeros.add(1);
            listaNumeros.add(5);
            listaNumeros.add(9);
            listaNumeros.add(3);
            listaNumeros.add(9);
            System.out.println(listaNumeros);

            // Recorrer ArrayList

            // For normal
            System.out.println("--For normal--");
            for (int i = 0;i<listaNumeros.size();i++){
                System.out.println(listaNumeros.get(i));
            }

            // Foreach

            System.out.println("--Foreach--");

            for (int i : listaNumeros){
                System.out.println(i);
            }
        }
}
