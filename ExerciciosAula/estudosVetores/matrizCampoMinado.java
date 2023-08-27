/**
 Crie um método que constrói uma matriz de caracteres de tamanho 80 x 100 onde algumas células possuem o carácter de espaço em branco e outras células possuem o carácter 'x'. 
 A decisão de escolher se a célula é um espaço ou um 'x' deve ser aleatória. Use o método do exercício anterior para verificar a sua resposta.
 */
import java.util.Random;
public class matrizCampoMinado
{
    public static void main(){
        Random gerador = new Random();
        char[][] matriz = new char[80][100];
        int random = gerador.nextInt(2 - 1 + 1) + 1;
        
        for(int lin = 0; lin<matriz.length; lin++){
            for(int col = 0; col<matriz[0].length; col++){
                int umOuDois = random;
                if(umOuDois == 1){
                    matriz[lin][col] = ' ';
                }
                else if(umOuDois == 2){
                    matriz[lin][col] = 'x';
                }
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
