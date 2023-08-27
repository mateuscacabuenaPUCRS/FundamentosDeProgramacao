import java.util.Scanner;
public class retornaNxNdiagonal
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite apenas um valor que será as linhas e colunas da sua matriz: ");
        int n = in.nextInt();
        int[][] m = new int [n][n];
        
        diagonal(n);
        
    }
    public static int[][] diagonal(int N){
        int[][] M = new int [N][N];
        for (int lin=0; lin<M.length; lin++){
            System.out.printf("\n");
            for(int col=0; col<M[0].length; col++){
                if(lin==col){
                    System.out.printf("  1  ");
                }
                else{
                    System.out.printf("  0  ");
                }
            }
        }
        return M;
    }
}