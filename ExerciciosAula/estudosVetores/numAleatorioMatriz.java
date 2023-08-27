/**
 * Crie um método que retorna uma matriz n x n de números aleatórios inteiros entre o intervalo fechado [min,max].
 */
import java.util.Scanner;
import java.util.Random;
public class numAleatorioMatriz
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.printf("Digite o tamanho da sua matriz: ");
        int N = in.nextInt();
        
        System.out.printf("%nDigite o número aleatório mínimo que fará parte da matriz: ");
        int MIN = in.nextInt();
        
        System.out.printf("%nDigite o número aleatório máximo que fará parte da matriz: ");
        int MAX = in.nextInt();
        
        geraMatrizIntervalo(N, MIN, MAX);
    }
    public static int[][] geraMatrizIntervalo(int n, int min, int max){
        Random gerador = new Random();
        int[][] matriz = new int[n][n];
        
        for(int lin = 0; lin<matriz.length; lin++){
            System.out.printf("\n");
            for(int col=0; col<matriz[0].length; col++){
                System.out.printf("  %d  ",gerador.nextInt(max - min + 1) + min);
            }
        }
        return matriz;
    }
}
