import java.util.Scanner;
public class matrizMaiorValor
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o tamanho da sua matriz: ");
        int n = in.nextInt();
        int[][] matriz = new int[n][n];
        for(int lin=0;lin<matriz.length;lin++)
        {
            for(int col=0;col<matriz[0].length;col++)
            {
                System.out.printf("\nDigite um inteiro para a posição [%d][%d]",lin,col);
                matriz[lin][col] = in.nextInt();
                imprimirMatriz(matriz);
            }
        }
        
        System.out.printf("O maior número da matriz é %d", maiorNumero(matriz));
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
    public static int maiorNumero(int[][] M){
        int maior = M[0][0];
        for(int lin = 0; lin<M.length; lin++){
            for (int col=0; col<M[0].length; col++){
                if(maior < M[lin][col]){
                    maior = M[lin][col];
                }
            }
        }
        return maior;
    }
}
