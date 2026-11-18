//Enunciado: Suma de arboles enteros
import java.util.Scanner;

public class Arboles_enteros {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            // Mientras resolverCaso devuelva true, sigue ejecutandose
            while (resolverCaso(scanner));
        }

        // Creamos un método para resolver un caso
        public static boolean resolverCaso(Scanner scanner) {
// Leemos dos árboles binarios
            ArbolBinario<Integer> arbol1 = leerArbol(scanner, -1);
            ArbolBinario<Integer> arbol2 = leerArbol(scanner, -1);
// Si los dos árboles están vacíos, se devuelve false para indicar que no hay más casos que resolver
            if (arbol1.esVacio() && arbol2.esVacio())
                return false;
// Sumamos el segundo árbol al primer arbol y mostramos el resultado
            arbol1.sumarArbol(arbol2);
            arbol1.mostrarArbol();
            System.out.println();
// Devolvemos true para indicar que continúamos resolviendo casos
            return true;
        }


        // Creamos un método para leer un árbol desde la entrada estándar
        public static ArbolBinario<Integer> leerArbol(Scanner scanner, int vacio) {
// Leemos el valor de la raíz
            int raiz = scanner.nextInt();


// Si el valor de la raíz es el indicado para un nodo vacío, se crea y devuelve un árbol vacío
            if (raiz == vacio) {
                return new ArbolBinario<>();
            } else {


// Si el nodo es vacío, se leen los subárboles de izquierda a derecha
                ArbolBinario<Integer> izquierdo = leerArbol(scanner, vacio);
                ArbolBinario<Integer> derecho = leerArbol(scanner, vacio);
// Creamos y devuelve un árbol con la raíz y los subárboles leídos
                return new ArbolBinario<>(raiz, izquierdo, derecho);
            }
        }
    }

    // Creamos una clase que representa un árbol
    class ArbolBinario<T extends Integer> {
        protected Nodo raiz;


        // Clase interna que representa un nodo del árbol
        protected class Nodo {
            int elemento;
            Nodo izquierdo, derecho;


            // Creamos un  constructor para un nodo sin hijos
            Nodo(T elemento) {
                this.elemento = elemento;
                this.izquierdo = null;
                this.derecho = null;
            }


            // Constructor para un nodo con hijos
            Nodo(T elemento, Nodo izquierdo, Nodo derecho) {
                this.elemento = elemento;
                this.izquierdo = izquierdo;
                this.derecho = derecho;
            }
        }


        // Constructor para un árbol vacío
        public ArbolBinario() {
            this.raiz = null;
        }


        // Constructor para un árbol con una sola raíz
        public ArbolBinario(T elemento) {
            this.raiz = new Nodo(elemento);
        }


        // Constructor para un árbol con raíz y subárboles
        public ArbolBinario(T elemento, ArbolBinario<T> izquierdo, ArbolBinario<T> derecho) {
            this.raiz = new Nodo(elemento, izquierdo.raiz, derecho.raiz);
        }


        // Método para verificar si el árbol está vacío
        public boolean esVacio() {
            return raiz == null;
        }


        // Método para mostrar el árbol en preorden
        public void mostrarArbol() {
            mostrar(raiz);
        }


        // Método auxiliar para mostrar el árbol en preorden
        private void mostrar(Nodo nodo) {
            if (nodo != raiz) System.out.print(" ");
            if (nodo != null) {
                System.out.print(nodo.elemento);
                mostrar(nodo.izquierdo);
                mostrar(nodo.derecho);
            } else {
                System.out.print(-1);
            }
        }


        // Método para sumar otro árbol al árbol actual
        public void sumarArbol(ArbolBinario<T> otroArbol) {
            sumar(raiz, otroArbol.raiz);
        }


        // Método auxiliar para sumar nodos de ambos árboles
        private void sumar(Nodo nodo1, Nodo nodo2) {
            if (nodo1 != null && nodo2 != null) {
                // Sumar los valores de los nodos y llamar recursivamente para los hijos
                nodo1.elemento = (Integer) nodo1.elemento + (Integer) nodo2.elemento;
                sumar(nodo1.izquierdo, nodo2.izquierdo);
                sumar(nodo1.derecho, nodo2.derecho);
            } else if (nodo1 == null && nodo2 != null) {
                // Si el nodo1 es null pero nodo2 no lo es, se copia nodo2 en nodo1
                nodo1 = nodo2;
            }
    }
}

