
/**
 * Escreva um método que recebe uma matriz de inteiros e um valor inteiro e que determina se o valor inteiro ocorre pelo menos uma vez na matriz.
    public static boolean ocorreValor(int[][] m, int valor) 
 */
import java.util.Scanner;
public class matrizOcorreNumero
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
        System.out.println("Qual número você quer verificar se há ocorrência na matriz?");
        int ocorre = in.nextInt();
        
        if(maiorNumero(matriz, ocorre) == true){
            System.out.println("Sim, há ocorrência do número na matriz.");
        }
        else if(maiorNumero(matriz, ocorre) == false){
            System.out.println("Não há ocorrência do número na matriz.");
        }
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
    public static boolean maiorNumero(int[][] M, int ocorredor){
        boolean ocorre = false;
        for(int lin = 0; lin<M.length; lin++){
            for (int col=0; col<M[0].length; col++){
                if(ocorredor == M[lin][col]){
                    ocorre = true;
                }
            }
        }
        return ocorre;
    }
}
