import java.util.Random;
import java.util.Scanner;
public class matriz1Prof
{
    public static void main()
    {
        //cria matriz de inteiros com 2 linhas x 4 colunas
        int[][] matriz = new int[2][4];
        
        System.out.println(matriz.length); //numero de linhas
        System.out.println(matriz[0].length); //numero de colunas
        
        Scanner t = new Scanner(System.in);
        for(int lin=0;lin<matriz.length;lin++)
        {
            for(int col=0;col<matriz[0].length;col++)
            {
                System.out.printf("\nDigite um inteiro para a posição [%d][%d]",lin,col);
                matriz[lin][col] = t.nextInt();
                imprimirMatriz(matriz);
            }
        }
 
        
        //imprimir a soma de todos os valores da matriz
        int soma = 0;
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<4; j++)
            {
                soma = soma + matriz[i][j];
            }
        }
        System.out.printf("\n Soma = %d ", soma);
        
        
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
    
    
}
