/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
for(inicialización; condición de parada; instrucción de actualización){
inicializacion es la variable definida. condicion de parada es cuado el programa va aparar. e instruccion de actualizacion es de cuantos en
cuanto quieres que cambie la variable numero instrucción 1;
   ...
instrucción n;
}
*/
public class MultiplosDe5 {
    public static void main (String[] args){
        System.out.println("Los numeros son: ");
        for (int numero=320; numero>=160; numero-=20){
            System.out.println(numero);
        }
    }
}
