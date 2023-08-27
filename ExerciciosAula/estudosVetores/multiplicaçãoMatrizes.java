/**
 * Crie um método que recebe duas matrizes de mesmo tamanho e devolve a matriz com a multiplicação das duas matrizes.
    public static int[][] multiplicaMatrizes(int[][] a, int[][] b)
 */
import java.util.Scanner;
public class multiplicaçãoMatrizes
{
   public static void main(){
       Scanner in = new Scanner (System.in);
       
       System.out.println("Qual será o tamanho da sua matriz?");
       int n = in.nextInt();
       
       int[][] matriz1 = new int[n][n];
       int[][] matriz2 = new int[n][n];
       
       System.out.println("Valores da primeira matriz: ");
       for(int lin=0;lin<matriz1.length;lin++)
       {
            for(int col=0;col<matriz1[0].length;col++)
            {
                System.out.printf("\nDigite um inteiro para a posição [%d][%d]",lin,col);
                matriz1[lin][col] = in.nextInt();
                imprimirMatriz(matriz1);
            }
       }
       
       System.out.printf("%n%nValores da segunda matriz: ");
       for(int lin=0;lin<matriz2.length;lin++)
       {
            for(int col=0;col<matriz2[0].length;col++)
            {
                System.out.printf("\nDigite um inteiro para a posição [%d][%d]",lin,col);
                matriz2[lin][col] = in.nextInt();
                imprimirMatriz(matriz2);
            }
       }
       
       System.out.printf("%n%nMultiplicação das matrizes: ");
       imprimirMultiplicação(matriz1, matriz2, n);
       
   }
   
   public static void imprimirMatriz(int[][] m)
   {
                //imprimir matriz
        for(int lin=0; lin<m.length; lin++)
        {            
            System.out.printf("\n");
            for(int col=0; col<m[0].length; col++)
            {
                System.out.printf("  %d  ", m[lin][col]);
            }            
        }
   }
   
   public static int[][] imprimirMultiplicação (int[][]M1, int[][]M2, int N){
       int[][] matriz3 = new int [N][N];
       
       for(int lin=0; lin<matriz3.length; lin++){
           System.out.printf("\n");
           for(int col=0; col<matriz3[0].length; col++){
               matriz3[lin][col] = M1[lin][col] * M2[lin][col];
               System.out.printf("  %d  ", matriz3[lin][col]);
           }
       }
       return matriz3;
   }
}

