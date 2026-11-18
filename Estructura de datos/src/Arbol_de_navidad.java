// Programa de ejemplo y repaso que muestra cómo crear, modificar, consultar y
// recorrer cuatro estructuras de datos en Java: HashMap, HashSet, Arrays estáticos y ArrayList.

public class Arbol_de_navidad {
    // Creamos una clase que representa un árbol binario
    class ArbolB<T extends Comparable<T>> {
        protected Nodo raiz;

        public ArbolB(ArbolB<Character> izquierdo, Character raizChar, ArbolB<Character> derecho) {
        }

        // Clase interna que representa un nodo del árbol
        protected class Nodo {
            T elemento;
            Nodo izquierdo, derecho;

            Nodo(T elemento) {
                this.elemento = elemento;
                this.izquierdo = null;
                this.derecho = null;
            }


            Nodo(T elemento, Nodo izquierdo, Nodo derecho) {
                this.elemento = elemento;
                this.izquierdo = izquierdo;
                this.derecho = derecho;
            }
        }


        // Constructor para crear un árbol con una raíz
        public ArbolB(T elemento) {
            this.raiz = new Nodo(elemento);
        }


        // Constructor para crear un árbol con una raíz y dos arboles
        public ArbolB(T elemento, ArbolB<T> izquierdo, ArbolB<T> derecho) {
            this.raiz = new Nodo(elemento, izquierdo.raiz, derecho.raiz);
        }


        // Constructor para crear un árbol con una raíz especial (* para una bola)
        public ArbolB(char raiz) {


// Si la raíz es '*', creamos un árbol con un nodo que contiene una bola
            if (raiz == '*')
                this.raiz = new Nodo((T) Character.valueOf(raiz));
            else
                // Si la raíz no es '*', se crea un árbol vacío
                this.raiz = null;
        }


        // Método para verificar si el árbol es correcto
        public boolean esCorrecto() {
            return arbolCorrecto(raiz).esCorrecto;
        }


        // Método recursivo para verificar si el árbol es correcto y contar el número de bolas
        private ResultadoArbol arbolCorrecto(Nodo raiz) {
            if (raiz == null)
                // Si el nodo es nulo, el árbol es correcto y no hay bolas
                return new ResultadoArbol(true, 0);
            else if (raiz.elemento.equals('*'))
                // Si el nodo contiene una bola, el árbol es correcto y hay una bola
                return new ResultadoArbol(true, 1);
            else if (raiz.elemento.equals('.'))
                // Si el nodo es vacío, el árbol es correcto y no hay bolas
                return new ResultadoArbol(true, 0);
            else {
                // Si el nodo contiene un carácter válido, se verifica la corrección de los subárboles
                ResultadoArbol izquierdo = arbolCorrecto(raiz.izquierdo);
                ResultadoArbol derecho = arbolCorrecto(raiz.derecho);
                // Se verifica si el árbol actual es correcto basándose en los subárboles
                boolean correcto = izquierdo.esCorrecto && derecho.esCorrecto && Math.abs(izquierdo.numBolas - derecho.numBolas) <= 1;
                // Se calcula el número total de bolas en el árbol
                int bolas = izquierdo.numBolas + derecho.numBolas;
                return new ResultadoArbol(correcto, bolas);
            }
        }


        // Clase interna que almacena el resultado de la validación del árbol
        private class ResultadoArbol {
            boolean esCorrecto;
            int numBolas;


            ResultadoArbol(boolean esCorrecto, int numBolas) {
                this.esCorrecto = esCorrecto;
                this.numBolas = numBolas;
            }
        }
    }
}
