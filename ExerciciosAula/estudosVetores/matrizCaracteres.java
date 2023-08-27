/**
 *  Crie um método que imprime uma matriz de caracteres.
    public static void imprimeMatrizChar(char[][] m)
 */
import java.util.Scanner;
public class matrizCaracteres
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        System.out.println("Qual será o tamanho da sua matriz?"); 
        int n = in.nextInt();
       
        char[][] matriz = new char[n][n];
        for(int lin = 0; lin<matriz.length; lin++){
            for(int col = 0; col<matriz[0].length; col++){
                System.out.printf("%nDigite uma letra para a posição [%d][%d]", lin, col);
                matriz[lin][col] = in.next().charAt(0);
                imprimeMatrizChar(matriz);
            }
        }
    }
    public static void imprimeMatrizChar(char[][] m){
        for (int lin = 0; lin<m.length; lin++){
            System.out.printf("%n");
            for(int col = 0; col<m[0].length; col++){
                System.out.printf("   %s   ", m[lin][col]);
            }
        }
    }
}
