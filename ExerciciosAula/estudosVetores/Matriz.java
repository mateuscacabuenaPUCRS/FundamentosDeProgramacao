import java.util.ArrayList;
import java.util.List;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[][]{
                {1,2,3,4},
                {3,4,5,6},
                {6,7,8,9}};
        List<Integer> repetidos = new ArrayList<Integer>();

        //percorre a matriz, elemento por elemento
        for(int i=0; i<matriz.length; i++) {
            proximoElemento:
            for(int j=0; j<matriz[i].length; j++) {
                //caso elemento já foi marcado como repetido
                //continua para a próxima iteração
                if(repetidos.contains(matriz[i][j])) continue proximoElemento;

                //percorre novamente a matriz, elemento por elemento
                //começando do elemento atual da iteração mais externa 
                for(int i2=i; i2<matriz.length; i2++) {
                    for(int j2=0; j2<matriz[i2].length; j2++) {
                        //não se compara com ele mesmo
                        if(i==i2 && j==j2) break;
                        //achamos um repetido, armazena e 
                        //continua para a próxima iteração 
                        if(matriz[i][j] == matriz[i2][j2]) {
                            repetidos.add(matriz[i][j]);
                            continue proximoElemento;
                        }
                    }
                }
            }
        }

        //exibe os elementos encontrados repetidos ao menos uma vez
        for(int r: repetidos) {
            System.out.println(r);
        }
    }
}