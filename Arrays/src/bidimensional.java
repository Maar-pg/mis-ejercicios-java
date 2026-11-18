import java.util.Random;

public class bidimensional {
    public static void main(String[] args) {
            int[][] nums = new int[6][10];
            Random rand = new Random();

            // rellenamos la tabla
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 0; j < nums[i].length; j++)
                {
                    int numero=rand.nextInt(1001);

                    //Mientras exista creará nuevo número
                    while(existe(nums,numero))
                    {
                        numero=rand.nextInt(1001);
                    }
                    //Cuando no exista lo guardará
                    nums[i][j] = rand.nextInt(1001);
                }
            }

            // Buscamos max y min empezamos con todos los valores de la primera casilla
            int max = nums[0][0];
            int min = nums[0][0];
            int maxFila = 0;
            int maxColumna = 0;
            int minFila = 0;
            int minColumna = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    //max
                    if (nums[i][j] > max) {
                        max = nums[i][j];
                        maxFila = i;
                        maxColumna = j;
                    }
                    //min
                    if (nums[i][j] < min) {
                        min = nums[i][j];
                        minFila = i;
                        minColumna = j;
                    }
                }
            }

            // Display results
            System.out.println("Max: " + max + " con fila " + maxFila + " columna" + maxColumna);
            System.out.println("Min: " + min + " con fila " + minFila + " columna " + minColumna);
        }


        public static boolean existe(int[][] tabla,int numero)
        {
            boolean encontrado=false;
            for (int i = 0; i < tabla.length; i++)
            {
                for (int j = 0; j < tabla[i].length; j++)
                {
                    if (tabla[i][j]==numero)
                    {
                        encontrado=true;
                        //Hacemos que se salgan de los for llevandolos al límite
                        j=tabla[i].length;

                    }
                }
                //Hacemos que se salgan de los for llevandolos al límite
                if (encontrado)
                {
                    i=tabla.length;
                }

            }
            return encontrado;
    }
}
